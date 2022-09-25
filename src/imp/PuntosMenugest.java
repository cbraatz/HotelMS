
package imp;

import Hiber1.NewHibernateUtil;
import Hiber1.Puntosmenu;
 
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PuntosMenugest {
    Session sesion=null;
    String[] arraypuntos={"","ABM de Productos/Refrigerios","ABM de Servicios","ABM de Formas de Pago/Caja","ABM de Tipo de Movimiento de caja"  //el primero es "" para que emplice de 1
                            ,"ABM de Habitaciones","ABM de Tipos de Habitación","ABM de Grupos/Sectores/Ubicación de habitaciones","ABM de Estados de las Habitaciones"
                            ,"ABM de Empleados","ABM de Cargos/Especialidades de los empleados","ABM de Multas","ABM de Usuarios y Puntos de menú accesibles"
                            ,"Registro de Descartes","Registro de Rutinas de limpieza","Acceso a informes","Modificar opciones de configuración"
                            ,"ABM de Monedas y Cotizaciones","ABM de Bancos","ABM de Unidades de Medida","ABM de Motivos de descarte","ABM de Motivo de ajustes de Stock"
                            ,"ABM de Profesiones","AMB de Tipos de Documento","ABM de Países","ABM de Proveedores","ABM de Clientes","Registro de Compras"
                            ,"Registro de Trabajos realizados en el hotel","Registro de Actividades de los huéspedes","Registro de Ajuste de Stock","Registro de Movimientos de caja"
                            ,"Asignación de Productos, Servicios y Multas a los huéspedes","Administración de las Reservaciones","Apertura y Cierre de caja","ABM de IVA","ABM de Empresas"
                         };
    public void CERRARSesion(){
       if(this.sesion.isOpen()){
          sesion.clear();
          sesion.close();
       }
    }
    public int getLongitudArray(){
        return arraypuntos.length;
    }

    public boolean cargarListaPuntos(){
        
        int cont=0;
        this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx1=sesion.beginTransaction();
        for(int i=1;i<arraypuntos.length;i++){
            Puntosmenu pun=new Puntosmenu();
            pun.setIdpunto(i);
            pun.setDescrippunto(arraypuntos[i].toUpperCase());
            sesion.saveOrUpdate(pun);
            cont++;
        }
            tx1.commit();
            CERRARSesion();
        if(cont==arraypuntos.length-1)
            return true;
        else
            return false;
    }
}
