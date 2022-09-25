package imp;
 
import Hiber1.NewHibernateUtil;
import Hiber1.Habitacion;
import Hiber1.Subreserva;
import Soporte.clasesutiles;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.*;


public class HabitacionGest {

   public HabitacionGest(){
        this.sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
   }

   Session sesion = null;
   public boolean existe=false;  //campo que señala si la ultima busqueda dio true o false
   private Habitacion hab=null; //guarda el objeto de la ultima busqueda
   clasesutiles cluti=new clasesutiles();
   String fechadehoy="";
   public Habitacion GetObjHabitacion(){
       return hab;
   }
    public void CERRARSesion(){
       if(this.sesion.isOpen()){
          sesion.clear();
          sesion.close();
       }
    }
    
    public boolean ExisteFKEstado(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Habitacion where idestado = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }
    public boolean ExisteFKGrupo(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Habitacion where idgrupo = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }
    public boolean ExisteFKTipohab(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Habitacion where idtipoh = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }
    public int getsiguientecodigo(){

        int siguientecodigo=0;
        Transaction tx4=null;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx4=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(idhabit)from Habitacion");
            if(Integer.parseInt(q.list().get(0).toString())==0){
                siguientecodigo=1;
            } else {
                Query qq= sesion.createQuery("select max(idhabit)from Habitacion");
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
    public void actualizarFechaDeHoy(){
        fechadehoy=cluti.Date_StringDMA(clasesutiles.Calender_Date(Calendar.getInstance()));
    }
   public boolean estaOcupadaLaHabitacion(int idh){
        this.actualizarFechaDeHoy();
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Subreserva where habitacion = "+idh+" and feyhocheckin is not null and feyhocheckout is null");
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }
   public String estadoDeEstaHabitacionEnFechaEnSubreserva(int idh, String fec){ //devuelve LIBRE si esta libre y sino devuelve la fecha en que se desocupara
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        String result="LIBRE";
        Query q=sesion.createQuery("from Subreserva where habitacion = "+idh+" and fechaocup >= '"+fec+"' and feyhocheckout is null");
        List li=q.list();
        Subreserva su=new Subreserva();
        if(li.size()>0){
            su=(Subreserva)li.get(0);
            result=cluti.Date_StringDMA(su.getFechadesoc());
        }
        sesion.getTransaction().commit();
        this.CERRARSesion();
        return result;
    }
   /*public String estadoDeEstaHabitacionEnFechaEnOcupaciones(int idh, String fec){ //devuelve LIBRE si esta libre y sino devuelve la fecha en que se desocupara
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        String result="LIBRE";
        Query q=sesion.createQuery("from Ocupaciones where habitacion = "+idh+" and fecha = '"+fec+"' and estado > 0");
        List li=q.list();
        Subreserva su=new Subreserva();
        if(li.size()>0){
            su=(Subreserva)li.get(0);
            result=cluti.Date_StringDMA(su.getFechadesoc());
        }
        sesion.getTransaction().commit();
        this.CERRARSesion();
        return result;
    }*/
public boolean addHabitacion(Habitacion obj){
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

    public boolean editHabitacion(Habitacion obj){
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

    public boolean delHabitacion(Habitacion obj){
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
    public boolean ExisteHabitacionCargada(){  //para el inicio de reservacion
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Habitacion");
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }
    public List ListaHabitaciones(){  //para el inicio de reservacion
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Habitacion order by idhabit");
        return q.list();
    }
    
    public boolean ExisteIdEnTabla(int id){
    Transaction tx5=null;
    try{
        this.sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx5=sesion.beginTransaction();
        Query q=sesion.createQuery("from Habitacion where idhabit = "+Integer.toString(id));
        if(q.list().isEmpty()){  //si no se encontro
            existe=false;
            this.hab=new Habitacion();
        }
        else{
            existe=true;
            this.hab=(Habitacion)q.list().get(0); //el primer elemento de la lista

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

