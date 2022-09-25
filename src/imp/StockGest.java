package imp;

import Hiber1.NewHibernateUtil;
import Hiber1.Stockyserv;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StockGest {
    Session sesionst = null;
    public boolean existe=false;  //campo que señala si la ultima busqueda dio true o false
    private Stockyserv objStock=null; //guarda el objeto pagos de la ultima busqueda

    public StockGest() {  //constructor
       this.sesionst = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
 
    public Stockyserv getObjStock(){
        return this.objStock;
    }

    public void CERRARSesion(){
        if(this.sesionst.isOpen()){
              sesionst.clear();
              sesionst.close();
        }
    }
public boolean ExisteFKUnidadMedida(int id){
        sesionst = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesionst.beginTransaction();
        Query q=sesionst.createQuery("from Stockyserv where idum = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
}
public boolean ExisteFKIva(int id){
        sesionst = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesionst.beginTransaction();
        Query q=sesionst.createQuery("from Stockyserv where idiva = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
}

   public boolean addStock(Stockyserv obj) throws IOException{
      //devuelve true si la transaccion es exitosa
      //false si no lo es
      Transaction txx1=null;
      boolean resp=false;
      try{
            this.sesionst = NewHibernateUtil.getSessionFactory().openSession();
            txx1=sesionst.beginTransaction();
            sesionst.save(obj);
            txx1.commit();   //si todo anda bien se ejecuta
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          txx1.rollback();
          //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al CARGAR el registro a la Base de Datos","ERROR AL AGREGAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      CERRARSesion();
      return resp;
    }

    public boolean editStock(Stockyserv obj) throws IOException{
      //devuelve true si la transaccion es exitosa
      //false si no lo es
      
      boolean resp=false;
      Transaction txx2=null;
      try{
            this.sesionst = NewHibernateUtil.getSessionFactory().openSession();
            txx2=sesionst.beginTransaction();
            sesionst.saveOrUpdate(obj);  //la sesion guardara el objeto tipo Pagos que le pasemos como parametro
            txx2.commit();   //si todo anda bien se ejecuta
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          txx2.rollback();
          e.printStackTrace();
         //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al EDITAR el registro","ERROR AL EDITAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
     CERRARSesion();
     return resp;
    }

    public boolean delStock(Stockyserv obj) throws IOException{
      //devuelve true si la transaccion es exitosa false si no lo es
      
      Transaction txx3=null;
      boolean resp=false;
      try{
            this.sesionst = NewHibernateUtil.getSessionFactory().openSession();
            txx3=sesionst.beginTransaction();
            sesionst.delete(obj);  //la sesion borra el objeto que le pasemos como parametro
            txx3.commit();   //si todo anda bien se ejecuta
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
            txx3.rollback();

          //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al BORRAR el registro","ERROR AL BORRAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      CERRARSesion();
      return resp;
    }

    //public static void main (String[] args) throws IOException{  }

    public int getsiguientecodigo(){
        Transaction txx4=null;
        int siguientecodigo=0;
        try{
            this.sesionst = NewHibernateUtil.getSessionFactory().openSession();
            txx4=sesionst.beginTransaction();
            Query q= sesionst.createQuery("select count(s.codigo)from Stockyserv as s");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesionst.createQuery("select max(s.codigo)from Stockyserv as s");
                siguientecodigo=Integer.parseInt(qq.list().get(0).toString());
                if (siguientecodigo < 2147483647){  //si no exede el rango de un entero
                    siguientecodigo=siguientecodigo+1;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Número máximo de registros alcanzado","NO SE PUEDEN CARGAR MÁS REGISTROS",JOptionPane.INFORMATION_MESSAGE);
                    siguientecodigo=0;
                }
            }
            txx4.commit();  //guarda los cambios hechos en la transaccion, en este caso no seria necesario
        }catch(HibernateException he){
            //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo =0;
            txx4.rollback();  //vuelve al estado anterior en caso de que de error
        }
        CERRARSesion();
        return siguientecodigo;
   }

    public boolean ExisteIdEnTabla(int id){
    Transaction txx5=null;
    this.sesionst = NewHibernateUtil.getSessionFactory().openSession();
    try{
        
        txx5=sesionst.beginTransaction();
        this.objStock=(Stockyserv)sesionst.get(Stockyserv.class, id);
        if(objStock==null){  //si no se encontro
            existe=false;
            this.objStock=new Stockyserv();
        }
        else
            existe=true;
        txx5.commit();
    }
    catch(HibernateException h){
        //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
        existe=false;
        txx5.rollback();  //vuelve al estado anterior en caso de que de error

    }
    CERRARSesion();
    return existe;
    }
   /* public boolean ExisteIdEnTabla(int id){
    boolean re=false;
    Transaction txx5=null;
    this.sesionst = NewHibernateUtil.getSessionFactory().openSession();
    try{

        txx5=sesionst.beginTransaction();
        Query q=sesionst.createQuery("from Stockyserv where codigo = "+Integer.toString(id));
        if(q.list().isEmpty()){  //si no se encontro
            existe=false;
            this.objStock=null;
            re= false;
        }
        else{
            existe=true;
            this.objStock=(Stockyserv)q.list().get(0); //el primer elemento de la lista
            re= true;
        }
        txx5.commit();
    }
    catch(HibernateException h){
        //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
        re=false;
        existe=false;
        txx5.rollback();  //vuelve al estado anterior en caso de que de error

    }
    CERRARSesion();
    return re;
    }*/
    public boolean ExisteIdProductoEnTabla(int id){
    boolean re=false;
    Transaction txx5=null;
    this.sesionst = NewHibernateUtil.getSessionFactory().openSession();
    try{

        txx5=sesionst.beginTransaction();
        Query q=sesionst.createQuery("from Stockyserv where esservicio = '0' and codigo = "+Integer.toString(id));
        if(q.list().isEmpty()){  //si no se encontro
            existe=false;
            this.objStock=null;
            re= false;
        }
        else{
            existe=true;
            this.objStock=(Stockyserv)q.list().get(0); //el primer elemento de la lista
            re= true;
        }
        txx5.commit();
    }
    catch(HibernateException h){
        //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
        re=false;
        existe=false;
        txx5.rollback();  //vuelve al estado anterior en caso de que de error

    }
    CERRARSesion();
    return re;
    }
    public boolean ExisteIdServicioEnTabla(int id){
    boolean re=false;
    Transaction txx5=null;
    this.sesionst = NewHibernateUtil.getSessionFactory().openSession();
    try{

        txx5=sesionst.beginTransaction();
        Query q=sesionst.createQuery("from Stockyserv where esservicio = '1' and codigo = "+Integer.toString(id));
        if(q.list().isEmpty()){  //si no se encontro
            existe=false;
            this.objStock=null;
            re= false;
        }
        else{
            existe=true;
            this.objStock=(Stockyserv)q.list().get(0); //el primer elemento de la lista
            re= true;
        }
        txx5.commit();
    }
    catch(HibernateException h){
        //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
        re=false;
        existe=false;
        txx5.rollback();  //vuelve al estado anterior en caso de que de error

    }
    CERRARSesion();
    return re;
    }

}