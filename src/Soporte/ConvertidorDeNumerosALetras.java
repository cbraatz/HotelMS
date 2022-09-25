package Soporte;
//ESTA CLASE NO FUE CREADA POR MI, LA obtuve de http://code.google.com/p/isud7/source/browse/trunk/Codigo/Proyecto2/src/its/algoritmos/NumberToLetterConverter.java?spec=svn6&r=6
import Soporte.ConvertidorDeNumerosALetras;
import java.math.BigDecimal;

public abstract class ConvertidorDeNumerosALetras {

    public ConvertidorDeNumerosALetras(){
        strCentavos = new String();
    }

    private static final String[] UNIDADES = {"", "UN ", "DOS ", "TRES ",
        "CUATRO ", "CINCO ", "SEIS ", "SIETE ", "OCHO ", "NUEVE ", "DIEZ ",
        "ONCE ", "DOCE ", "TRECE ", "CATORCE ", "QUINCE ", "DIECISEIS",
        "DIECISIETE", "DIECIOCHO", "DIECINUEVE", "VEINTE"};
    private static final String[] DECENAS = {"VENTI", "TREINTA ", "CUARENTA ",
        "CINCUENTA ", "SESENTA ", "SETENTA ", "OCHENTA ", "NOVENTA ",
        "CIEN "};
    private static final String[] CENTENAS = {"CIENTO ", "DOSCIENTOS ",
        "TRESCIENTOS ", "CUATROCIENTOS ", "QUINIENTOS ", "SEISCIENTOS ",
        "SETECIENTOS ", "OCHOCIENTOS ", "NOVECIENTOS "};

    private static String strCentavos;

    public static String getStrCentavos() {
        return strCentavos;
    }

    public static void  setStrCentavos(String strCents) {
        strCentavos = strCents;
    }

    /**
     * Convierte a letras un numero de la forma $123,456.32 (StoreMath)
     * <p>
     * @param number Numero en representacion texto
     * @return Numero en letras
     * @since 1.1
     */
    public static String convertNumberToLetter(String number)throws Exception {
        return convertNumberToLetter(numberParserDouble(number));
    }

    /**
     * Convierte un numero en representacion numerica a uno en representacion de
     * texto. El numero es valido si esta entre 0 y 999'999.999
     * <p>
     * @param number Numero a convertir
     * @return Numero convertido a texto
     * @throws NumberFormatException Si el numero esta fuera del rango
     * @since 1.1
     */
    public static String convertNumberToLetter(BigDecimal number) throws NumberFormatException {
        String converted = new String();


        // Validamos que sea un numero legal
        double doubleNumber = Math.round(number.doubleValue());
        if (doubleNumber > 999999999) {
            throw new NumberFormatException(
                    "El numero es mayor de 999'999.999, "
                    + "no es posible convertirlo");
        }

        //String splitNumber[] = (String.valueOf(doubleNumber).replace('.', '#')).split("#");
        String splitNumber[] = ((String.valueOf(number)).replace(".", "#")).split("#");

        // Descompone el trio de millones - ¡SGT!
        int millon = Integer.parseInt(String.valueOf(getDigitAt(splitNumber[0],
                8))
                + String.valueOf(getDigitAt(splitNumber[0], 7))
                + String.valueOf(getDigitAt(splitNumber[0], 6)));
        if (millon == 1) {
            converted = "UN MILLON ";
        }
        if (millon > 1) {
            converted = convertNumber(String.valueOf(millon)) + "MILLONES ";
        }

        // Descompone el trio de miles - ¡SGT!
        int miles = Integer.parseInt(String.valueOf(getDigitAt(splitNumber[0],
                5))
                + String.valueOf(getDigitAt(splitNumber[0], 4))
                + String.valueOf(getDigitAt(splitNumber[0], 3)));
        if (miles == 1) {
            converted += "MIL ";
        }
        if (miles > 1) {
            converted += convertNumber(String.valueOf(miles)) + "MIL ";
        }

        // Descompone el ultimo trio de unidades - ¡SGT!
        int cientos = Integer.parseInt(String.valueOf(getDigitAt(
                splitNumber[0], 2))
                + String.valueOf(getDigitAt(splitNumber[0], 1))
                + String.valueOf(getDigitAt(splitNumber[0], 0)));
        if (cientos == 1) {
            converted += "UN";
        }

        if (millon + miles + cientos == 0) {
            converted += "CERO ";
        }
        if (cientos > 1) {
            converted += convertNumber(String.valueOf(cientos));
        }

        converted += "GUARANIES";

        // Descompone los centavos - Camilo
//        int centavos = Integer.parseInt(String.valueOf(getDigitAt(
//                splitNumber[1], 2))
//                + String.valueOf(getDigitAt(splitNumber[1], 1))
//                + String.valueOf(getDigitAt(splitNumber[1], 0)));
//       setStrCentavos(String.valueOf(centavos));
//       if (centavos == 1) {
//            converted += " CON UN CENTAVO";
//        }
//        if (centavos > 1) {
//            converted += " CON " + convertNumber(String.valueOf(centavos))
//                    + "CENTAVOS";
//        }

        setStrCentavos(splitNumber[1]);
        return converted;
    }

    /**
     * Convierte los trios de numeros que componen las unidades, las decenas y
     * las centenas del numero.
     * <p>
     * @param number Numero a convetir en digitos
     * @return Numero convertido en letras
     * @since 1.1
     */
    private static String convertNumber(String number) {
        if (number.length() > 3) {
            throw new NumberFormatException(
                    "La longitud maxima debe ser 3 digitos");
        }

        String output = new String();
        if (getDigitAt(number, 2) != 0) {
            output = CENTENAS[getDigitAt(number, 2) - 1];
        }

        int k = Integer.parseInt(String.valueOf(getDigitAt(number, 1))
                + String.valueOf(getDigitAt(number, 0)));

        if (k <= 20) {
            output += UNIDADES[k];
        } else {
            if (k > 30 && getDigitAt(number, 0) != 0) {
                output += DECENAS[getDigitAt(number, 1) - 2] + "Y "
                        + UNIDADES[getDigitAt(number, 0)];
            } else {
                output += DECENAS[getDigitAt(number, 1) - 2]
                        + UNIDADES[getDigitAt(number, 0)];
            }
        }

        // Caso especial con el 100
        if (getDigitAt(number, 2) == 1 && k == 0) {
            output = "CIEN";
        }

        return output;
    }

    /**
     * Retorna el digito numerico en la posicion indicada de derecha a izquierda
     * <p>
     * @param origin  Cadena en la cual se busca el digito
     * @param position  Posicion de derecha a izquierda a retornar
     * @return Digito ubicado en la posicion indicada
     * @since 1.1
     */
    private static int getDigitAt(String origin, int position) {
        if (origin.length() > position && position >= 0) {
            return origin.charAt(origin.length() - position - 1) - 48;
        }
        return 0;
    }

    /**
     * Metodo que hace el parse de un número en string $123,456.32 a un doble permitido
     * @param numbre string $123,456.32
     * @return double permitido
     * @since 1.0
     */
    private static BigDecimal numberParserDouble(String number) throws Exception{
       number = number.replace("$", "0");
       String [] partNumber = number.split(",");
       String n = "";

       if(partNumber != null && partNumber.length>0){
           for(String aux : partNumber){
               n+=aux;
           }

       }else{
          n = number;
       }
       return new BigDecimal(n);
    }
    public static void main(String args[]) throws Exception{
        double num = 23457E6;
        ConvertidorDeNumerosALetras co=null;
        System.out.println(co.convertNumberToLetter("0.0"));
    }
}

