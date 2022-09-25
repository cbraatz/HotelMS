package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Subtipo generated by hbm2java
 */
public class Subtipo  implements java.io.Serializable {


     private int idsubtipo;
     private String descsubtipo;
     private Float precioxnoche;
     private Float preciocorto;
     private Set ocupacioneses = new HashSet(0);
     private Set subreservas = new HashSet(0);

    public Subtipo() {
    }

	
    public Subtipo(int idsubtipo) {
        this.idsubtipo = idsubtipo;
    }
    public Subtipo(int idsubtipo, String descsubtipo, Float precioxnoche, Float preciocorto, Set ocupacioneses, Set subreservas) {
       this.idsubtipo = idsubtipo;
       this.descsubtipo = descsubtipo;
       this.precioxnoche = precioxnoche;
       this.preciocorto = preciocorto;
       this.ocupacioneses = ocupacioneses;
       this.subreservas = subreservas;
    }
   
    public int getIdsubtipo() {
        return this.idsubtipo;
    }
    
    public void setIdsubtipo(int idsubtipo) {
        this.idsubtipo = idsubtipo;
    }
    public String getDescsubtipo() {
        return this.descsubtipo;
    }
    
    public void setDescsubtipo(String descsubtipo) {
        this.descsubtipo = descsubtipo;
    }
    public Float getPrecioxnoche() {
        return this.precioxnoche;
    }
    
    public void setPrecioxnoche(Float precioxnoche) {
        this.precioxnoche = precioxnoche;
    }
    public Float getPreciocorto() {
        return this.preciocorto;
    }
    
    public void setPreciocorto(Float preciocorto) {
        this.preciocorto = preciocorto;
    }
    public Set getOcupacioneses() {
        return this.ocupacioneses;
    }
    
    public void setOcupacioneses(Set ocupacioneses) {
        this.ocupacioneses = ocupacioneses;
    }
    public Set getSubreservas() {
        return this.subreservas;
    }
    
    public void setSubreservas(Set subreservas) {
        this.subreservas = subreservas;
    }




}

