package imp;
  
import Hiber1.Apeyciecaja;
import Hiber1.NewHibernateUtil;
import java.util.Date;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ApeyciecajaGest{
    Session sesion=null;
    Apeyciecaja miapeyciecaja=new Apeyciecaja();
    Date fechaultimaapertura=null;
    public void ClienteGest(){  //constructor
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    public void CERRARSesion(){
        if(sesion.isOpen()){
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
            Query q= sesion.createQuery("select count(idayccaja)from Apeyciecaja");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(idayccaja)from Apeyciecaja");
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
            CERRARSesion();
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo =0;
            if (sesion.getTransaction() != null)
                tx.rollback();  //vuelve al estado anterior en caso de que de error
        }finally{
            return siguientecodigo;
        }
   }

    public boolean estaAbierta(){
       sesion=NewHibernateUtil.getSessionFactory().openSession();
       Transaction tx=null;
       boolean resp=false;
       tx=sesion.beginTransaction();
       Query q=sesion.createQuery("select max(idayccaja) from Apeyciecaja");  //saca el ultimo codigo
       Object c=q.uniqueResult();
       tx.commit();
       CERRARSesion();
       if(c!=null){
           int cod= Integer.parseInt(c.toString());
           sesion=NewHibernateUtil.getSessionFactory().openSession();
           Transaction tx1=null;
           tx1=sesion.beginTransaction();
           Apeyciecaja ape=new Apeyciecaja();
           ape=(Apeyciecaja)sesion.get(Apeyciecaja.class, cod);
           
           if(ape.getFeyhoape()!=null && ape.getFeyhocie()==null){
               fechaultimaapertura=ape.getFeyhoape();
               this.miapeyciecaja=ape;
               resp= true;       //si el ultimo registro tiene fecha de apertura y no de arqueo es apertura
           } else
               resp= false;      //si el ultimo registro tiene fecha de arqueo y de apertura no es apertura
           tx1.commit();
           CERRARSesion();
       }else   //si todavia no se creo un registro en arqueo es apertura
           resp= false;
       return resp;
    }

    public Apeyciecaja getmiapeyciecaja(){
        return this.miapeyciecaja;
    }
}