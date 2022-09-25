package Soporte;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class codigo {
    char[] arrvalores={  'H','a','t','x','E','i','2','l','Z','8'
                        ,'s','Ñ','f','V','3','u','Y','S','1','7'
                        ,'N','U','H','A','w','O','T','G','v','y'
                        ,'D','4','k','ñ','o','j','b','J','z','p'
                        ,'g','X','9','e','W','P','0','n','R','M'
                        ,'r','Q','q','5','B','h','C','c','K','m'
                        ,'L','d','6','F'};

    char[] arrequivalentes={ '0','1','2','3','4','5','6','7','8','9'
                            ,'A','B','C','D','E','F','G','H','I','J'
                            ,'K','L','M','N','Ñ','O','P','Q','R','S'
                            ,'T','U','V','W','X','Y','Z','a','b','c'
                            ,'d','e','f','g','h','i','j','k','l','m'
                            ,'n','ñ','o','p','q','r','s','t','u','v'
                            ,'w','x','y','z'};

    public static String getMotherboardSN() { //lee el numero de serie de la placa madre
  String result = "";
    try {
      File file = File.createTempFile("realhowto",".vbs");
      file.deleteOnExit();
      FileWriter fw = new java.io.FileWriter(file);

      String vbs =
         "Set objWMIService = GetObject(\"winmgmts:\\\\.\\root\\cimv2\")\n"
        + "Set colItems = objWMIService.ExecQuery _ \n"
        + "   (\"Select * from Win32_BaseBoard\") \n"
        + "For Each objItem in colItems \n"
        + "    Wscript.Echo objItem.SerialNumber \n"
        + "    exit for  ' do the first cpu only! \n"
        + "Next \n";

      fw.write(vbs);
      fw.close();
      Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
      BufferedReader input =
        new BufferedReader
          (new InputStreamReader(p.getInputStream()));
      String line;
      while ((line = input.readLine()) != null) {
         result += line;
      }
      input.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return result.trim();
  }

  public static String getSerialNumber(String drive) {  //obtiene el numero de serie del disco c
  String result = "";
    try {
      File file = File.createTempFile("realhowto",".vbs");
      file.deleteOnExit();
      FileWriter fw = new java.io.FileWriter(file);

      String vbs = "Set objFSO = CreateObject(\"Scripting.FileSystemObject\")\n"
                  +"Set colDrives = objFSO.Drives\n"
                  +"Set objDrive = colDrives.item(\"" + drive + "\")\n"
                  +"Wscript.Echo objDrive.SerialNumber";  // see note
      fw.write(vbs);
      fw.close();
      Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
      BufferedReader input =
        new BufferedReader
          (new InputStreamReader(p.getInputStream()));
      String line;
      while ((line = input.readLine()) != null) {
         result += line;
      }
      input.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return result.trim();
  }
  public String codificar2(String str){
    String resp="";
    char[] arr=str.toCharArray();
    for(int i=0;i<arr.length;i++){
        if(arr[i] == '-')
            resp=resp+'-';
        else{
            for(int j=0;j<arrvalores.length;j++){
                if(arrvalores[j]==arr[i])
                    resp=resp+arrequivalentes[j];
            }
        }
    }
    resp=resp+'-';
    resp=resp+this.obtenerVerificador(str);
    return resp;
  }
  public int obtenerVerificador(String str){
      int respu=0;
      char[] arr=str.toCharArray();
      for(int i=0;i<arr.length;i++){
        int x=(int)arr[i];
        respu=respu+x;
      }
      return respu;
  }


  public String decodificar2(String str){
    String resp="";
    char[] arr=str.toCharArray();
    for(int i=0;i<arr.length;i++){
        if(arr[i] == '-')
            resp=resp+'-';
        else{
            for(int j=0;j<arrequivalentes.length;j++){
                if(arrequivalentes[j]==arr[i])
                    resp=resp+arrvalores[j];
            }
        }
    }
    return resp;
  }

    private static String convertToHex(byte[] data) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            int halfbyte = (data[i] >>> 4) & 0x0F;
            int two_halfs = 0;
            do {
                if ((0 <= halfbyte) && (halfbyte <= 9))
                    buf.append((char) ('0' + halfbyte));
                else
                    buf.append((char) ('a' + (halfbyte - 10)));
                halfbyte = data[i] & 0x0F;
            } while(two_halfs++ < 1);
        }
        return buf.toString();
    }

    public static String MD5(String text)
    throws NoSuchAlgorithmException, UnsupportedEncodingException  {
        MessageDigest md;
        md = MessageDigest.getInstance("MD5");
        byte[] md5hash = new byte[32];
        md.update(text.getBytes("iso-8859-1"), 0, text.length());
        md5hash = md.digest();
        return convertToHex(md5hash);
    }
    public static String Codificar() throws NoSuchAlgorithmException, UnsupportedEncodingException{
        String cpuId = codigo.getMotherboardSN();
        String sn = codigo.getSerialNumber("C");
        String numeros=cpuId.substring(0, 5)+sn.substring(0, 5);
        String codi=codigo.MD5(numeros);
        return codi.substring(0, 4)+"-"+codi.substring(4, 8)+"-"+codi.substring(8, 12)+"-"+codi.substring(12, 16);
    }

    public static void main(String[] r){
        codigo cod=new codigo();
        try {
            System.out.println(cod.MD5("12345"));
        } catch (Exception ex) {
            Logger.getLogger(codigo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
