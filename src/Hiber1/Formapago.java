package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Formapago generated by hbm2java
 */
public class Formapago  implements java.io.Serializable {


     private int idforma;
     private String descripformapa;
     private Character tienebanco;
     private Character tienefecha;
     private Character tienenumero;
     private Float pordesc;
     private Character sologs;
     private Set movcajas = new HashSet(0);
     private Set arqueos = new HashSet(0);
     private Set documentoses = new HashSet(0);
     private Set cajas = new HashSet(0);

    public Formapago() {
    }

	
    public Formapago(int idforma) {
        this.idforma = idforma;
    }
    public Formapago(int idforma, String descripformapa, Character tienebanco, Character tienefecha, Character tienenumero, Float pordesc, Character sologs, Set movcajas, Set arqueos, Set documentoses, Set cajas) {
       this.idforma = idforma;
       this.descripformapa = descripformapa;
       this.tienebanco = tienebanco;
       this.tienefecha = tienefecha;
       this.tienenumero = tienenumero;
       this.pordesc = pordesc;
       this.sologs = sologs;
       this.movcajas = movcajas;
       this.arqueos = arqueos;
       this.documentoses = documentoses;
       this.cajas = cajas;
    }
   
    public int getIdforma() {
        return this.idforma;
    }
    
    public void setIdforma(int idforma) {
        this.idforma = idforma;
    }
    public String getDescripformapa() {
        return this.descripformapa;
    }
    
    public void setDescripformapa(String descripformapa) {
        this.descripformapa = descripformapa;
    }
    public Character getTienebanco() {
        return this.tienebanco;
    }
    
    public void setTienebanco(Character tienebanco) {
        this.tienebanco = tienebanco;
    }
    public Character getTienefecha() {
        return this.tienefecha;
    }
    
    public void setTienefecha(Character tienefecha) {
        this.tienefecha = tienefecha;
    }
    public Character getTienenumero() {
        return this.tienenumero;
    }
    
    public void setTienenumero(Character tienenumero) {
        this.tienenumero = tienenumero;
    }
    public Float getPordesc() {
        return this.pordesc;
    }
    
    public void setPordesc(Float pordesc) {
        this.pordesc = pordesc;
    }
    public Character getSologs() {
        return this.sologs;
    }
    
    public void setSologs(Character sologs) {
        this.sologs = sologs;
    }
    public Set getMovcajas() {
        return this.movcajas;
    }
    
    public void setMovcajas(Set movcajas) {
        this.movcajas = movcajas;
    }
    public Set getArqueos() {
        return this.arqueos;
    }
    
    public void setArqueos(Set arqueos) {
        this.arqueos = arqueos;
    }
    public Set getDocumentoses() {
        return this.documentoses;
    }
    
    public void setDocumentoses(Set documentoses) {
        this.documentoses = documentoses;
    }
    public Set getCajas() {
        return this.cajas;
    }
    
    public void setCajas(Set cajas) {
        this.cajas = cajas;
    }




}

