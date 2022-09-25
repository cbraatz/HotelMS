package Soporte;
import java.sql.*;

public class BaseImp {

public BaseImp(){
 }

public Connection Conectar(String direc, String usuario, String password) {  //realizar coneccion
    try{
    Connection con;
    con=DriverManager.getConnection(direc, usuario, password);
    return con;
    }
    catch(SQLException e) {
       //System.out.println("ERROR");
        e.printStackTrace();
        return null;
    }
}

public boolean Cerrar(Connection conec){
    try{
        conec.close();
        return true;
    }
    catch(SQLException e){
        return false;
    }
}

public boolean RegistrarJDBC(String dri){  //para registrar el driver
    try{
       Class.forName(dri);
       return true;
    }
    catch(ClassNotFoundException e){
           //e.printStackTrace();
           return false;

    }
}

}
