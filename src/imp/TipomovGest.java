package imp;

import Hiber1.NewHibernateUtil;
import Hiber1.Tipomov;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.hibernate.*;


public class TipomovGest {

   public TipomovGest(){
        this.sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
   }
 
   Session sesion = null;
   public boolean existe=false;  //campo que señala si la ultima busqueda dio true o false
   private Tipomov objTipomov=null; //guarda el objeto de la ultima busqueda

   public Tipomov GetObjTipomov(){
       return objTipomov;
   }
    public void CERRARSesion(){
       if(this.sesion.isOpen()){
          sesion.clear();
          sesion.close();
       }
    }
    public boolean cargarCamposPorDefecto(){
        try{
        ///////////////////////guarda cobro///////////////////////////////////
        this.sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1=sesion.beginTransaction();
        Tipomov tipo=new Tipomov();
        tipo.setIdtipomov(1);
        tipo.setDescripconc("COBRO");
        tipo.setCredito('0');
        tipo.setExclusivores('1');
        tipo.setEgreso('0');
        sesion.saveOrUpdate(tipo);
        ///////////////////////guarda CAMBIO///////////////////////////////////
        
        tipo=new Tipomov();
        tipo.setIdtipomov(2);
        tipo.setDescripconc("CAMBIO");
        tipo.setCredito('1');
        tipo.setExclusivores('1');
        tipo.setEgreso('0');
        sesion.saveOrUpdate(tipo);

        ///////////////////////guarda CIERRE CAJA///////////////////////////////////

        tipo=new Tipomov();
        tipo.setIdtipomov(3);
        tipo.setDescripconc("CIERRE CAJA");
        tipo.setCredito('1');
        tipo.setExclusivores('1');
        tipo.setEgreso('0');
        sesion.saveOrUpdate(tipo);

        ///////////////////////guarda APERTURA CAJA///////////////////////////////////
       
        tipo=new Tipomov();
        tipo.setIdtipomov(4);
        tipo.setDescripconc("APERTURA CAJA");
        tipo.setCredito('0');
        tipo.setExclusivores('1');
        tipo.setEgreso('0');
        sesion.saveOrUpdate(tipo);


        tipo=new Tipomov();
        tipo.setIdtipomov(5);
        tipo.setDescripconc("DEPÓSITO");
        tipo.setCredito('0');
        tipo.setExclusivores('0');
        tipo.setEgreso('0');
        sesion.saveOrUpdate(tipo);

        tipo=new Tipomov();
        tipo.setIdtipomov(6);
        tipo.setDescripconc("EXTRACCIÓN P/DEPÓSITO BANCARIO");
        tipo.setCredito('1');
        tipo.setExclusivores('0');
        tipo.setEgreso('0');
        sesion.saveOrUpdate(tipo);
        tx1.commit();
        CERRARSesion();
        return true;
        } catch (HibernateException ex) {
            CERRARSesion();
            return false;
        }

    }
    public int getsiguientecodigo(){

        int siguientecodigo=0;
        Transaction tx4=null;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx4=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(t.idtipomov)from Tipomov as t");
            if(Integer.parseInt(q.list().get(0).toString())==0){
                cargarCamposPorDefecto();
                siguientecodigo=5;
            } else {
                Query qq= sesion.createQuery("select max(t.idtipomov)from Tipomov as t");
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
public boolean addTipomov(Tipomov obj){
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

    public boolean editTipomov(Tipomov obj){
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

    public boolean delTipomov(Tipomov obj){
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
    boolean re=false;
    Transaction tx5=null;
    try{
        this.sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx5=sesion.beginTransaction();
        Query q=sesion.createQuery("from Tipomov where idtipomov = "+Integer.toString(id));
        if(q.list().isEmpty()){  //si no se encontro
            existe=false;
            this.objTipomov=null;
            re= false;
        }
        else{
            existe=true;
            this.objTipomov=(Tipomov)q.list().get(0); //el primer elemento de la lista
            re= true;

        }
        tx5.commit();
        CERRARSesion();
    }
    catch(HibernateException h){
            h.printStackTrace();
            re=false;
            existe=false;
            tx5.rollback();  //vuelve al estado anterior en caso de que de error

        }finally{
            return re;
        }
    }
}

