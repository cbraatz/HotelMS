package Soporte;
import java.awt.Dialog.ModalExclusionType;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.util.*;
import java.io.*;
import org.hibernate.Session;
public class ClaseReporte extends Thread{
    public ClaseReporte() {

    }
    public ClaseReporte(String URL, String USR, String PASS) {
        this.url=URL;
        this.usr=USR;
        this.pass=PASS;
    }
    ConversionCientifica conv = new ConversionCientifica();
    String url="jdbc:mysql://localhost/hotel";
    String usr="root";
    String pass="kegler11";
    BaseImp bi=new BaseImp();
    clasesutiles cluti=new clasesutiles();
    Connection con;
    Session sesion=null;
    public void MostrarReporte(String archivo, String titulo){
        try {
            bi.RegistrarJDBC("com.mysql.jdbc.Driver");
            con = bi.Conectar(url, usr, pass);
            String direccionreporte=System.getProperty("user.dir")+"/src/Reportes/"+archivo+".jasper";  //ruta relativa al reporte
            JasperReport reporte = (JasperReport) JRLoader.loadObject(direccionreporte);
            JasperPrint jasperPrint= JasperFillManager.fillReport(reporte,null,con);
            JasperViewer jviewer= new JasperViewer(jasperPrint,false);
            jviewer.setTitle(titulo);
            jviewer.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);  //para que muestre el informe en frente del jdialog
            jviewer.setVisible(true);
        } catch (JRException ex) {
           // Logger.getLogger(frmparaprueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void MostrarReporte(String archivo, String titulo, Map parametros){
        try {
            bi.RegistrarJDBC("com.mysql.jdbc.Driver");
            con = bi.Conectar(url, usr, pass);
            String direccionreporte=System.getProperty("user.dir")+"/src/Reportes/"+archivo+".jasper";  //ruta relativa al reporte
            JasperReport reporte = (JasperReport) JRLoader.loadObject(direccionreporte);
            JasperPrint jasperPrint= JasperFillManager.fillReport(reporte,parametros,con);
            JasperViewer jviewer= new JasperViewer(jasperPrint,false);
            jviewer.setTitle(titulo);
            jviewer.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);  //para que muestre el informe en frente del jdialog
            jviewer.setVisible(true);
        } catch (JRException ex) {
           // Logger.getLogger(frmparaprueba.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    public void MostrarReporte(String archivo, String titulo, String titulo2){
        try{
            bi.RegistrarJDBC("com.mysql.jdbc.Driver");
            con = bi.Conectar(url, usr, pass);
            //Pasamos parametros al reporte Jasper.
            Map parametros = new HashMap();
            parametros.put("vartitulo",titulo2);
            String direccionreporte=System.getProperty("user.dir")+"/src/Reportes/"+archivo+".jasper";  //ruta relativa al reporte
            JasperReport reporte = (JasperReport) JRLoader.loadObject(direccionreporte);
            JasperPrint jasperPrint= JasperFillManager.fillReport(reporte,parametros,con);
            JasperViewer jviewer= new JasperViewer(jasperPrint,false);
            jviewer.setTitle(titulo);
            jviewer.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);  //para que muestre el informe en frente del jdialog
            jviewer.setVisible(true);
        }catch (JRException ex) {
            Logger.getLogger(frmparaprueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String obtenerNumeroSinComa00(String str){// no funciona
       StringTokenizer tok = new StringTokenizer(str,",00");
       String r1="";
       try{
            r1=tok.nextToken();
       }catch(NoSuchElementException e){}
       return r1;
    }
    public void MostrarFactura(String numfac, String let, float tot, float totiva, float hosp, float cons, String nom, String ruc, String dire, String tel, String fec, String item1, String item2) throws FileNotFoundException{
        String strTotal=this.conv.conversion(Math.round(tot));
        String strIva=this.conv.conversion(Math.round(totiva));
        String strHosp=this.conv.conversion(Math.round(hosp));
        String strCons=this.conv.conversion(Math.round(cons));
        String puerto="LPT1:";
        System.out.println(strTotal);
        System.out.println(strHosp);
        System.out.println(strCons);
     /*   strTotal=this.obtenerNumeroSinComa00(strTotal);   no funciona
        strIva=this.obtenerNumeroSinComa00(strIva);
        strHosp=this.obtenerNumeroSinComa00(strHosp);
        strCons=this.obtenerNumeroSinComa00(strCons);
        System.out.println(strTotal);
        System.out.println(strHosp);
        System.out.println(strCons);*/
       /* strTotal=this.obtenerNumeroSinComa00(strTotal);
        strIva=this.obtenerNumeroSinComa00(strIva);
        strHosp=this.obtenerNumeroSinComa00(strHosp);
        strCons=this.obtenerNumeroSinComa00(strCons);*/
     /*   sesion=NewHibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Varios var=new Varios();
        var=(Varios) sesion.get(Varios.class, 1);
        if(var!=null){
           if(var.getPuerto().isEmpty()==false)
                puerto=var.getPuerto();
        }
        if(sesion.isOpen())
            sesion.close();*/
        //File file=new File("LPT1:");
        //Impresión en Java2 mediante FileOutputStream
        //La clase debe de implementar la impresión implements Printable
        //try {
          //Esto saldría en la consola de java o en la consola de sistema operatico
          //enviar a imprimir en pantalla.
         // FileDescriptor fd = FileDescriptor.out;
         // FileOutputStream os = new FileOutputStream(fd);

          //enviar a imprimir a la impresora en red, debemos conocer el nombre de la
          //impresora.
          //Desde windows se puede poner ...new FileOutputStream("//Au-4022/hp1100");

          //Formato UNIX
          //FileOutputStream os = new FileOutputStream("\\\\Au-4022\\hp1100");

          //Si tuviesemos la impresora en el puerto paralelo
          FileOutputStream os = new FileOutputStream(puerto);
          //Si tuviesemos la impresora en el puerto serie
          //FileOutputStream os = new FileOutputStream("COM1:");

          //Enviar a un archivo de texto.
         // FileOutputStream os = new FileOutputStream("nombre_archivo.txt");
          PrintStream ps = new PrintStream(os);
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          String linea="           "+fec;
          linea=cluti.autocompletarString(linea, 56, ' ');
          ps.println(linea+"X");
          linea="             "+nom;
          ps.println(linea);
          linea="  "+ruc;
          linea=cluti.autocompletarString(linea, 57, ' ');
          ps.println(linea+tel);
          linea="      "+dire;
          ps.println(linea);
         // ps.println("");
          ps.println(" ");
          ps.println(" ");
          linea=" 1     "+item1;
          linea=cluti.autocompletarString(linea, 37, ' ');
          linea=linea+strHosp;
          linea=cluti.autocompletarString(linea, 64, ' ');
          linea=linea+strHosp;
          ps.println(linea);
          if(cons>0){
              linea=" 1     "+item2;
              linea=cluti.autocompletarString(linea, 37, ' ');
              linea=linea+strCons;
              linea=cluti.autocompletarString(linea, 64, ' ');
              linea=linea+strCons;
              ps.println(linea);
          }else
              ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          ps.println(" ");
          if(let.length()<=72)
              ps.println(" ");
          linea="                                                                "+strTotal;
          ps.println(linea);
          let=let.toLowerCase();
          linea="         "+let;
          ps.println(linea);
          linea="                          "+strIva;
          linea=cluti.autocompletarString(linea, 45, ' ');
          linea=linea+strIva;
          ps.println(linea);
          ps.close();



       /* }catch(Exception e){
          System.out.println("Error: "+e.getMessage());
        }*/
    }
   /* public static void main(String[] ad){
        ClaseReporte cr=new ClaseReporte();
        System.out.println(cr.obtenerNumeroSinComa00("20.000,00"));
    }*/
}
