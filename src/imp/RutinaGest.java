package imp;

import Hiber1.Rutina;
import Hiber1.NewHibernateUtil;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.hibernate.*;


public class RutinaGest {

   public RutinaGest(){
        this.sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
   }
 
   Session sesion = null;
   public boolean existe=false;  //campo que señala si la ultima busqueda dio true o false
   private Rutina rut=null; //guarda el objeto de la ultima busqueda

   public Rutina GetObjRutina(){
       return rut;
   }
    public void CERRARSesion(){
       if(this.sesion.isOpen()){
          sesion.clear();
          sesion.close();
       }
    }
    public boolean ExisteFKHabitacion(int id){
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Rutina where idhabit = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }

    public boolean ExisteRutinaDeEmpleado(int idemp){
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Rutina where idempleado = "+Integer.toString(idemp));
        if(q.list().isEmpty()==false){
            this.rut=(Rutina) q.list().get(0);
            return true;
        }else{
            this.rut=new Rutina();
            return false;
        }
    }

    public int getsiguientecodigo(){

        int siguientecodigo=0;
        Transaction tx4=null;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx4=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(idrut)from Rutina");
            if(Integer.parseInt(q.list().get(0).toString())==0){
                siguientecodigo=1;
            } else {
                Query qq= sesion.createQuery("select max(idrut)from Rutina");
                siguientecodigo=Integer.parseInt(qq.list().get(0).toString());
                if (siguientecodigo < 2147483647){  //si no exede el rango de un entero
                   if(siguientecodigo>0)
                        siguientecodigo=siguientecodigo+1;
                   else{
                        siguientecodigo=1;
                   }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Número máximo de registros alcanzado","NO SE PUEDEN CARGAR MÁS REGISTROS",JOptionPane.INFORMATION_MESSAGE);
                    siguientecodigo=0;
                }
            }
            tx4.commit();  //guarda los cambios hechos en la transaccion, en este caso no seria necesario
            CERRARSesion();
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo =0;
            tx4.rollback();  //vuelve al estado anterior en caso de que de error

        }finally{
            return siguientecodigo;
        }

   }
}

