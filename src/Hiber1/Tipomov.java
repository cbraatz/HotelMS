package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Tipomov generated by hbm2java
 */
public class Tipomov  implements java.io.Serializable {


     private int idtipomov;
     private String descripconc;
     private Character credito;
     private Character exclusivores;
     private Character egreso;
     private Set movcajas = new HashSet(0);

    public Tipomov() {
    }

	
    public Tipomov(int idtipomov) {
        this.idtipomov = idtipomov;
    }
    public Tipomov(int idtipomov, String descripconc, Character credito, Character exclusivores, Character egreso, Set movcajas) {
       this.idtipomov = idtipomov;
       this.descripconc = descripconc;
       this.credito = credito;
       this.exclusivores = exclusivores;
       this.egreso = egreso;
       this.movcajas = movcajas;
    }
   
    public int getIdtipomov() {
        return this.idtipomov;
    }
    
    public void setIdtipomov(int idtipomov) {
        this.idtipomov = idtipomov;
    }
    public String getDescripconc() {
        return this.descripconc;
    }
    
    public void setDescripconc(String descripconc) {
        this.descripconc = descripconc;
    }
    public Character getCredito() {
        return this.credito;
    }
    
    public void setCredito(Character credito) {
        this.credito = credito;
    }
    public Character getExclusivores() {
        return this.exclusivores;
    }
    
    public void setExclusivores(Character exclusivores) {
        this.exclusivores = exclusivores;
    }
    public Character getEgreso() {
        return this.egreso;
    }
    
    public void setEgreso(Character egreso) {
        this.egreso = egreso;
    }
    public Set getMovcajas() {
        return this.movcajas;
    }
    
    public void setMovcajas(Set movcajas) {
        this.movcajas = movcajas;
    }




}


