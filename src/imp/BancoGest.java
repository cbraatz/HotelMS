package imp;
  
import Hiber1.*;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.hibernate.*;


public class BancoGest {

   public BancoGest(){
        this.sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
   }

   Session sesion = null;
   public boolean existe=false;  //campo que señala si la ultima busqueda dio true o false
   private Banco objBanco=null; //guarda el objeto banco de la ultima busqueda

   public boolean cargarCamposPorDefecto(){
        boolean re=false;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx1=sesion.beginTransaction();
            Banco ban=new Banco();
            ban.setIdbanco(1);
            ban.setNombrebanco("REGIONAL");
            ban.setDireccionban("");
            ban.setTelefban("");
            sesion.saveOrUpdate(ban);
            ban=new Banco();
            ban.setIdbanco(2);
            ban.setNombrebanco("ITAPÚA");
            ban.setDireccionban("");
            ban.setTelefban("");
            sesion.saveOrUpdate(ban);
            ban=new Banco();
            ban.setIdbanco(3);
            ban.setNombrebanco("BBVA");
            ban.setDireccionban("");
            ban.setTelefban("");
            sesion.saveOrUpdate(ban);
            ban=new Banco();
            ban.setIdbanco(4);
            ban.setNombrebanco("HSBC");
            ban.setDireccionban("");
            ban.setTelefban("");
            sesion.saveOrUpdate(ban);
            ban=new Banco();
            ban.setIdbanco(5);
            ban.setNombrebanco("CONTINENTAL");
            ban.setDireccionban("");
            ban.setTelefban("");
            sesion.saveOrUpdate(ban);
            ban=new Banco();
            ban.setIdbanco(6);
            ban.setNombrebanco("ITAÚ");
            ban.setDireccionban("");
            ban.setTelefban("");
            sesion.saveOrUpdate(ban);
            tx1.commit();
            CERRARSesion();
            re=true;
        }catch(HibernateException ex){
            ex.printStackTrace();
            re=false;
        }
        return re;
    }
   public Banco GetObjBanco(){
       return objBanco;
   }
   public void CERRARSesion(){
       if(this.sesion.isOpen()){
          sesion.clear();
          sesion.close();
       }
   }
   public boolean addBanco(Banco obj) throws IOException{
      //devuelve true si la transaccion es exitosa
      //false si no lo es
      boolean resp=false;
      Transaction tx1=null;
      try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx1=sesion.beginTransaction();
   //la sesion guardara el objeto tipo Banco que le pasemos como parametro
   //a este metodo
            sesion.save(obj);
            tx1.commit();   //si todo anda bien se ejecuta
            CERRARSesion();
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          tx1.rollback();
          JOptionPane.showMessageDialog(null,"Ha ocurrido un error al CARGAR el registro a la Base de Datos","ERROR AL AGREGAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      finally{
          return resp;
      }

    }

    public boolean editBanco(Banco obj) throws IOException{
      //devuelve true si la transaccion es exitosa
      //false si no lo es
      Transaction tx2=null;
      boolean resp=false;
      try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx2=sesion.beginTransaction();
            sesion.saveOrUpdate(obj);  //la sesion guardara el objeto tipo Banco que le pasemos como parametro
            sesion.getTransaction().commit();   //si todo anda bien se ejecuta\
            CERRARSesion();
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
            tx2.rollback();

          JOptionPane.showMessageDialog(null,"Ha ocurrido un error al EDITAR el registro","ERROR AL EDITAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      finally{
          return resp;
      }

    }

    public boolean delBanco(Banco obj) throws IOException{
      //devuelve true si la transaccion es exitosa false si no lo es
      Transaction tx3=null;
      boolean resp=false;
      try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx3=sesion.beginTransaction();
            sesion.delete(obj);  //la sesion borra el objeto tipo Banco que le pasemos como parametro
            tx3.commit();   //si todo anda bien se ejecuta
            CERRARSesion();
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          tx3.rollback();

          JOptionPane.showMessageDialog(null,"Ha ocurrido un error al BORRAR el registro","ERROR AL BORRAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      finally{
          return resp;
      }

    }

    //public static void main (String[] args) throws IOException{  }

    public int getsiguientecodigo(){

        int siguientecodigo=0;
        Transaction tx4=null;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx4=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(b.idbanco)from Banco as b");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(b.idbanco)from Banco as b");
                siguientecodigo=Integer.parseInt(qq.list().get(0).toString());
                if (siguientecodigo < 2147483647){  //si no exede el rango de un entero
                    siguientecodigo=siguientecodigo+1;
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

    public boolean ExisteIdEnTabla(int id){
    boolean re=false;
    Transaction tx5=null;
    try{
        this.sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx5=sesion.beginTransaction();
        Query q=sesion.createQuery("from Banco where idbanco = "+Integer.toString(id));
        if(q.list().isEmpty()){  //si no se encontro
            existe=false;
            this.objBanco=null;
            re= false;
        }
        else{
            existe=true;
            this.objBanco=(Banco)q.list().get(0); //el primer elemento de la lista
            re= true;

        }
        tx5.commit();
        CERRARSesion();
    }
    catch(HibernateException h){
            //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            re=false;
            existe=false;
            tx5.rollback();  //vuelve al estado anterior en caso de que de error

        }finally{
            return re;
        }
    }
}

