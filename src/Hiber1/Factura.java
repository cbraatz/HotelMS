package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Factura generated by hbm2java
 */
public class Factura  implements java.io.Serializable {


     private int idfac;
     private Reservacion reservacion;
     private Cliente cliente;
     private String numfac;
     private Date feyho;
     private Float descuento;
     private Float totaliva;
     private Float monto;
     private Character emitida;

    public Factura() {
    }

	
    public Factura(int idfac, String numfac) {
        this.idfac = idfac;
        this.numfac = numfac;
    }
    public Factura(int idfac, Reservacion reservacion, Cliente cliente, String numfac, Date feyho, Float descuento, Float totaliva, Float monto, Character emitida) {
       this.idfac = idfac;
       this.reservacion = reservacion;
       this.cliente = cliente;
       this.numfac = numfac;
       this.feyho = feyho;
       this.descuento = descuento;
       this.totaliva = totaliva;
       this.monto = monto;
       this.emitida = emitida;
    }
   
    public int getIdfac() {
        return this.idfac;
    }
    
    public void setIdfac(int idfac) {
        this.idfac = idfac;
    }
    public Reservacion getReservacion() {
        return this.reservacion;
    }
    
    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getNumfac() {
        return this.numfac;
    }
    
    public void setNumfac(String numfac) {
        this.numfac = numfac;
    }
    public Date getFeyho() {
        return this.feyho;
    }
    
    public void setFeyho(Date feyho) {
        this.feyho = feyho;
    }
    public Float getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }
    public Float getTotaliva() {
        return this.totaliva;
    }
    
    public void setTotaliva(Float totaliva) {
        this.totaliva = totaliva;
    }
    public Float getMonto() {
        return this.monto;
    }
    
    public void setMonto(Float monto) {
        this.monto = monto;
    }
    public Character getEmitida() {
        return this.emitida;
    }
    
    public void setEmitida(Character emitida) {
        this.emitida = emitida;
    }




}


