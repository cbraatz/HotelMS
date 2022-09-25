package imp;
import Hiber1.Subresxmul;
import Hiber1.NewHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SubresxmulGest{
    Session sesion=null;
    Subresxmul suxmu=null;
    public void SubresxmulGest(){  //constructor
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
 
    public boolean ExisteFKMulta(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Subresxmul where idmulta = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
   }

    public boolean ExisteFKSubreserva(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Subresxmul where idsubres = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
   }

    public void CERRARSesion(){
       if(this.sesion.isOpen()){
          sesion.clear();
          sesion.close();
       }
    }
    
    public int getsiguientecodigo(){

        int siguientecodigo=0;
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx=null;
        try{
            tx=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(id2)from Subresxmul");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(id2)from Subresxmul");
                siguientecodigo=Integer.parseInt(qq.list().get(0).toString());
                if (siguientecodigo < 2147483647){  //si no exede el rango de un entero
                    siguientecodigo=siguientecodigo+1;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Número máximo de registros alcanzado","NO SE PUEDEN CARGAR MÁS REGISTROS",JOptionPane.INFORMATION_MESSAGE);
                    siguientecodigo=0;
                }
            }
            tx.commit();  //guarda los cambios hechos en la transaccion, en este caso no seria necesario
            if(sesion.isOpen()){
                sesion.clear();
                sesion.close();
            }
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo =0;
            if (sesion.getTransaction() != null)
                tx.rollback();  //vuelve al estado anterior en caso de que de error
        }finally{
            return siguientecodigo;
        }
   }

    public boolean existeMultaEnSubreserva(int idmul, int idsu){
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        boolean encontrado=false;
        Transaction tx2=null;
        try{
           tx2=sesion.beginTransaction();
           Query qq=sesion.createQuery("from Subresxmul where idmulta = "+idmul+" and idsubres = "+idsu);
           if(qq.list().size()>0){ //si no se encontro
                encontrado=true;
                suxmu=(Subresxmul) qq.list().get(0);
           }else{
                encontrado=false;
                suxmu=new Subresxmul();
           }
        }
        catch(HibernateException e){
            e.printStackTrace();
        }
        if(sesion.isOpen()){
            sesion.clear();
            sesion.close();
        }
        return encontrado;
    }
    public Subresxmul getMiSubresxmul(){
        return this.suxmu;
    }
    public boolean addSubresxmul(Subresxmul obj){
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

    public boolean editSubresxmul(Subresxmul obj){
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

    public boolean delSubresxmul(Subresxmul obj){
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
}