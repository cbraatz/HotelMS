package imp;
import Hiber1.Motivoajuste;
import Hiber1.NewHibernateUtil;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.hibernate.*;
 

public class MotivoUtiGest {

   public MotivoUtiGest(){
        this.sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
   }

   Session sesion = null;
   public boolean existe=false;  //campo que señala si la ultima busqueda dio true o false
   private Motivoajuste muti=null; //guarda el objeto de la ultima busqueda

   public Motivoajuste GetObjMotivouti(){
       return muti;
   }
    public void CERRARSesion(){
       if(this.sesion.isOpen()){
          sesion.clear();
          sesion.close();
       }
    }

    public boolean cargarCamposPorDefecto(){
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx1=sesion.beginTransaction();
            muti=new Motivoajuste();
            muti.setIdmoti(1);
            muti.setDescrimoti("DESCUENTO POR PÉRDIDA");
            muti.setAumenta('0');
            muti.setEgreso('1');
            sesion.saveOrUpdate(muti);
            muti=new Motivoajuste();
            muti.setIdmoti(2);
            muti.setDescrimoti("DESCUENTO POR MERMA");
            muti.setAumenta('0');
            muti.setEgreso('1');
            sesion.saveOrUpdate(muti);
            muti=new Motivoajuste();
            muti.setIdmoti(3);
            muti.setDescrimoti("AUMENTO POR AJUSTE DE STOCK");
            muti.setAumenta('1');
            muti.setEgreso('0');
            sesion.saveOrUpdate(muti);
            tx1.commit();
            CERRARSesion();
            return true;
        }catch(HibernateException ex){
            return false;
        }
    }
    public int getsiguientecodigo(){

        int siguientecodigo=0;
        Transaction tx4=null;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx4=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(idmoti)from Motivoajuste");
            if(Integer.parseInt(q.list().get(0).toString())==0){
                siguientecodigo=1;
            } else {
                Query qq= sesion.createQuery("select max(idmoti)from Motivoajuste");
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
            //tx4.commit();  //guarda los cambios hechos en la transaccion, en este caso no seria necesario
            CERRARSesion();
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo =0;
           // tx4.rollback();  //vuelve al estado anterior en caso de que de error

        }finally{
            return siguientecodigo;
        }

   }

public boolean addMotivouti(Motivoajuste obj){
      //devuelve true si la transaccion es exitosa
      //false si no lo es
      boolean resp=false;
      Transaction tx1=null;
      try{
        this.sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx1=sesion.beginTransaction();
        sesion.save(obj);
        tx1.commit();   //si todo anda bien se ejecuta
        CERRARSesion();
        resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          e.printStackTrace();
          tx1.rollback();
          JOptionPane.showMessageDialog(null,"Ha ocurrido un error al CARGAR el registro a la Base de Datos","ERROR AL AGREGAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      finally{
          return resp;
      }

    }

    public boolean editMotivouti(Motivoajuste obj){
      //devuelve true si la transaccion es exitosa
      //false si no lo es
      Transaction tx2=null;
      boolean resp=false;
      try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx2=sesion.beginTransaction();
            sesion.saveOrUpdate(obj); 
            tx2.commit();   //si todo anda bien se ejecuta
            CERRARSesion();
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          e.printStackTrace();
          tx2.rollback();
          JOptionPane.showMessageDialog(null,"Ha ocurrido un error al EDITAR el registro","ERROR AL EDITAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      finally{
          return resp;
      }

    }

    public boolean delMotivouti(Motivoajuste obj){
      //devuelve true si la transaccion es exitosa false si no lo es
      Transaction tx3=null;
      boolean resp=false;
      try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx3=sesion.beginTransaction();
            sesion.delete(obj); 
            tx3.commit();   //si todo anda bien se ejecuta
            CERRARSesion();
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          e.printStackTrace();
          tx3.rollback();
          JOptionPane.showMessageDialog(null,"Ha ocurrido un error al BORRAR el registro","ERROR AL BORRAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      finally{
          return resp;
      }

    }
    public boolean ExisteIdEnTabla(int id){
    Transaction tx5=null;
    try{
        this.sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx5=sesion.beginTransaction();
        Query q=sesion.createQuery("from Motivoajuste where idmoti = "+Integer.toString(id));
        if(q.list().isEmpty()){  //si no se encontro
            existe=false;
            this.muti=new Motivoajuste();
        }
        else{
            existe=true;
            this.muti=(Motivoajuste)q.list().get(0); //el primer elemento de la lista

        }
        tx5.commit();
        CERRARSesion();
    }
    catch(HibernateException h){
            h.printStackTrace();
            existe=false;
            tx5.rollback();  //vuelve al estado anterior en caso de que de error
        }finally{
            return existe;
        }
    }
}

