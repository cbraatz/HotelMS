package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Tipodocumento generated by hbm2java
 */
public class Tipodocumento  implements java.io.Serializable {


     private int idtipodoc;
     private String descriptipodoc;
     private Set clientes = new HashSet(0);

    public Tipodocumento() {
    }

	
    public Tipodocumento(int idtipodoc) {
        this.idtipodoc = idtipodoc;
    }
    public Tipodocumento(int idtipodoc, String descriptipodoc, Set clientes) {
       this.idtipodoc = idtipodoc;
       this.descriptipodoc = descriptipodoc;
       this.clientes = clientes;
    }
   
    public int getIdtipodoc() {
        return this.idtipodoc;
    }
    
    public void setIdtipodoc(int idtipodoc) {
        this.idtipodoc = idtipodoc;
    }
    public String getDescriptipodoc() {
        return this.descriptipodoc;
    }
    
    public void setDescriptipodoc(String descriptipodoc) {
        this.descriptipodoc = descriptipodoc;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }




}

