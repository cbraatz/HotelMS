package imp;
  
import Hiber1.Factura;
import Hiber1.NewHibernateUtil;
import Hiber1.Subreserva;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FacturaGest{
    Session sesion=null;
    Subreserva subr=new Subreserva();
    Factura mifactura=new Factura();

    public void FacturaGest(){  //constructor
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }

    public Factura getMiFactura(){
        return this.mifactura;
    }
    public boolean ExisteFKCliente(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Factura where idcli = "+Integer.toString(id));
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
            Query q= sesion.createQuery("select count(idfac)from Factura");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(idfac)from Factura");
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
 public boolean existeNumFactEnTablaFactura(String numfac){
   Transaction tx=null;
   boolean resu=false;
   sesion=NewHibernateUtil.getSessionFactory().openSession();
   tx=sesion.beginTransaction();
   Query q=sesion.createQuery("from Factura where numfac = '"+numfac+"'");
   if(q.list().size()>0)
       resu=true;
   else
       resu=false;
   tx.commit();
   if(sesion.isOpen()){
       sesion.clear();
       sesion.close();
   }

   return resu;
 }
 public boolean esValidoNumFact(String strr){
    boolean valid=true;
    char[] arr=strr.toCharArray();
    for(int i=0;i<arr.length;i++){
        if(!(Character.isDigit(arr[i])|| arr[i]=='-')){ //si no es un numero o -
            valid=false;
            JOptionPane.showMessageDialog(null,"El Nº de Factura no es válido","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
            break;
        }
    }
    if (valid){  //tambien comprueba que no exista en la tabla ese num de fact
        FacturaGest fgs=new FacturaGest();
        if(fgs.existeNumFactEnTablaFactura(strr)){
            valid=false;
            JOptionPane.showMessageDialog(null,"El Nº de Factura ya existe","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    if(strr.length()>30)
        valid=false;
    try{
        int ult=Integer.parseInt(strr.substring(strr.length()-1, strr.length()));
        valid=true;
       }catch(NumberFormatException e){
           valid=false;
           JOptionPane.showMessageDialog(null,"El Nº de Factura debe terminal con un número","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
       }
    return valid;
}

 public String existeFacturaImpresaEnTablaFactura(int idress){  //retorna el string con los numeros de facturas activos
   Transaction tx=null;
   String resu="";
   sesion=NewHibernateUtil.getSessionFactory().openSession();
   tx=sesion.beginTransaction();
   Query q=sesion.createQuery("from Factura as f where f.emitida = '1' and f.reservacion = "+idress);
   if(q.list().size()>0){
       for(int i=0;i<q.list().size();i++){
            this.mifactura=(Factura) q.list().get(i);
            if(i>0)
                resu=resu+" y ";
            resu=resu+mifactura.getNumfac();
       }
   }
  /* tx.commit();
   if(sesion.isOpen()){
       sesion.clear();
       sesion.close();
   }*/

   return resu;
 }

}