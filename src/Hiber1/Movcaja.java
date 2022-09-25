package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Movcaja generated by hbm2java
 */
public class Movcaja  implements java.io.Serializable {


     private Integer idmov;
     private Moneda moneda;
     private Tipomov tipomov;
     private Apeyciecaja apeyciecaja;
     private Reservacion reservacion;
     private Formapago formapago;
     private Documentos documentos;
     private Cliente cliente;
     private Date feyhomov;
     private Float montomov;
     private Float montogs;
     private String numcompro;
     private Float montogscondesc;
     private String obs;

    public Movcaja() {
    }

	
    public Movcaja(Moneda moneda, Tipomov tipomov, Apeyciecaja apeyciecaja, Formapago formapago) {
        this.moneda = moneda;
        this.tipomov = tipomov;
        this.apeyciecaja = apeyciecaja;
        this.formapago = formapago;
    }
    public Movcaja(Moneda moneda, Tipomov tipomov, Apeyciecaja apeyciecaja, Reservacion reservacion, Formapago formapago, Documentos documentos, Cliente cliente, Date feyhomov, Float montomov, Float montogs, String numcompro, Float montogscondesc, String obs) {
       this.moneda = moneda;
       this.tipomov = tipomov;
       this.apeyciecaja = apeyciecaja;
       this.reservacion = reservacion;
       this.formapago = formapago;
       this.documentos = documentos;
       this.cliente = cliente;
       this.feyhomov = feyhomov;
       this.montomov = montomov;
       this.montogs = montogs;
       this.numcompro = numcompro;
       this.montogscondesc = montogscondesc;
       this.obs = obs;
    }
   
    public Integer getIdmov() {
        return this.idmov;
    }
    
    public void setIdmov(Integer idmov) {
        this.idmov = idmov;
    }
    public Moneda getMoneda() {
        return this.moneda;
    }
    
    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
    public Tipomov getTipomov() {
        return this.tipomov;
    }
    
    public void setTipomov(Tipomov tipomov) {
        this.tipomov = tipomov;
    }
    public Apeyciecaja getApeyciecaja() {
        return this.apeyciecaja;
    }
    
    public void setApeyciecaja(Apeyciecaja apeyciecaja) {
        this.apeyciecaja = apeyciecaja;
    }
    public Reservacion getReservacion() {
        return this.reservacion;
    }
    
    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }
    public Formapago getFormapago() {
        return this.formapago;
    }
    
    public void setFormapago(Formapago formapago) {
        this.formapago = formapago;
    }
    public Documentos getDocumentos() {
        return this.documentos;
    }
    
    public void setDocumentos(Documentos documentos) {
        this.documentos = documentos;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Date getFeyhomov() {
        return this.feyhomov;
    }
    
    public void setFeyhomov(Date feyhomov) {
        this.feyhomov = feyhomov;
    }
    public Float getMontomov() {
        return this.montomov;
    }
    
    public void setMontomov(Float montomov) {
        this.montomov = montomov;
    }
    public Float getMontogs() {
        return this.montogs;
    }
    
    public void setMontogs(Float montogs) {
        this.montogs = montogs;
    }
    public String getNumcompro() {
        return this.numcompro;
    }
    
    public void setNumcompro(String numcompro) {
        this.numcompro = numcompro;
    }
    public Float getMontogscondesc() {
        return this.montogscondesc;
    }
    
    public void setMontogscondesc(Float montogscondesc) {
        this.montogscondesc = montogscondesc;
    }
    public String getObs() {
        return this.obs;
    }
    
    public void setObs(String obs) {
        this.obs = obs;
    }




}

