package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cabcompra generated by hbm2java
 */
public class Cabcompra  implements java.io.Serializable {


     private int idfacturacompra;
     private Proveedor proveedor;
     private String numfaccom;
     private Date fechacom;
     private Float totaliva;
     private Float descuento;
     private Float total;
     private Character contado;
     private String obscom;
     private Set detcompras = new HashSet(0);

    public Cabcompra() {
    }

	
    public Cabcompra(int idfacturacompra, Proveedor proveedor, String numfaccom) {
        this.idfacturacompra = idfacturacompra;
        this.proveedor = proveedor;
        this.numfaccom = numfaccom;
    }
    public Cabcompra(int idfacturacompra, Proveedor proveedor, String numfaccom, Date fechacom, Float totaliva, Float descuento, Float total, Character contado, String obscom, Set detcompras) {
       this.idfacturacompra = idfacturacompra;
       this.proveedor = proveedor;
       this.numfaccom = numfaccom;
       this.fechacom = fechacom;
       this.totaliva = totaliva;
       this.descuento = descuento;
       this.total = total;
       this.contado = contado;
       this.obscom = obscom;
       this.detcompras = detcompras;
    }
   
    public int getIdfacturacompra() {
        return this.idfacturacompra;
    }
    
    public void setIdfacturacompra(int idfacturacompra) {
        this.idfacturacompra = idfacturacompra;
    }
    public Proveedor getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public String getNumfaccom() {
        return this.numfaccom;
    }
    
    public void setNumfaccom(String numfaccom) {
        this.numfaccom = numfaccom;
    }
    public Date getFechacom() {
        return this.fechacom;
    }
    
    public void setFechacom(Date fechacom) {
        this.fechacom = fechacom;
    }
    public Float getTotaliva() {
        return this.totaliva;
    }
    
    public void setTotaliva(Float totaliva) {
        this.totaliva = totaliva;
    }
    public Float getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }
    public Float getTotal() {
        return this.total;
    }
    
    public void setTotal(Float total) {
        this.total = total;
    }
    public Character getContado() {
        return this.contado;
    }
    
    public void setContado(Character contado) {
        this.contado = contado;
    }
    public String getObscom() {
        return this.obscom;
    }
    
    public void setObscom(String obscom) {
        this.obscom = obscom;
    }
    public Set getDetcompras() {
        return this.detcompras;
    }
    
    public void setDetcompras(Set detcompras) {
        this.detcompras = detcompras;
    }




}

