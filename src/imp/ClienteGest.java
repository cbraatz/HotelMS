package imp;
  
import Hiber1.Cliente;
import Hiber1.NewHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClienteGest{
    Session sesion=null;
    Cliente micliente=new Cliente();
    public void ClienteGest(){  //constructor
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }

public boolean ExisteFKPais(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Cliente where idpais = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
}

public boolean ExisteFKEmpresa(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Cliente where idempresa = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
}

public boolean ExisteFKTipoDocumento(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Cliente where idtipodoc = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
}
public boolean ExisteFKProfesion(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Cliente where idprof = "+Integer.toString(id));
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
            Query q= sesion.createQuery("select count(idcli)from Cliente");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(idcli)from Cliente");
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
            he.printStackTrace();
            if (sesion.getTransaction() != null)
                tx.rollback();  //vuelve al estado anterior en caso de que de error
        }finally{
            return siguientecodigo;
        }
   }

    public boolean existeCliente(String ndoc, int cpais){
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        boolean encontrado=false;
        Transaction tx2=null;
        try{
           tx2=sesion.beginTransaction();
           Query qq=sesion.createQuery("from Cliente where doc = '"+ndoc+"' and pais = "+cpais);
           if(qq.list().size()>0){ //si no se encontro
                micliente=(Cliente)qq.list().get(0);
                encontrado=true;
           }else{
                micliente=new Cliente();
                encontrado=false;
           }
        }
        catch(HibernateException e){
            e.printStackTrace();
        }
        return encontrado;
    }

    public Cliente getCliente(){
        return this.micliente;
    }
    /*public static void main(String[] arr){
        ClienteGest clieges=new ClienteGest();
        System.out.println(clieges.getsiguientecodigo()+"");
    }*/
}