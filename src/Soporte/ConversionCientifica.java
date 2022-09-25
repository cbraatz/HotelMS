package Soporte;


import java.util.*;

import java.text.*;



public class ConversionCientifica {
    double elNumero =  0.0;
    public ConversionCientifica(){
    }

    public ConversionCientifica(double num){
        elNumero = num;
    }

    //Convierte un numero en notacion cientifica a numero normal
    //el numero se supone ya fue especificado en el constructor
    public String conversion() {
        return conversion(elNumero);
    }
    //Convierte un numero en notacion cientifica a numero normal
    public String conversion(double valor){
        if(valor>0){
            Locale.setDefault(Locale.US);
            DecimalFormat num = new DecimalFormat("#,###.00");
            return this.RemplazarPuntoPorComaYComaPorPunto(num.format(valor));
        }else
            return "0.00";
    }
  /*  public String BorrarComa(String cad){
        String resu="";
          for(int i=0;i<cad.length();i++){
              String sub=cad.substring(i, i+1);
              if(!sub.equals(","))
                  resu=resu+sub;
          }
        return resu;
    }*/
    public String conversion2(double valor){  //para pasarle al convertidor de num a letras y para campos ingresables o modificables x el usr
       if(valor>0){
            Locale.setDefault(Locale.US);
            DecimalFormat num = new DecimalFormat("###.00");
            return num.format(valor);
       }else
           return "0.00";
    }
   /* public String conversion3(double valor){ //para campos de texto cargables x el usr y que deben ser validados, xq un xx,xx no es float valido, si lo es xx.xx
        if(valor>0){
            Locale.setDefault(Locale.US);
            DecimalFormat num = new DecimalFormat("#,###.00");
            return this.BorrarComa(num.format(valor));
        }else
            return "0.00";
    }*/
  /*  public String RemplazarPuntoPorComa(String cad){ //remplaza el 1er char por el 2do en el String especificado
          cad=cad.replace('.', 'x');  //replaza el punto por x para no remplazarlo por , en el prox
          cad=cad.replace(',', '.');
          return cad.replace('x', ',');         //los char van entre ''
          cad.
    }*/
    public String RemplazarPuntoPorComaYComaPorPunto(String cad){ //remplaza el 1er char por el 2do en el String especificado
          cad=cad.replace('.', 'x');  //replaza el punto por x para no remplazarlo por , en el prox
          cad=cad.replace(',', '.');
          return cad.replace('x', ',');         //los char van entre ''
    }
   /*  public static void main(String args[]){
        double num = 23457E6;
        ConversionCientifica con = new ConversionCientifica();
        //ConversionCientifica con2 = new ConversionCientifica(num);
        float f=(float) 4521.0;

        float nu = Float.parseFloat(con.BorrarComa(s));
        System.out.println((con.conversion(num)));
       // System.out.println("Numero convertido: "+con.conversion2(nu));
    }*/
}
