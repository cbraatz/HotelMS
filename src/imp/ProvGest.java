package imp;

import Hiber1.NewHibernateUtil;
import Hiber1.Proveedor;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
 
public class ProvGest {
    Session sesion = null;
    public boolean existe=false;  //campo que señala si la ultima busqueda dio true o false
    private Proveedor objProveedor=null; //guarda el objeto de la ultima busqueda
public ProvGest() {  //constructor
    this.sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
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
            Proveedor pro=new Proveedor();
            pro.setIdprov(1);
            pro.setNombre("COOPERATIVA COLONIAS UNIDAS");
            pro.setDireccion("AVDA. DR. FRANCIA - OBLIGADO");
            pro.setRuc("80017198-5");
            pro.setTelefprov("0717-20251");
            sesion.saveOrUpdate(pro);
            tx1.commit();
            CERRARSesion();
            return true;
        }catch(HibernateException ex){
            return false;
        }
    }
public Proveedor getObjProveedor(){
    return this.objProveedor;
}

   public boolean addProveedor(Proveedor obj) throws IOException{
      //devuelve true si la transaccion es exitosa
      //false si no lo es
      Transaction tx1=null;
      boolean resp=false;
      try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx1=sesion.beginTransaction();
            sesion.save(obj);
            tx1.commit();   //si todo anda bien se ejecuta
            CERRARSesion();
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          tx1.rollback();
         // JOptionPane.showMessageDialog(null,"Ha ocurrido un error al CARGAR el registro a la Base de Datos","ERROR AL AGREGAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      finally{
          return resp;
      }

    }

    public boolean editProveedor(Proveedor obj) throws IOException{
      //devuelve true si la transaccion es exitosa
      //false si no lo es
      Transaction tx2=null;
      boolean resp=false;
      try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx2=sesion.beginTransaction();
            sesion.saveOrUpdate(obj);  //la sesion guardara el objeto tipo Pagos que le pasemos como parametro
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

    public boolean delProveedor(Proveedor obj) throws IOException{
      //devuelve true si la transaccion es exitosa false si no lo es
      Transaction tx3=null;
      boolean resp=false;
      try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx3=sesion.beginTransaction();
            sesion.delete(obj);  //la sesion borra el objeto que le pasemos como parametro
            tx3.commit();   //si todo anda bien se ejecuta
            CERRARSesion();
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          tx3.rollback();

          //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al BORRAR el registro","ERROR AL BORRAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      finally{
          return resp;
      }

    }

    //public static void main (String[] args) throws IOException{  }

    public int getsiguientecodigo(){
        Transaction tx4=null;
        int siguientecodigo=0;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx4=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(p.idprov)from Proveedor as p");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(p.idprov)from Proveedor as p");
                siguientecodigo=Integer.parseInt(qq.list().get(0).toString());
                if (siguientecodigo < 2147483647){  //si no exede el rango de un entero
                    siguientecodigo=siguientecodigo+1;
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

    public boolean ExisteIdEnTabla(int id){
    Transaction tx5=null;
    try{
        this.sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx5=sesion.beginTransaction();
        Query q=sesion.createQuery("from Proveedor where idprov = "+Integer.toString(id));
        if(q.list().isEmpty()){  //si no se encontro
            existe=false;
            this.objProveedor=new Proveedor();
        }
        else{
            existe=true;
            this.objProveedor=(Proveedor)q.list().get(0); //el primer elemento de la lista
        }
        tx5.commit();
        CERRARSesion();
    }
    catch(HibernateException h){
            //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            existe=false;
            this.objProveedor=new Proveedor();
            tx5.rollback();  //vuelve al estado anterior en caso de que de error
        }finally{
            return existe;
        }
    }


}