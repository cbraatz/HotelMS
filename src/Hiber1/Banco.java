package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Banco generated by hbm2java
 */
public class Banco  implements java.io.Serializable {


     private int idbanco;
     private String nombrebanco;
     private String direccionban;
     private String telefban;
     private Set documentoses = new HashSet(0);

    public Banco() {
    }

	
    public Banco(int idbanco) {
        this.idbanco = idbanco;
    }
    public Banco(int idbanco, String nombrebanco, String direccionban, String telefban, Set documentoses) {
       this.idbanco = idbanco;
       this.nombrebanco = nombrebanco;
       this.direccionban = direccionban;
       this.telefban = telefban;
       this.documentoses = documentoses;
    }
   
    public int getIdbanco() {
        return this.idbanco;
    }
    
    public void setIdbanco(int idbanco) {
        this.idbanco = idbanco;
    }
    public String getNombrebanco() {
        return this.nombrebanco;
    }
    
    public void setNombrebanco(String nombrebanco) {
        this.nombrebanco = nombrebanco;
    }
    public String getDireccionban() {
        return this.direccionban;
    }
    
    public void setDireccionban(String direccionban) {
        this.direccionban = direccionban;
    }
    public String getTelefban() {
        return this.telefban;
    }
    
    public void setTelefban(String telefban) {
        this.telefban = telefban;
    }
    public Set getDocumentoses() {
        return this.documentoses;
    }
    
    public void setDocumentoses(Set documentoses) {
        this.documentoses = documentoses;
    }




}

