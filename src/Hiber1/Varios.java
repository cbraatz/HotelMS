package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA



/**
 * Varios generated by hbm2java
 */
public class Varios  implements java.io.Serializable {


     private int idvarios;
     private Usuarios usuarios;
     private Iva iva;
     private String proxnumfac;
     private Integer edadnino;
     private Character cajaabierta;
     private Character conectado;
     private Integer diasretraso;
     private Float poruti;
     private String serial;
     private String puerto;

    public Varios() {
    }

	
    public Varios(int idvarios, Iva iva) {
        this.idvarios = idvarios;
        this.iva = iva;
    }
    public Varios(int idvarios, Usuarios usuarios, Iva iva, String proxnumfac, Integer edadnino, Character cajaabierta, Character conectado, Integer diasretraso, Float poruti, String serial, String puerto) {
       this.idvarios = idvarios;
       this.usuarios = usuarios;
       this.iva = iva;
       this.proxnumfac = proxnumfac;
       this.edadnino = edadnino;
       this.cajaabierta = cajaabierta;
       this.conectado = conectado;
       this.diasretraso = diasretraso;
       this.poruti = poruti;
       this.serial = serial;
       this.puerto = puerto;
    }
   
    public int getIdvarios() {
        return this.idvarios;
    }
    
    public void setIdvarios(int idvarios) {
        this.idvarios = idvarios;
    }
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    public Iva getIva() {
        return this.iva;
    }
    
    public void setIva(Iva iva) {
        this.iva = iva;
    }
    public String getProxnumfac() {
        return this.proxnumfac;
    }
    
    public void setProxnumfac(String proxnumfac) {
        this.proxnumfac = proxnumfac;
    }
    public Integer getEdadnino() {
        return this.edadnino;
    }
    
    public void setEdadnino(Integer edadnino) {
        this.edadnino = edadnino;
    }
    public Character getCajaabierta() {
        return this.cajaabierta;
    }
    
    public void setCajaabierta(Character cajaabierta) {
        this.cajaabierta = cajaabierta;
    }
    public Character getConectado() {
        return this.conectado;
    }
    
    public void setConectado(Character conectado) {
        this.conectado = conectado;
    }
    public Integer getDiasretraso() {
        return this.diasretraso;
    }
    
    public void setDiasretraso(Integer diasretraso) {
        this.diasretraso = diasretraso;
    }
    public Float getPoruti() {
        return this.poruti;
    }
    
    public void setPoruti(Float poruti) {
        this.poruti = poruti;
    }
    public String getSerial() {
        return this.serial;
    }
    
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public String getPuerto() {
        return this.puerto;
    }
    
    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }




}


