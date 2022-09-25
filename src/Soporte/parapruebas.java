package Soporte;
import java.text.ParseException;
import imp.StockGest;
import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JFileChooser;




public class parapruebas{
   public float redondear(float nume){
        float entero=Math.round(nume);
        float dife=nume-entero;
        if(dife>0 && dife<1)
           return (float)(Math.rint(nume * 1000) / 1000);   //redondea a 3 decimales y parsea a float xq la funcion retorna un double
        else
           return nume;
    }
   public String ruta(){
    //return getClass().getResource("/iconos/hoteleria.jpg")+"";
    return System.getProperty("user.dir")+"/src/iconos/hoteleria.jpg";
   }
public void aChar(String str){
    char[] arr=str.toCharArray();
    for(int i=0;i<str.length();i++){
        char cha=arr[i];
        this.codificar((int)cha);
    }
}
public void codificar(int numero){
        //int numero =0;
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
            cociente = dividendo / 150;
            residuo = dividendo % 150;
            hexal [tamaño] = residuo;
            tamaño = tamaño + 1;
            dividendo = cociente;
        }



        //Mostrar el resultado en pantalla
        //System.out.print("El numero Hexal es: ");
        for (int i =(tamaño-1);i>=0;i--){
            //if (hexal[i] >= 0 && hexal[i] <= 9)
                System.out.println(hexal[i]);
           /* else{
                switch(hexal[i]){
                    case 10: {System.out.print("A");break;}
                    case 11: {System.out.print("B");break;}
                    case 12: {System.out.print("C");break;}
                    case 13: {System.out.print("D");break;}
                    case 14: {System.out.print("E");break;}
                    case 15: {System.out.print("F");break;}
                }
            }*/
        }
    }

   public String aFloat(float fl){

        NumberFormat formatter = new DecimalFormat("0E0");
        return formatter.format(fl);

   }



   public String abrirSeleccionArchivos(){
        // TODO add your handling code here:
       JFileChooser fileChooser = new JFileChooser();
        int status = fileChooser.showOpenDialog(null);
        File fileImagen;
        if(status==JFileChooser.APPROVE_OPTION){
            File file=fileChooser.getSelectedFile();
            if(file!=null){
                fileImagen = fileChooser.getSelectedFile();

                File fileName = fileChooser.getSelectedFile();
                return fileName.getPath();
            }
        }
        return null;
    }





    public static void main(String[] args) throws ParseException{
        clasesutiles cluti=new clasesutiles();
        parapruebas pp=new parapruebas();
        /*ClaseReporte clre=new ClaseReporte();
        ConvertidorDeNumerosALetras conv = null;
        Date fe=new Date();*/
       // clre.MostrarReporte("dfds", "");
        //MotivoUtiGest mutiges=new MotivoUtiGest();
        //if(stoges.ExisteIdServicioEnTabla(3))
        //for(int i=1000000000;;i+=10000){
      /*  float nu = Float.parseFloat("155218");
        System.out.println(Float.toString(nu));
            System.out.println(pp.aFloat(Float.parseFloat("1557489")));
        }*/
        pp.abrirSeleccionArchivos();
    }
}

