package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Estado generated by hbm2java
 */
public class Estado  implements java.io.Serializable {


     private int idestado;
     private String descripest;
     private Set ocupacioneses = new HashSet(0);
     private Set habitacions = new HashSet(0);

    public Estado() {
    }

	
    public Estado(int idestado) {
        this.idestado = idestado;
    }
    public Estado(int idestado, String descripest, Set ocupacioneses, Set habitacions) {
       this.idestado = idestado;
       this.descripest = descripest;
       this.ocupacioneses = ocupacioneses;
       this.habitacions = habitacions;
    }
   
    public int getIdestado() {
        return this.idestado;
    }
    
    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }
    public String getDescripest() {
        return this.descripest;
    }
    
    public void setDescripest(String descripest) {
        this.descripest = descripest;
    }
    public Set getOcupacioneses() {
        return this.ocupacioneses;
    }
    
    public void setOcupacioneses(Set ocupacioneses) {
        this.ocupacioneses = ocupacioneses;
    }
    public Set getHabitacions() {
        return this.habitacions;
    }
    
    public void setHabitacions(Set habitacions) {
        this.habitacions = habitacions;
    }




}

