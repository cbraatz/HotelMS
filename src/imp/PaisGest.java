package imp;

import Hiber1.NewHibernateUtil;
import Hiber1.Pais;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.hibernate.*;


public class PaisGest {

   public PaisGest(){
        this.sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
   }
 
   Session sesion = null;
   public boolean existe=false;  //campo que señala si la ultima busqueda dio true o false
   private Pais pais=null; //guarda el objeto de la ultima busqueda

   public Pais GetObjPais(){
       return pais;
   }
    public void CERRARSesion(){
       if(this.sesion.isOpen()){
          sesion.clear();
          sesion.close();
       }
    }
   /* public void cargarCampoPorDefecto(){
        ///////////////////////guarda PARAGUAY///////////////////////////////////
        this.sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1=sesion.beginTransaction();
        pais=new Pais();
        pais.setIdpais(1);
        pais.setDescrippais("PARAGUAY");
        sesion.saveOrUpdate(pais);
        tx1.commit();
        CERRARSesion();
    }*/
    public int getsiguientecodigo(){

        int siguientecodigo=0;
        Transaction tx4=null;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx4=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(idpais)from Pais");
            if(Integer.parseInt(q.list().get(0).toString())==0){
                //cargarCampoPorDefecto();
                siguientecodigo=1;
            } else {
                Query qq= sesion.createQuery("select max(idpais)from Pais");
                siguientecodigo=Integer.parseInt(qq.list().get(0).toString());
                if (siguientecodigo < 2147483647){  //si no exede el rango de un entero
                   if(siguientecodigo>1)
                        siguientecodigo=siguientecodigo+1;
                   else{
                        //cargarCampoPorDefecto();
                        siguientecodigo=1;
                   }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Número máximo de registros alcanzado","NO SE PUEDEN CARGAR MÁS REGISTROS",JOptionPane.INFORMATION_MESSAGE);
                    siguientecodigo=0;
                }
            }
         //   tx4.commit();  //guarda los cambios hechos en la transaccion, en este caso no seria necesario
            CERRARSesion();
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo =0;
          //  tx4.rollback();  //vuelve al estado anterior en caso de que de error

        }finally{
            return siguientecodigo;
        }

   }

public boolean cargarListaPaises(){
    String[] arraypaises={"Paraguay","Afganistan","Africa del Sur","Albania","Alemania","Andorra","Angola","Antigua y Barbuda",
            "Antillas Holandesas","Arabia Saudita","Argelia","Argentina","Armenia","Aruba","Australia","Austria",
            "Azerbaijan","Bahamas","Bahrain","Bangladesh","Barbados","Belarusia","Belgica","Belice","Benin","Bermudas",
            "Bolivia","Bosnia","Botswana","Brasil","Brunei Darussulam","Bulgaria","Burkina Faso","Burundi","Butan",
            "Camboya","Camerun","Canada","Cape Verde","Chad","Chile","China","Chipre","Colombia","Comoros","Congo",
            "Corea del Norte","Corea del Sur","Costa de Marfíl","Costa Rica","Croasia","Cuba","Dinamarca","Djibouti",
            "Dominica","Ecuador","Egipto","El Salvador","Emiratos Arabes Unidos","Eritrea","Eslovenia","España",
            "Estados Unidos","Estonia","Etiopia","Fiji","Filipinas","Finlandia","Francia","Gabon","Gambia","Georgia",
            "Ghana","Granada","Grecia","Groenlandia","Guadalupe","Guam","Guatemala","Guayana Francesa","Guerney",
            "Guinea","Guinea-Bissau","Guinea Equatorial","Guyana","Haiti","Holanda","Honduras","Hong Kong","Hungria",
            "India","Indonesia","Irak","Iran","Irlanda","Islandia","Islas Caiman","Islas Faroe","Islas Malvinas",
            "Islas Marshall","Islas Solomon","Islas Virgenes Britanicas","Islas Virgenes (U.S.)","Israel","Italia",
            "Jamaica","Japon","Jersey","JJordania","Kazakhstan","Kenia","Kiribati","Kuwait","Kyrgyzstan","Laos",
            "Latvia","Lesotho","Libano","Liberia","Libia","Liechtenstein","Lituania","Luxemburgo","Macao","Macedonia",
            "Madagascar","Malasia","Malawi","Maldivas","Mali","Malta","Marruecos","Martinica","Mauricio","Mauritania",
            "Mexico","Micronesia","Moldova","Monaco","Mongolia","Mozambique","Myanmar (Burma)","Namibia","Nepal",
            "Nicaragua","Niger","Nigeria","Noruega","Nueva Caledonia","Nueva Zealandia","Oman","Pakistan","Palestina",
            "Panama","Papua Nueva Guinea","Peru","Polinesia Francesa","Polonia","Portugal","Puerto Rico","Qatar",
            "Reino Unido","República Centroafricana","República Checa","República Democratica del Congo","Republica Dominicana",
            "Republica Eslovaca","Reunion","Ruanda","Rumania","Rusia","Sahara","Samoa","San Cristobal-Nevis (St. Kitts)",
            "San Marino","San Vincente y las Granadinas","Santa Helena","Santa Lucia","Santa Sede (Vaticano)","Sao Tome & Principe",
            "Senegal","Seychelles","Sierra Leona","Singapur","Siria","Somalia","Sri Lanka (Ceilan)","Sudan","Suecia",
            "Suiza","Sur Africa","Surinam","Swaziland","Tailandia","Taiwan","Tajikistan","Tanzania","Timor Oriental","Togo",
            "Tokelau","Tonga","Trinidad & Tobago","Tunisia","Turkmenistan","Turquia","Ucrania","Uganda","Union Europea",
            "Uruguay","Uzbekistan","Vanuatu","Venezuela","Vietnam","Yemen","Yugoslavia","Zambia","Zimbabwe"};
    int cont=0;
    try{
    this.sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1=sesion.beginTransaction();
    for(int i=0;i<arraypaises.length;i++){
        Pais pai=new Pais();
        pai.setIdpais(i+1);
        pai.setDescrippais(arraypaises[i].toUpperCase());
        sesion.saveOrUpdate(pai);
        cont++;
    }
        tx1.commit();
        CERRARSesion();
    }catch(HibernateException e){
        e.printStackTrace();
    }
    if(cont==arraypaises.length)
        return true;
    else
        return false;
}

public boolean addPais(Pais obj){
      //devuelve true si la transaccion es exitosa
      //false si no lo es
      boolean resp=false;
      Transaction tx1=null;
      try{
        this.sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx1=sesion.beginTransaction();
        sesion.save(obj);
        tx1.commit();   //si todo anda bien se ejecuta
        CERRARSesion();
        resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          e.printStackTrace();
          tx1.rollback();
          JOptionPane.showMessageDialog(null,"Ha ocurrido un error al CARGAR el registro a la Base de Datos","ERROR AL AGREGAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      finally{
          return resp;
      }

    }

    public boolean editPais(Pais obj){
      //devuelve true si la transaccion es exitosa
      //false si no lo es
      Transaction tx2=null;
      boolean resp=false;
      try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx2=sesion.beginTransaction();
            sesion.saveOrUpdate(obj); 
            tx2.commit();   //si todo anda bien se ejecuta
            CERRARSesion();
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          e.printStackTrace();
          tx2.rollback();
          JOptionPane.showMessageDialog(null,"Ha ocurrido un error al EDITAR el registro","ERROR AL EDITAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      finally{
          return resp;
      }

    }

    public boolean delPais(Pais obj){
      //devuelve true si la transaccion es exitosa false si no lo es
      Transaction tx3=null;
      boolean resp=false;
      try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx3=sesion.beginTransaction();
            sesion.delete(obj); 
            tx3.commit();   //si todo anda bien se ejecuta
            CERRARSesion();
            resp =true; //devolvemos transaccion satisfactoria
      }catch(HibernateException e) { // si existe cualquier tipo de error al momento de guardar los datos hace el rollback
          e.printStackTrace();
          tx3.rollback();
          JOptionPane.showMessageDialog(null,"Ha ocurrido un error al BORRAR el registro","ERROR AL BORRAR REGISTRO",JOptionPane.ERROR_MESSAGE);
          resp =false;
      }
      finally{
          return resp;
      }

    }
    public boolean ExisteIdEnTabla(int id){
    Transaction tx5=null;
    try{
        this.sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx5=sesion.beginTransaction();
        Query q=sesion.createQuery("from Pais where idpais = "+Integer.toString(id));
        if(q.list().isEmpty()){  //si no se encontro
            existe=false;
            this.pais=new Pais();
        }
        else{
            existe=true;
            this.pais=(Pais)q.list().get(0); //el primer elemento de la lista

        }
        tx5.commit();
        CERRARSesion();
    }
    catch(HibernateException h){
            h.printStackTrace();
            existe=false;
            tx5.rollback();  //vuelve al estado anterior en caso de que de error
        }finally{
            return existe;
        }
    }
}

