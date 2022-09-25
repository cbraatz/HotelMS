package imp;

import Hiber1.NewHibernateUtil;
import Hiber1.Reservacion;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ReservacionGest{
    Session sesion=null;
 
    public void ReservacionGest(){  //constructor
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    public boolean ExisteFKCliente(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Reservacion where idcli = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
   }
    public boolean ExisteIdReservaEnTabla(int idr){ //se usa al guardar la res para ver si guardar en audit o no
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Reservacion where idres = "+Integer.toString(idr));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
   }
    public int getsiguientecodigo(){

        int siguientecodigo=0;
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx=null;
        try{
            tx=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(idres)from Reservacion");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(idres)from Reservacion");
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
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo =0;
            if (sesion.getTransaction() != null)
                tx.rollback();  //vuelve al estado anterior en caso de que de error
        }finally{
            return siguientecodigo;
        }
   }
    public boolean ExisteLaHabitacionDisponibleEnReservacion(int idha, int idre){
    boolean re=false;
    Transaction tx=null;
    try{
        this.sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx=sesion.beginTransaction();
        SQLQuery q=sesion.createSQLQuery("select * from Subreserva as s where s.idres = "+idre+" and s.idhabit = "+idha+" and s.idhabit not in (select ss.idhabit from Cliexsub as cs, Subreserva as ss where cs.idsubres = ss.idsubres and ss.idres = "+idre+")");
        if(q.list().isEmpty())  //si no se encontro
            re=false;
        else
            re=true;
        tx.commit();
    }
    catch(HibernateException h){}
    return re;
    }
}