package imp;

import Hiber1.Iva;
import Hiber1.NewHibernateUtil;
import Hiber1.Varios;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VariosGest{
    Session sesion=null;
    Varios varios=new Varios();
    Iva miiva=new Iva();
    EstadoGest estges=new EstadoGest();
    FormaPagoGest formges=new FormaPagoGest();
    BancoGest banges=new BancoGest();
    CargosGest carges=new CargosGest();
    TipomovGest tipomges=new TipomovGest();
    PuntosMenugest pumeges=new PuntosMenugest();
    MonedaGest monges=new MonedaGest();
    PaisGest paiges=new PaisGest();
    ProfesionGest profges=new ProfesionGest();
    TipoDocumentoGest tipodocges=new TipoDocumentoGest();
    UnidadMedidaGest umges= new UnidadMedidaGest();
    MotivoUtiGest mutiges=new MotivoUtiGest();
    UsuarioGest usuges=new UsuarioGest();
    IvaGest ivages=new IvaGest();
    MotivoDescGest modesges=new MotivoDescGest();
    ProvGest proges=new ProvGest();
    EmpleadoGest empges=new EmpleadoGest();
 
    public boolean EstaVariosCargado(){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Varios");
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }


    public void VariosGest(){  //constructor
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();

    }
    public boolean cargarPrimeraVez(){
        boolean re=false;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx1=sesion.beginTransaction();
            Iva iv=new Iva();
            iv=(Iva)sesion.get(Iva.class, 1);//por defecto se toma el 1ero
            
            if(iv!=null){
                varios=new Varios();
                varios.setIdvarios(1);
                varios.setCajaabierta('0');
                varios.setConectado('0');
                varios.setDiasretraso(5);
                varios.setPoruti(Float.parseFloat("25"));
                varios.setEdadnino(11);
                varios.setIva(iv);
                varios.setProxnumfac("000-000-0001");
                varios.setSerial("");
                sesion.saveOrUpdate(varios);
                re= true;
            }else
                re= false;
            tx1.commit();
            CERRARSesion();
        }catch(HibernateException ex){
            ex.printStackTrace();
            re= false;
        }
        return re;
    }
public boolean inicializarTodo(){
    int c=0;
    try{
        if(estges.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error1");
        if(formges.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error2");
        if(banges.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error3");
        if(carges.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error4");
        if(tipomges.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error5");
        if(pumeges.cargarListaPuntos())
            c++;
        else
            System.out.println("error6");
        if(paiges.cargarListaPaises())
            c++;
        else
            System.out.println("error7");
        if(monges.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error8");
        if(profges.cargarListaProfesiones())
            c++;
        else
            System.out.println("error9");
        if(tipodocges.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error10");
        if(umges.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error11");
        if(mutiges.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error12");
        if(empges.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error13");
        if(usuges.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error14");
        if(ivages.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error15");
        if(modesges.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error16");
        if(proges.cargarCamposPorDefecto())
            c++;
        else
            System.out.println("error17");
        if(this.cargarPrimeraVez())
            c++;
        else
            System.out.println("error18");
        if(c==18)
            return true;
        else
            return false;
    }catch(HibernateException ex){
        return false;
    }
}
    public boolean ExisteFKIva(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Varios where idiva = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }

    public boolean ExisteFKUsuario(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Varios where idusuario = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }

    public void actualizarVarios(){ //actualiza con el contenido en tabla, que se debe hacer cada vez
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        try{
            Transaction tx=sesion.beginTransaction();
            varios=new Varios();
            varios=(Varios)sesion.get(Varios.class, 1);
            miiva=varios.getIva();
            tx.commit();
            CERRARSesion();
        }
        catch(HibernateException e){
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null,"Error al iniciar sesión de usuario","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void CERRARSesion(){
        if(sesion.isOpen()){
            sesion.flush();
            sesion.clear();
            sesion.close();
        }
   }
     public boolean estaConectadoAlgunUsuario(){
        actualizarVarios();
        if(varios.getConectado()=='1')
            return true;
        else
            return false;
    }

    public Varios getVarios(){
        actualizarVarios();
        return this.varios;
    }
    public Iva getIva(){
        actualizarVarios();
        return this.miiva;
    }
}