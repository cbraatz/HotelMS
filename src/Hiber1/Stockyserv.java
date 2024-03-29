package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Stockyserv generated by hbm2java
 */
public class Stockyserv  implements java.io.Serializable {


     private int codigo;
     private Unidadmedida unidadmedida;
     private Iva iva;
     private String descri;
     private Float preciocosto;
     private Float precioventa;
     private Float existencia;
     private Float stockmin;
     private Character esservicio;
     private Character paraventa;
     private Set detcompras = new HashSet(0);
     private Set descarteses = new HashSet(0);
     private Set stockyservxsubres = new HashSet(0);
     private Set ajustestocks = new HashSet(0);

    public Stockyserv() {
    }

	
    public Stockyserv(int codigo, Iva iva) {
        this.codigo = codigo;
        this.iva = iva;
    }
    public Stockyserv(int codigo, Unidadmedida unidadmedida, Iva iva, String descri, Float preciocosto, Float precioventa, Float existencia, Float stockmin, Character esservicio, Character paraventa, Set detcompras, Set descarteses, Set stockyservxsubres, Set ajustestocks) {
       this.codigo = codigo;
       this.unidadmedida = unidadmedida;
       this.iva = iva;
       this.descri = descri;
       this.preciocosto = preciocosto;
       this.precioventa = precioventa;
       this.existencia = existencia;
       this.stockmin = stockmin;
       this.esservicio = esservicio;
       this.paraventa = paraventa;
       this.detcompras = detcompras;
       this.descarteses = descarteses;
       this.stockyservxsubres = stockyservxsubres;
       this.ajustestocks = ajustestocks;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Unidadmedida getUnidadmedida() {
        return this.unidadmedida;
    }
    
    public void setUnidadmedida(Unidadmedida unidadmedida) {
        this.unidadmedida = unidadmedida;
    }
    public Iva getIva() {
        return this.iva;
    }
    
    public void setIva(Iva iva) {
        this.iva = iva;
    }
    public String getDescri() {
        return this.descri;
    }
    
    public void setDescri(String descri) {
        this.descri = descri;
    }
    public Float getPreciocosto() {
        return this.preciocosto;
    }
    
    public void setPreciocosto(Float preciocosto) {
        this.preciocosto = preciocosto;
    }
    public Float getPrecioventa() {
        return this.precioventa;
    }
    
    public void setPrecioventa(Float precioventa) {
        this.precioventa = precioventa;
    }
    public Float getExistencia() {
        return this.existencia;
    }
    
    public void setExistencia(Float existencia) {
        this.existencia = existencia;
    }
    public Float getStockmin() {
        return this.stockmin;
    }
    
    public void setStockmin(Float stockmin) {
        this.stockmin = stockmin;
    }
    public Character getEsservicio() {
        return this.esservicio;
    }
    
    public void setEsservicio(Character esservicio) {
        this.esservicio = esservicio;
    }
    public Character getParaventa() {
        return this.paraventa;
    }
    
    public void setParaventa(Character paraventa) {
        this.paraventa = paraventa;
    }
    public Set getDetcompras() {
        return this.detcompras;
    }
    
    public void setDetcompras(Set detcompras) {
        this.detcompras = detcompras;
    }
    public Set getDescarteses() {
        return this.descarteses;
    }
    
    public void setDescarteses(Set descarteses) {
        this.descarteses = descarteses;
    }
    public Set getStockyservxsubres() {
        return this.stockyservxsubres;
    }
    
    public void setStockyservxsubres(Set stockyservxsubres) {
        this.stockyservxsubres = stockyservxsubres;
    }
    public Set getAjustestocks() {
        return this.ajustestocks;
    }
    
    public void setAjustestocks(Set ajustestocks) {
        this.ajustestocks = ajustestocks;
    }




}


