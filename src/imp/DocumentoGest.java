package imp;
  
import Hiber1.Documentos;
import Hiber1.NewHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DocumentoGest {
    Session sesion = null;
    Documentos midocumento=new Documentos();
public boolean ExisteFKBanco(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Documentos where idbanco = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
}

public boolean ExisteFKFormapago(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Documentos where idforma = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
}
public boolean ExisteFKMoneda(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Documentos where idmoneda = "+Integer.toString(id));
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
            Query q= sesion.createQuery("select count(iddoc)from Documentos");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(iddoc)from Documentos");
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

 public boolean existeDocumentoConNumeroYBanco(String nume, int idban){
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        boolean encontrado=false;
        Transaction tx2=null;
        try{
           tx2=sesion.beginTransaction();
           Query qq=sesion.createQuery("from Documentos where numerodoc = '"+nume+"' and banco = "+idban);
           if(qq.list().size()>0){ //si no se encontro
                encontrado=true;
                midocumento=(Documentos) qq.list().get(0);
           }else{
                encontrado=false;
                midocumento=new Documentos();
           }
           tx2.commit();
        }
        catch(HibernateException e){
            e.printStackTrace();
        }
        if(sesion.isOpen()){
            sesion.flush();
            sesion.clear();
            sesion.close();
        }
        return encontrado;
    }
 public boolean existeDocumentoConNumero(String nume){
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        boolean encontrado=false;
        Transaction tx2=null;
        try{
           tx2=sesion.beginTransaction();
           Query qq=sesion.createQuery("from Documentos where numerodoc = '"+nume+"'");
           if(qq.list().size()>0){ //si no se encontro
                encontrado=true;
                midocumento=(Documentos) qq.list().get(0);
           }else{
                encontrado=false;
                midocumento=new Documentos();
           }
           tx2.commit();
        }
        catch(HibernateException e){
            e.printStackTrace();
        }
        if(sesion.isOpen()){
            sesion.flush();
            sesion.clear();
            sesion.close();
        }
        return encontrado;
    }
    public Documentos getMiDocumento(){
        return this.midocumento;
    }

}
