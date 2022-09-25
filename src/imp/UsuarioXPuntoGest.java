package imp;

import Hiber1.NewHibernateUtil;
import Hiber1.Usuarios;
import Hiber1.Varios;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsuarioXPuntoGest{
    Session sesion=null;
    Usuarios miusuario=new Usuarios();
    int codigoempleado=0;
    public void UsuarioXPuntoGest(){  //constructor
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    public void CERRARSesion(){
        if(sesion.isOpen()){
            sesion.flush();
            sesion.clear();
            sesion.close();
        }
   } 
public boolean ExisteFKUsuario(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Usuarioxpunto where idusuario = "+Integer.toString(id));
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
            Query q= sesion.createQuery("select count(idusuarioxpunto)from Usuarioxpunto");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(idusuarioxpunto)from Usuarioxpunto");
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

    public boolean EstaHabilitadoElUsuarioEnEstePunto(int punto){
        Varios var=new Varios();
        VariosGest varges=new VariosGest();
        var=varges.getVarios();
        boolean respu=false;
        if(var.getConectado()=='1'){
            sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
            sesion.beginTransaction();
            Query q=sesion.createQuery("from Usuarioxpunto where idpunto = "+Integer.toString(punto)+" and idusuario = "+var.getUsuarios().getIdusuario());
            if(q.list().isEmpty()==false)
                respu=true;
            else
                respu=false;
        }else
                respu=false;
        return respu;
    }
}