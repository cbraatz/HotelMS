package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Profesion generated by hbm2java
 */
public class Profesion  implements java.io.Serializable {


     private int idprof;
     private String descripprof;
     private Set clientes = new HashSet(0);

    public Profesion() {
    }

	
    public Profesion(int idprof) {
        this.idprof = idprof;
    }
    public Profesion(int idprof, String descripprof, Set clientes) {
       this.idprof = idprof;
       this.descripprof = descripprof;
       this.clientes = clientes;
    }
   
    public int getIdprof() {
        return this.idprof;
    }
    
    public void setIdprof(int idprof) {
        this.idprof = idprof;
    }
    public String getDescripprof() {
        return this.descripprof;
    }
    
    public void setDescripprof(String descripprof) {
        this.descripprof = descripprof;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }




}


