package imp;

import Hiber1.Empleado;
import Hiber1.NewHibernateUtil;
import Hiber1.Puntosmenu;
import Hiber1.Usuarios;
import Hiber1.Usuarioxpunto;
import Soporte.codigo;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsuarioGest{
    Session sesion=null;
    Usuarios miusuario=new Usuarios();
    int codigoempleado=0;
    PuntosMenugest pumeges=new PuntosMenugest();
    public void UsuarioGest(){  //constructor
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    public void CERRARSesion(){
        if(sesion.isOpen()){
            sesion.flush();
            sesion.clear();
            sesion.close();
        }
   } 
    public boolean cargarCamposPorDefecto(){
        int longi=pumeges.getLongitudArray();
        boolean respu=false;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx1=sesion.beginTransaction();
            Empleado em=new Empleado();
            em=(Empleado) sesion.get(Empleado.class, 1);
            if(em!=null){
                Usuarios usu=new Usuarios();
                usu.setIdusuario(1);
                usu.setPass(codigo.MD5("0102030405"));
                usu.setUsuario("Admin");
                usu.setEmpleado(em);
                miusuario=usu;
                sesion.saveOrUpdate(usu);
                int cont=0;
                for(int i=0;i<longi;i++){
                    Puntosmenu pume=new Puntosmenu();
                    pume=(Puntosmenu) sesion.get(Puntosmenu.class, i+1);
                    if(pume!=null){
                        Usuarioxpunto uxp=new Usuarioxpunto();
                        uxp.setIdusuarioxpunto(i+1);
                        uxp.setUsuarios(miusuario);
                        uxp.setPuntosmenu(pume);
                        sesion.saveOrUpdate(uxp);
                        cont++;
                    }
                }
                tx1.commit();
                CERRARSesion();
                if(cont==longi-1)
                    respu=true;
                else
                    respu=false;
            }else
                respu=false;
        }catch(HibernateException ex){
           // ex.printStackTrace();
            respu=false;
        }catch (NoSuchAlgorithmException ex2) {
           //  ex2.printStackTrace();
            respu=false;
        }catch (UnsupportedEncodingException ex3) {
           //  ex3.printStackTrace();
            respu=false;
        }
        return respu;
    }
    public int getCodigoEmpleado(){
        return codigoempleado;
    }
    public int getsiguientecodigo(){
        int siguientecodigo=0;
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx=null;
        try{
            tx=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(idusuario)from Usuarios");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(idusuario)from Usuarios");
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
    public int getsiguientecodigoUsuarioWeb(){
        int siguientecodigo=0;
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx=null;
        try{
            tx=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(idusuweb)from Usuariosweb");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(idusuweb)from Usuariosweb");
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

     public boolean existeUsuario(String usu, String cont){
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        boolean encontrado=false;
        Transaction tx2=null;
        try{
           tx2=sesion.beginTransaction();
           Query qq=sesion.createQuery("from Usuarios where usuario = '"+usu+"' and pass = '"+cont+"'");
           if(qq.list().size()>0){ //si no se encontro
                encontrado=true;
                this.miusuario=(Usuarios)qq.list().get(0);
                codigoempleado=miusuario.getEmpleado().getIdempleado();
           }else{
                encontrado=false;
                this.miusuario=new Usuarios();
           }
           tx2.commit();
        }
        catch(HibernateException e){
            JOptionPane.showMessageDialog(null,"Error al comprobar los datos del usuario en la base de datos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(sesion.isOpen()){
            sesion.clear();
            sesion.close();
        }
        return encontrado;
    }
    public Usuarios getMiUsuario(){
        return this.miusuario;
    }
    public boolean existeUsuarioConId(int idusu){
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        boolean encontrado=false;
        Transaction tx2=null;
        try{
           tx2=sesion.beginTransaction();
           Query qq=sesion.createQuery("from Usuarios where idusuario = "+idusu);
           if(qq.list().size()>0){ //si no se encontro
                encontrado=true;
                this.miusuario=(Usuarios)qq.list().get(0);
                codigoempleado=miusuario.getEmpleado().getIdempleado();
           }else{
                encontrado=false;
                this.miusuario=new Usuarios();
           }
           tx2.commit();
        }
        catch(HibernateException e){
            JOptionPane.showMessageDialog(null,"Error al comprobar los datos del usuario en la base de datos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        this.CERRARSesion();
        return encontrado;
    }
    public boolean delUsuario(Usuarios obj) throws IOException{
      //devuelve true si la transaccion es exitosa false si no lo es
      Transaction tx3=null;
      boolean resp=false;
      try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx3=sesion.beginTransaction();
            sesion.delete(obj);  //la sesion borra el objeto tipo Banco que le pasemos como parametro
            tx3.commit();   //si todo anda bien se ejecuta
            CERRARSesion();
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          tx3.rollback();
          e.printStackTrace();
          JOptionPane.showMessageDialog(null,"Ha ocurrido un error al BORRAR el registro","ERROR AL BORRAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      finally{
          return resp;
      }

    }
}