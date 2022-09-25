package Soporte;

import Hiber1.NewHibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

public class ClasesBase {
private Session Sesion = null;
public boolean existe=false;  //campo que señala si la ultima busqueda dio true o false

        public ClasesBase(){   //en el constructor se crea la sesion
      // this.Sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
   }

public boolean ExisteIdEnTabla(String objTabla, String campo, int id){
    this.Sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
    Sesion.beginTransaction();
    Query q=Sesion.createQuery("from "+objTabla+" where "+campo+" = "+Integer.toString(id));
    if(q.list().isEmpty()){  //si no se encontro
        existe=false;
        return false;
    }
    else{
        existe=true;
        return true;

    }
}
}
