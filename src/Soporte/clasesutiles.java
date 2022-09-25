package Soporte;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

public class clasesutiles {   //estas son algunas de las clases creadas para diversos fines
private final int[] arrayreservas=new int[100];   //para guardar el resultado de la reserva
private final String[] arrayMeses={"","enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
public int[] getarray(){
    return this.arrayreservas;
}
    /////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////PARA FECHA//////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////
public String fechaStrDMAaFechaFormatoLargo(String fec){
    String d, m, a;
    StringTokenizer tokens=null;
    if(EsGuion(fec)>0){
        try{
            tokens = new StringTokenizer(fec,"-");
            d = tokens.nextToken();
            m = tokens.nextToken();
            a = tokens.nextToken();
            return d+" de "+this.arrayMeses[Integer.parseInt(m)]+" de "+a;
        }
        catch(NoSuchElementException e2){
            return "";
        }
    }else{
      if(EsBarra(fec)>0){
        try{
            tokens = new StringTokenizer(fec,"/");
            d = tokens.nextToken();
            m = tokens.nextToken();
            a = tokens.nextToken();
            return d+" de "+this.arrayMeses[Integer.parseInt(m)]+" de "+a;
        }
        catch(NoSuchElementException e2){
            return "";
        }
      }else
          return "";
    }

}
public boolean FechaValidaDMA(String fec) {  //devuelve un boolean si la fecha es valida o no
if(EsGuion(fec)>0)
    fec=Remplazar('-','/',fec);  //cambia el - por la / para hacer el calculo
try {                                       //admite / y -
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
    formatoFecha.setLenient(false);
    formatoFecha.parse(fec);
}
catch (ParseException e) {
    return false;
}
return true;
}

public boolean FechaValidaAMD(String fec) {  //devuelve un boolean si la fecha es valida o no
if(EsGuion(fec)>0)
    fec=Remplazar('-','/',fec);  //cambia el - por la / para hacer el calculo
try {                                       //admite / y -
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault());
    formatoFecha.setLenient(false);
    formatoFecha.parse(fec);
}
catch (ParseException e) {
    return false;
}
return true;
}

public Calendar Date_Calender(Date fecha) {
       Calendar cal=Calendar.getInstance();
       cal.setTime(fecha);
       return cal;
}

public static Date Calender_Date(Calendar cal) {
       return cal.getTime();
}

public Date StrDMA_Date(String str_fecha) throws ParseException{  //devuelve la fecha con -
    if(EsBarra(str_fecha)>0)
    str_fecha=Remplazar('/','-',str_fecha);  //cambia el / por la - para hacer el calculo
    DateFormat forma ;
    Date fecha;
    forma = new SimpleDateFormat("dd-MM-yyyy");
    fecha = (Date)forma.parse(str_fecha);
   return fecha;
}

public Date StrAMD_Date(String str_fecha) throws ParseException{  //devuelve la fecha con -
    if(EsBarra(str_fecha)>0)
    str_fecha=Remplazar('/','-',str_fecha);  //cambia el / por la - para hacer el calculo
    DateFormat forma ;
    Date fecha;
    forma = new SimpleDateFormat("yyyy-MM-dd");
    fecha = (Date)forma.parse(str_fecha);
   return fecha;
}

public String Date_StringDMA(Date fecha){ //transforma date a string  //puse static para poder llamarle del main
    String str=null;
    int v1, v2, v3;
    String sv1="";
    String sv2="";
    String sv3="";
    v1=fecha.getDate();
    v2=fecha.getMonth();
    v2=v2+1;
    v3=fecha.getYear();
    if (v3<100) //es 101 para 2001 y 95 para 1995
      sv3="19"+v3;
    else
      sv3=Integer.toString((v3-100)+2000);
    if (v1<10)
        sv1="0"+v1;
    else
        sv1=Integer.toString(v1);
    if (v2<10)
        sv2="0"+v2;
    else
        sv2=Integer.toString(v2);
    str=sv1+"-"+sv2+"-"+sv3;
    return str;
}

public String Date_StringAMD(Date fecha){ //transforma date a string  //puse static para poder llamarle del main
    String str=null;
    int v1, v2, v3;
    String sv1="";
    String sv2="";
    String sv3="";
    v1=fecha.getDate();
    v2=fecha.getMonth();
    v2=v2+1;
    v3=fecha.getYear();
    if (v3<100) //es 101 para 2001 y 95 para 1995
      sv3="19"+v3;
    else
      sv3=Integer.toString((v3-100)+2000);
    if (v1<10)
        sv1="0"+v1;
    else
        sv1=Integer.toString(v1);
    if (v2<10)
        sv2="0"+v2;
    else
        sv2=Integer.toString(v2);
    str=sv3+"-"+sv2+"-"+sv1;
    return str;
}

public boolean fechavacia(Date fe){ //retorna verdadero si es fecha vacia
    if (fe.toString()=="0000-00-00")
        return true;

    return false;
 }

public String FormatearFecha(String vFecha){  // cambia el formato de la fecha
    String v1, v2, v3;                                //manteniendo la / o el -
    StringTokenizer tokens=null;
    Date fe=new Date();
    if(EsGuion(vFecha)>0){
        if(EsGuion(vFecha)>0){
        try{
            tokens = new StringTokenizer(vFecha,"-");
            v1 = tokens.nextToken();
            v2 = tokens.nextToken();
            v3 = tokens.nextToken();
            return v3+"-"+v2+"-"+v1;
        }
        catch(NoSuchElementException e2){
            return "";
        }
      }
    }
    else{
      if(EsBarra(vFecha)>0){
        try{
            tokens = new StringTokenizer(vFecha,"/");
            v1 = tokens.nextToken();
            v2 = tokens.nextToken();
            v3 = tokens.nextToken();
            return v3+"/"+v2+"/"+v1;
        }
        catch(NoSuchElementException e2){
            return "";
        }
      }
    }
    return "";  //xq si o si tiene que retornar algo fuera del if xq sino da error
}
public int obtenerDiferenciaDeFechasEnDias(Date fecha1, Date fecha2) {  //hace la difenrencia entre 2 fechas y retorna la cantidad de dias transcurridos
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString = df.format(fecha1);
        try {
            fecha1 = df.parse(fechaInicioString);
        }
        catch (ParseException ex) {

        }

        String fechaFinalString = df.format(fecha2);
        try {
            fecha2 = df.parse(fechaFinalString);
        }
        catch (ParseException ex) {
        }

        long fecha1Ms = fecha1.getTime();
        long fecha2Ms = fecha2.getTime();
        long dife = fecha1Ms - fecha2Ms;   //controlar
        double dias = Math.floor(dife / (1000 * 60 * 60 * 24));
        return ( (int) dias);
    }
public int obtenerDiferenciaDeFechasEnDias2(String finicio, String ffin) {  //lo mismo que el anterior pero con la fecha de entrada como string
        Date fecha1=new Date();
        Date fecha2=new Date();
        DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM);
        try {
            fecha1=StrDMA_Date(finicio);
            fecha2=StrDMA_Date(ffin);
            String fechaInicioString = df.format(fecha1);
            fecha1 = df.parse(fechaInicioString);
        }
        catch (ParseException ex) {

        }

        String fechaFinalString = df.format(fecha2);
        try {
            fecha2 = df.parse(fechaFinalString);
        }
        catch (ParseException ex) {
        }

        long fecha1Ms = fecha1.getTime();
        long fecha2Ms = fecha2.getTime();
        long dife = fecha1Ms - fecha2Ms;   //controlar
        double dias = Math.floor(dife / (1000 * 60 * 60 * 24));
        return ( (int) dias);
    }
public int obtenerDiferenciaDeFechasEnAnhos(String fin, String ffi){
        int anos = 0;
        try {
            Date fechaInicial = StrDMA_Date(fin);
            Date fechaFinal = StrDMA_Date(ffi);
            GregorianCalendar calendar = new GregorianCalendar();
            int dias = this.obtenerDiferenciaDeFechasEnDias(fechaInicial, fechaFinal);
            Calendar cfi = Date_Calender(fechaInicial); //convierte la fecha a calendar
            Calendar cff = Date_Calender(fechaFinal);
            for (Calendar c = cfi; c.get(Calendar.YEAR) <= cff.get(Calendar.YEAR); c.add(Calendar.YEAR, 1)) {
                if (calendar.isLeapYear(c.get(Calendar.YEAR))) {
                    dias--;
                }
            }
            anos = (int) dias / 365;

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return anos;
}

public boolean esFecha1MayorALaFecha2(String f1, String f2){  //utilizado para validacion
        boolean ress = false;
        try {
            Date d1 = StrDMA_Date(f1);
            Date d2 = StrDMA_Date(f2);
            if (obtenerDiferenciaDeFechasEnDias(d1, d2) > 0) {
                ress = true;
            }

        }
         catch (ParseException ex) {
            ex.printStackTrace();
        }
        return ress;
    }

    public boolean esFecha1MenorALaFecha2(String f1, String f2){  //utilizado para validacion
        boolean ress = false;
        try {
            Date d1 = StrDMA_Date(f1);
            Date d2 = StrDMA_Date(f2);
            if (obtenerDiferenciaDeFechasEnDias(d1, d2) < 0) {
                ress = true;
            }

        }
         catch (ParseException ex) {
            ex.printStackTrace();
        }
        return ress;
    }
    public boolean esFecha1IgualALaFecha2(String f1, String f2){  //utilizado para validacion
        boolean ress = false;
        try {
            Date d1 = StrDMA_Date(f1);
            Date d2 = StrDMA_Date(f2);
            if (obtenerDiferenciaDeFechasEnDias(d1, d2) == 0) {
                ress = true;
            }

        }
         catch (ParseException ex) {
            ex.printStackTrace();
        }
        return ress;
    }
    public String ObtenerFechaSinGuion(String ff){  //saca el guion a la fecha, se usa para cargar el jformatedtextfield
        String strres="";
        try{
            StringTokenizer tok = new StringTokenizer(ff,"-");
            String s1 = tok.nextToken();
            String s2 = tok.nextToken();
            String s3 = tok.nextToken();
            strres=s1+s2+s3;

        }
        catch(NoSuchElementException e2){
            strres= "";
        }
        finally{
            return strres;
        }
   }
  public String ObtenerFechaSinBarra(String ff){  //saca el guion a la fecha, se usa para cargar el jformatedtextfield
        String strres="";
        try{
            StringTokenizer tok = new StringTokenizer(ff,"/");
            String s1 = tok.nextToken();
            String s2 = tok.nextToken();
            String s3 = tok.nextToken();
            strres=s1+s2+s3;

        }
        catch(NoSuchElementException e2){
            strres= "";
        }
        finally{
            return strres;
        }
   }

  public String dateAFechaEnCastellano(Date fe){
        String[]arr={"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
        String r="";
        int ii=fe.getYear();
        if (ii<100) //es 101 para 2001 y 95 para 1995
          r="19"+ii;
        else
        r=Integer.toString((ii-100)+2000);
        return fe.getDate()+" DE "+arr[fe.getMonth()]+" DE "+r;
  }
    /////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////OTROS////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////
    Session Sesion=null;

    public void codificar(){
        int numero =0;
        int dividendo =0;
        int residuo =0;
        int cociente =0;
        int [] hexal = new int [16];
        int tamaño = 0;
        int otro=0;
        //Guardamos el numero ingresado en pantalla en la variable dividendo
        dividendo =numero;

        if(dividendo==0){
        otro=dividendo;

        }
        //Realizar operaciones y almacenar en vector con tamaño definido por contador
        while (dividendo > 0){
            cociente = dividendo / 16;
            residuo = dividendo % 16;
            hexal [tamaño] = residuo;
            tamaño = tamaño + 1;
            dividendo = cociente;
        }



        //Mostrar el resultado en pantalla
        System.out.println("El numero Hexal es: ");
        for (int i =(tamaño-1);i>=0;i--){
            if (hexal[i] >= 0 && hexal[i] <= 9)
                System.out.print(+hexal[i]);
            else{
                switch(hexal[i]){
                    case 10: {System.out.print("A");break;}
                    case 11: {System.out.print("B");break;}
                    case 12: {System.out.print("C");break;}
                    case 13: {System.out.print("D");break;}
                    case 14: {System.out.print("E");break;}
                    case 15: {System.out.print("F");break;}
                }
            }

            System.out.println(" ");

        }




    }

public String Remplazar(char a, char b, String cad){ //remplaza el 1er char por el 2do en el String especificado
    return cad.replace(a, b);         //los char van entre ''
}
public int contadorfilas(ResultSet resu){  //cuenta las filas del resultset
        try{
        resu.beforeFirst();

        int x=0;
        for (;;){
            if (resu.absolute(x+1)==true){
               x=x+1;}
            else{
                break;
               }
        }
        System.out.println(x+"");
        return x;
        }
        catch(SQLException e){return -1;}
}
public int EsGuion(String cad){  //busca el guion en el string y devuelve el numero de posicion
                                            //y si no encuentra devuelve CERO
    int n=cad.length();
    for(int i=0;i<n;i++){
        if(cad.charAt(i)=='-')
            return i+1;
    }
    return 0;
}

public int EsBarra(String cad){  //busca la barra en el string y devuelve el numero de posicion
                                            //y si no encuentra devuelve CERO
    int n=cad.length();
    for(int i=0;i<n;i++){
        if(cad.charAt(i)=='/')
            return i+1;
    }
    return 0;
}

class MiDefaultTableModel extends DefaultTableModel {   //esta clase hace que ninguna columna de jtable sea editable
        public MiDefaultTableModel() {                  //ESTA CLASE SE DEBE LLEVAR TAL CUAL AL FORMULARIO, PORQUE SE NECESITA CREAR UN OBJETO DE ESTA CLASE
            super();
        }
        public boolean isCellEditable(int row, int col) {
            return false;
        }
   }

class MiDefaultTableModel2 extends DefaultTableModel {   //esta clase permita que 1 columna de jtable sea editable y el resto no
    int col=0;                                             //CLASE NO PROBADA
        public MiDefaultTableModel2(int co) {
            super();
            this.col=co;
        }
        public boolean isCellEditable(int row, int column) {
        if (column==col) {
        return true;  //La columna col es editable.
    }
        return false;  //El resto de celdas no son editables.
   }

}

    public float redondear(float nume){
        float entero=Math.round(nume);
        float dife=nume-entero;  //contiene 0,algo si nume tiene decimales
        if(dife>0 && dife<1)  //si tiene decimales
           return (float)(Math.rint(nume * 1000) / 1000);   //redondea a 3 decimales y parsea a float xq la funcion retorna un double
        else
           return nume;
    }

    public float redondearEnterosHastaLaCentena(float nume){
        float entero=Math.round(nume);
        float dife=nume-entero;  //contiene 0,algo si nume tiene decimales
        return (float)(Math.rint(nume/100)* 100);   //redondea a 3 decimales y parsea a float xq la funcion retorna un double

    }

    public String autocompletarString(String str1, int numfin, char caragreg){
        if(str1.length()<numfin){
            for(int i=str1.length();i<numfin;i++){
                str1=str1+caragreg;
            }
        }
        return str1;
    }

    //////////////////////////extras//////////////////////////////////
    public java.util.Date strToDate(String strDate, String strPattern) throws ParseException{
        java.util.Date da=new java.util.Date();
        SimpleDateFormat sdf= new SimpleDateFormat();
        sdf.applyPattern(strPattern);
        da=sdf.parse(strDate);
        return da;
    }
    public String DateToStr(java.util.Date date, String strPattern) throws ParseException{
            SimpleDateFormat sdf= new SimpleDateFormat();
            sdf.applyPattern(strPattern);
            return sdf.format(date);
    }
    public String DateToStr(java.util.Date date, String strPattern, Locale locale) throws ParseException{
            SimpleDateFormat sdf= new SimpleDateFormat(strPattern, locale);
            return sdf.format(date);
    }
    public Calendar dateToCalendar(java.util.Date date){
             Calendar cal=Calendar.getInstance();
         cal.setTime(date);
         return cal;
    }

    public java.util.Date CalendarToDate(Calendar cal) {
           return cal.getTime();
    }

    public Calendar addXDays(Calendar cal, int x){
            cal.add(Calendar.DATE, x);
            return cal;
    }

    public Calendar substractXDays(Calendar cal, int x){
            cal.add(Calendar.DAY_OF_YEAR, (1*(-x)));
            return cal;
    }

    ////////////////////////////////////////////////
}
