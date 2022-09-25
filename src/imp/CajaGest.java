package imp;
  
import Hiber1.Caja;
import Hiber1.NewHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CajaGest {
    Session sesion = null;
    Caja micaja=new Caja();
public float existenciaFormaMoneda(int idfor, int idmon){  //devuelve el monto existente en caja de una forma de pago y una moneda, si no existe devuelve -1
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx=sesion.beginTransaction();
        sesion.beginTransaction();
        float result=0;
        Query q=sesion.createQuery("from Caja where idforma = "+Integer.toString(idfor)+" and idmoneda = "+idmon);
        if(q.list().isEmpty()==false){
            micaja=new Caja();
            micaja=(Caja)q.list().get(0);
            result=micaja.getMonto();
        }
        else
            result=-1;
       tx.commit();
       if(sesion.isOpen()){
            sesion.clear();
            sesion.close();
       }
       return result;
}

public boolean ExisteFKFormapago(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Caja where idforma = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
}

public boolean ExisteFKMoneda(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Caja where idmoneda = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
}

public int getsiguientecodigo(){
        Transaction txx4=null;
        int siguientecodigo=0;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            txx4=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(c.idcaja)from Caja as c");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(c.idcaja)from Caja as c");
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
            if(sesion.isOpen()){
               sesion.clear();
               sesion.close();
            }
        }catch(HibernateException he){
            //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo =0;
            txx4.rollback();  //vuelve al estado anterior en caso de que de error

        }finally{
            //this.sesionst.close();
            return siguientecodigo;
        }
   }
   public Caja getMiCaja(){
    return micaja;
   }

}
