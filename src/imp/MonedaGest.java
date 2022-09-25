package imp;

import Hiber1.Moneda;
import Hiber1.NewHibernateUtil;
import Hiber1.Pais;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.*;
  

public class MonedaGest {

   public MonedaGest(){
        this.sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
   }

   Session sesion = null;
   public boolean existe=false;  //campo que señala si la ultima busqueda dio true o false
   private Moneda moneda=new Moneda(); //guarda el objeto de la ultima busqueda

   public Moneda getObjMoneda(){
       return moneda;
   }
    public void CERRARSesion(){
       if(this.sesion.isOpen()){
          sesion.flush();
          sesion.clear();
          sesion.close();
       }
    }
    public boolean ExisteFKPais(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Moneda where idpais = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
  }
    public boolean ExisteMonedaCargadaConPais(int idpais){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Moneda where idpais = "+Integer.toString(idpais));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
  }
    public boolean cargarCamposPorDefecto(){
        try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx=sesion.beginTransaction();
            Pais pais=new Pais();
            pais=(Pais)sesion.get(Pais.class, 1);  //PARAGUAY
            tx.commit();
            CERRARSesion();
            if(pais!=null){
                this.sesion = NewHibernateUtil.getSessionFactory().openSession();
                Transaction tx1=sesion.beginTransaction();
                moneda=new Moneda();
                moneda.setIdmoneda(1);
                moneda.setMoneda("GUARANÍES");
                moneda.setCompra(Float.parseFloat("1"));
                moneda.setVenta(Float.parseFloat("1"));
                moneda.setPais(pais);
                sesion.saveOrUpdate(moneda);
                tx1.commit();
                CERRARSesion();
                return true;
            }else
                return false;
        }catch(HibernateException ex){
            ex.printStackTrace();
            return false;
        }
    }

    public int getsiguientecodigo(){

        int siguientecodigo=0;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx4=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(idmoneda)from Moneda");
            List li=q.list();
           // tx4.commit();
            CERRARSesion();
            if(Integer.parseInt(li.get(0).toString())==0){
                cargarCamposPorDefecto();
                siguientecodigo=2;
            } else {
                this.sesion = NewHibernateUtil.getSessionFactory().openSession();
                Transaction tx5=sesion.beginTransaction();
                Query qq= sesion.createQuery("select max(idmoneda)from Moneda");
                siguientecodigo=Integer.parseInt(qq.list().get(0).toString());
              //  tx5.commit();
                CERRARSesion();
                if (siguientecodigo < 2147483647){  //si no exede el rango de un entero
                   if(siguientecodigo>1)
                        siguientecodigo=siguientecodigo+1;
                   else{
                        cargarCamposPorDefecto();
                        siguientecodigo=2;
                   }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Número máximo de registros alcanzado","NO SE PUEDEN CARGAR MÁS REGISTROS",JOptionPane.INFORMATION_MESSAGE);
                    siguientecodigo=0;
                }
            }
            
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo =0;
            he.printStackTrace();
        }finally{
            return siguientecodigo;
        }

   }
public boolean addMoneda(Moneda obj){
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

    public boolean editMoneda(Moneda obj){
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

    public boolean delMoneda(Moneda obj){
      //devuelve true si la transaccion es exitosa false si no lo es
      Transaction tx3=null;
      boolean resp=false;
      try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx3=sesion.beginTransaction();
            int codp=obj.getPais().getIdpais();
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
        Query q=sesion.createQuery("from Moneda where idmoneda = "+Integer.toString(id));
        if(q.list().isEmpty()){  //si no se encontro
            existe=false;
            this.moneda=new Moneda();
            re= false;
        }
        else{
            existe=true;
            this.moneda=(Moneda)q.list().get(0); //el primer elemento de la lista
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

