package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Ajustestock generated by hbm2java
 */
public class Ajustestock  implements java.io.Serializable {


     private int idaju;
     private Motivoajuste motivoajuste;
     private Stockyserv stockyserv;
     private Date feyho;
     private String obs;
     private Float cant;
     private Float valor;

    public Ajustestock() {
    }

	
    public Ajustestock(int idaju, Motivoajuste motivoajuste, Stockyserv stockyserv) {
        this.idaju = idaju;
        this.motivoajuste = motivoajuste;
        this.stockyserv = stockyserv;
    }
    public Ajustestock(int idaju, Motivoajuste motivoajuste, Stockyserv stockyserv, Date feyho, String obs, Float cant, Float valor) {
       this.idaju = idaju;
       this.motivoajuste = motivoajuste;
       this.stockyserv = stockyserv;
       this.feyho = feyho;
       this.obs = obs;
       this.cant = cant;
       this.valor = valor;
    }
   
    public int getIdaju() {
        return this.idaju;
    }
    
    public void setIdaju(int idaju) {
        this.idaju = idaju;
    }
    public Motivoajuste getMotivoajuste() {
        return this.motivoajuste;
    }
    
    public void setMotivoajuste(Motivoajuste motivoajuste) {
        this.motivoajuste = motivoajuste;
    }
    public Stockyserv getStockyserv() {
        return this.stockyserv;
    }
    
    public void setStockyserv(Stockyserv stockyserv) {
        this.stockyserv = stockyserv;
    }
    public Date getFeyho() {
        return this.feyho;
    }
    
    public void setFeyho(Date feyho) {
        this.feyho = feyho;
    }
    public String getObs() {
        return this.obs;
    }
    
    public void setObs(String obs) {
        this.obs = obs;
    }
    public Float getCant() {
        return this.cant;
    }
    
    public void setCant(Float cant) {
        this.cant = cant;
    }
    public Float getValor() {
        return this.valor;
    }
    
    public void setValor(Float valor) {
        this.valor = valor;
    }




}


