package Soporte;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class consultas {
    public static final String S_TODOS_OCUPACIONES="SELECT * FROM OCUPACIONES";

///////////////////////TODOS LOS SELECT
public String S_TODOS_1T(String tabla) throws SQLException{
    String cons="Select * from "+tabla;
    return cons;
}

public String S_TODOS_XT_XC(String[] tablas, String[] condi) throws SQLException{
        String cons="Select * from ";
        int lon=tablas.length;
        for(int i=0;i<lon;i++){
           cons=cons.concat(tablas[i]);
           if(i!=(lon-1)){
               cons=cons.concat(",");
           }
        }
        cons=cons.concat(" where ");
        lon=condi.length;
        for(int i=0;i<lon;i++){
          cons=cons.concat(condi[i]);
          cons=cons.concat(" = ?");
          if(i!=(lon-1)){
               cons=cons.concat(" and ");
           }
           
        }
        return cons;
}

public String S_TODOS_1T_1C(String tabla, String condi) throws SQLException{
    String cons="Select * from "+tabla+" where "+condi+" = ?";
    return cons;
}
////////////////////////////////TODOS LOS INSERT/////////////////////////////////////////////////
public String I_1T_XC(String tabla, String[] campos) throws SQLException{
    String cons="INSERT INTO "+tabla+" values(";
    int lon=campos.length;
    for(int i=0;i<lon;i++){
       cons=cons+(campos[i]);
       if(i!=(lon-1))
          cons=cons.concat(",");
    }
    cons=cons+")";
    return cons;
}

}//termina

