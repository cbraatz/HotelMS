package imp;

import Hiber1.Movcaja;
import Hiber1.NewHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
 
public class MovCajaGest {
    Session sesion = null;
    Movcaja mimovcaja=new Movcaja();

public boolean ExisteFKCliente(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Movcaja where idcli = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
}
public boolean ExisteFKTipomov(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Movcaja where idtipomov = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
}
public boolean ExisteFKFormapago(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Movcaja where idforma = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
}
public boolean ExisteFKMoneda(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Movcaja where idmoneda = "+Integer.toString(id));
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
            Query q= sesion.createQuery("select count(m.idmov)from Movcaja as m");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(m.idmov)from Movcaja as m");
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
            he.printStackTrace();
            siguientecodigo =0;
            txx4.rollback();  //vuelve al estado anterior en caso de que de error

        }finally{
            //this.sesionst.close();
            return siguientecodigo;
        }
   }

  /*  public boolean ExisteMovimiento(int id){   //iba a usar en el buscar de movcaja, pero al final hice esto alla nomas
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        this.mimovcaja=(Movcaja) sesion.get(Movcaja.class, Integer.toString(id));
        if(mimovcaja!=null){
            return true;
        }
        else{
            this.mimovcaja=new Movcaja();
            return false;
        }
    }
    
    public Movcaja getMiMovCaja(){
        return this.mimovcaja;
    }
*/
}
