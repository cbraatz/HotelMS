package imp;
  
import Hiber1.NewHibernateUtil;
import Hiber1.Estado;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.hibernate.*;


public class EstadoGest {

   public EstadoGest(){
      this.sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
   }

   Session sesion = null;
   public boolean existe=false;  //campo que señala si la ultima busqueda dio true o false
   private Estado est=null; //guarda el objeto de la ultima busqueda

   public Estado GetObjEstado(){
       return est;
   }
    public void CERRARSesion(){
       if(this.sesion.isOpen()){
          sesion.clear();
          sesion.close();
       }
    }
    public boolean cargarCamposPorDefecto(){
        boolean re=false;
        try{
            ///////////////////////guarda LIBRE///////////////////////////////////
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx1=sesion.beginTransaction();
            Estado estado=new Estado();
            estado.setIdestado(0);
            estado.setDescripest("LIBRE");
            sesion.saveOrUpdate(estado);
            tx1.commit();
            CERRARSesion();
            ///////////////////////guarda WEB1///////////////////////////////////
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx2=sesion.beginTransaction();
            estado=new Estado();
            estado.setIdestado(1);
            estado.setDescripest("RESERVA POR WEB NO SEGURA");
            sesion.saveOrUpdate(estado);
            tx2.commit();
            CERRARSesion();
            ///////////////////////guarda WEB2///////////////////////////////////
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx3=sesion.beginTransaction();
            estado=new Estado();
            estado.setIdestado(2);
            estado.setDescripest("RESERVA POR WEB SEGURA");
            sesion.saveOrUpdate(estado);
            tx3.commit();
            CERRARSesion();
            ///////////////////////guarda RESERVADO///////////////////////////////////
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx4=sesion.beginTransaction();
            estado=new Estado();
            estado.setIdestado(3);
            estado.setDescripest("RESERVADO EN MESA DE ENTRADA");
            sesion.saveOrUpdate(estado);
            tx4.commit();
            CERRARSesion();
            ///////////////////////guarda asegurado///////////////////////////////////
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx5=sesion.beginTransaction();
            estado=new Estado();
            estado.setIdestado(4);
            estado.setDescripest("RESERVADO Y CONFIRMADO");
            sesion.saveOrUpdate(estado);
            tx5.commit();
            CERRARSesion();
            ///////////////////////guarda OCUPADO///////////////////////////////////
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx6=sesion.beginTransaction();
            estado=new Estado();
            estado.setIdestado(5);
            estado.setDescripest("OCUPADO");
            sesion.saveOrUpdate(estado);
            tx6.commit();
            CERRARSesion();
            re=true;
        }catch(HibernateException ex){
            re=false;
        }
        return re;
    }
    public int getsiguientecodigo(){

        int siguientecodigo=0;
        Transaction tx4=null;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx4=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(idestado)from Estado");
            if(Integer.parseInt(q.list().get(0).toString())==0){
                cargarCamposPorDefecto();
                siguientecodigo=5;
            } else {
                Query qq= sesion.createQuery("select max(idestado)from Estado");
                siguientecodigo=Integer.parseInt(qq.list().get(0).toString());
                if (siguientecodigo < 2147483647){  //si no exede el rango de un entero
                   if(siguientecodigo>4)
                        siguientecodigo=siguientecodigo+1;
                   else{
                        cargarCamposPorDefecto();
                        siguientecodigo=5;
                   }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Número máximo de registros alcanzado","NO SE PUEDEN CARGAR MÁS REGISTROS",JOptionPane.INFORMATION_MESSAGE);
                    siguientecodigo=0;
                }
            }
           // tx4.commit();  //guarda los cambios hechos en la transaccion, en este caso no seria necesario
            CERRARSesion();
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo =0;
           // tx4.rollback();  //vuelve al estado anterior en caso de que de error

        }finally{
            return siguientecodigo;
        }

   }

public boolean addEstado(Estado obj){
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

    public boolean editEstado(Estado obj){
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

    public boolean delEstado(Estado obj){
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
        Query q=sesion.createQuery("from Estado where idestado = "+Integer.toString(id));
        if(q.list().isEmpty()){  //si no se encontro
            existe=false;
            this.est=new Estado();
        }
        else{
            existe=true;
            this.est=(Estado)q.list().get(0); //el primer elemento de la lista

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

