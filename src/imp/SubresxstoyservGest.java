package imp;
import Hiber1.NewHibernateUtil;
import Hiber1.Stockyservxsubre;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SubresxstoyservGest{
    Session sesion=null;
    Stockyservxsubre stxsu=null;
    public void SubresxstoyservGest(){  //constructor
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    public boolean ExisteFKSubreserva(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Stockyservxsubre where idsubres = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
   } 
    public boolean ExisteFKStockyserv(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Stockyservxsubre where codigo = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }
    public int getsiguientecodigo(){

        int siguientecodigo=0;
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx=null;
        try{
            tx=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(id1)from Stockyservxsubre");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(id1)from Stockyservxsubre");
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

    public boolean existeStockEnSubreserva(int idst, int idsu){
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        boolean encontrado=false;
        Transaction tx2=null;
        try{
           tx2=sesion.beginTransaction();
           Query qq=sesion.createQuery("from Stockyservxsubre where codigo = "+idst+" and idsubres = "+idsu);
           if(qq.list().size()>0){ //si no se encontro
                encontrado=true;
                stxsu=(Stockyservxsubre) qq.list().get(0);
           }else{
                encontrado=false;
                stxsu=new Stockyservxsubre();
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
    public Stockyservxsubre getObjStockyservxsubre(){
        return this.stxsu;
    }
}