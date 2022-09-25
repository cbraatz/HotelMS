package imp;
  
import Hiber1.Cabcompra;
import Hiber1.Detcompra;
import Hiber1.NewHibernateUtil;
import Hiber1.Proveedor;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CompraGest {
    Session sesion = null;
    private Cabcompra objCabecera=new Cabcompra(); //guarda el objeto CabCompra de la ultima busqueda
    public boolean existe=false;  //campo que señala si la ultima busqueda dio true o false

    public CompraGest() {  //constructor
        this.sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }

    public Cabcompra getobjCabecera(){
        return this.objCabecera;
    }

    public int ContadorDeFilasEnDetalle(int id){   //para buscar en detcompra si existe el FK de cabcompra
        Transaction tx9=null;
        int res=0;
        try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query q=sesion.createQuery("from Detcompra where cabcompra = "+id);
            int c=q.list().size();
            tx9.commit();
            res=c;
        }
        catch(HibernateException e){
            tx9.rollback();
            res=0;
        }
        finally{return res;}
   }
   public boolean ExisteFKProveedor(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Cabcompra where idprov = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }
   public boolean ExisteFKStockyserv(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Detcompra where codigo = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }
   public boolean addCabCom(Cabcompra obj) throws IOException{
      Transaction tx8=null;
      int c=0;
     // boolean resp=false;
      try{
            sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
            tx8=sesion.beginTransaction();
                sesion.save(obj);
            tx8.commit();
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
         e.printStackTrace();
        tx8.rollback();
         c++;
      }
      finally{
          if (c>0)
              return false;
          else
              return true;
      }

    }

   public boolean editCabCom(Cabcompra obj) throws IOException{
      Transaction tx8=null;
      int c=0;
     // boolean resp=false;
      try{
            sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
            tx8=sesion.beginTransaction();
                sesion.update(obj);
            tx8.commit();
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
         e.printStackTrace();
        tx8.rollback();
         c++;
      }
      finally{
          if (c>0)
              return false;
          else
              return true;
      }

    }

   public boolean addDetCom(Detcompra objDet) throws IOException{
      Transaction tx10=null;
      boolean resp=false;
      try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx10=sesion.beginTransaction();
            sesion.save(objDet);
            tx10.commit();
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          tx10.rollback();
          e.printStackTrace();
          resp =false;
      }
      finally{
          return resp;
      }

    }

    public boolean delCabCom(Cabcompra obj) throws IOException{
      //devuelve true si la transaccion es exitosa false si no lo es
      Transaction tx10=null;
      boolean resp=false;
      try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx10=sesion.beginTransaction();
            sesion.delete(obj);
            tx10.commit();
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          tx10.rollback();
          e.printStackTrace();
          resp =false;
      }
      finally{
          return resp;
      }

    }
    public boolean delDetCom(Detcompra obj) throws IOException{
      //devuelve true si la transaccion es exitosa false si no lo es
      boolean resp=false;
      Transaction tx12=null;
      try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx12=sesion.beginTransaction();
            sesion.delete(obj);  //la sesion borra el objeto que le pasemos como parametro
            tx12.commit();   //si todo anda bien se ejecuta
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
            tx12.rollback();
            e.printStackTrace();
          //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al BORRAR el registro","ERROR AL BORRAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      finally{
          return resp;
      }

    }

    public boolean delTodosDetDeCabCom(int cab) throws IOException{
      boolean resp=false;
      Transaction tx16=null;
      Detcompra dt=new Detcompra();
      try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx16=sesion.beginTransaction();
            Query q= sesion.createQuery("from Detcompra where cabcompra = "+cab);
            List li=q.list();
            int ta=li.size();
            if(ta>0){
                for(int g=0;g<ta;g++){
                    dt=(Detcompra) li.get(g);
                    resp=this.delDetCom(dt);  //la sesion borra el objeto que le pasemos como parametro
                    if(resp==false){
                        tx16.rollback();
                        return false;
                    }
                }
            }
            tx16.commit();
            return true;
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de borrar hace el rollback
            tx16.rollback();
            e.printStackTrace();
            return false;
      }
      

    }

    public int getsiguientecodigoCab(){

        int siguientecodigo=0;
        Transaction tx13=null;
        try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query q= sesion.createQuery("select count(b.idfacturacompra)from Cabcompra as b");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(b.idfacturacompra)from Cabcompra as b");
                siguientecodigo=Integer.parseInt(qq.list().get(0).toString());
                if (siguientecodigo < 2147483647){  //si no exede el rango de un entero
                    siguientecodigo=siguientecodigo+1;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Número máximo de registros alcanzado","NO SE PUEDEN CARGAR MÁS REGISTROS",JOptionPane.INFORMATION_MESSAGE);
                    siguientecodigo=0;
                }
            }
            tx13.commit();  //guarda los cambios hechos en la transaccion, en este caso no seria necesario
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo =0;
            tx13.rollback();  //vuelve al estado anterior en caso de que de error
            he.printStackTrace();

        }finally{
            return siguientecodigo;
        }

   }

    public int getsiguientecodigoDet(){

        int siguientecodigo=0;
        Transaction tx16=null;
        try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query q= sesion.createQuery("select count(d.iddetcom)from Detcompra as d");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(d.iddetcom)from Detcompra as d");
                siguientecodigo=Integer.parseInt(qq.list().get(0).toString());
                if (siguientecodigo < 2147483647){  //si no exede el rango de un entero
                    siguientecodigo=siguientecodigo+1;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Número máximo de registros alcanzado","NO SE PUEDEN CARGAR MÁS REGISTROS",JOptionPane.INFORMATION_MESSAGE);
                    siguientecodigo=0;
                }
            }
            tx16.commit();  //guarda los cambios hechos en la transaccion, en este caso no seria necesario
        }catch(HibernateException he){
           // JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo=0;
            tx16.rollback();  //vuelve al estado anterior en caso de que de error
            he.printStackTrace();
        }finally{
            return siguientecodigo;
        }

   }
    
    public boolean ExisteIdEnCabecera(int id){
    Transaction tx14=null;
    boolean r=false;
    try{    
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Cabcompra where idfacturacompra = "+Integer.toString(id));
        if(q.list().isEmpty()){  //si no se encontro
            existe=false;
            this.objCabecera=null;
            r= false;
        }
        else{
            existe=true;
            this.objCabecera=(Cabcompra)q.list().get(0); //el primer elemento de la lista
            r= true;

        }
        tx14.commit();
    }
    catch(HibernateException e){
        e.printStackTrace();
        tx14.rollback();
        r=false;
    }
    finally{return r;}
    }

    public boolean ExisteNumFacEIdProvEnCabecera(String numfac, int idpro){
    Transaction tx15=null;
    boolean r=false;
    try{
        this.sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Cabcompra where numfaccom = '"+numfac+"' and proveedor = "+idpro);
        if(q.list().isEmpty()){  //si no se encontro
            existe=false;
            this.objCabecera=null;
            r= false;
        }
        else{
            existe=true;
            this.objCabecera=(Cabcompra)q.list().get(0); //el primer elemento de la lista
            r= true;

        }
    }
    catch(HibernateException ec){
        tx15.rollback();
        existe=false;
        ec.printStackTrace();
        r=false;
    }
    finally{
        return r;
    }

    }
}