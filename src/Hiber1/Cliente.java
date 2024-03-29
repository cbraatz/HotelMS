package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int idcli;
     private Pais pais;
     private Profesion profesion;
     private Tipodocumento tipodocumento;
     private Empresa empresa;
     private String doc;
     private String nombre;
     private String apellido;
     private String ruc;
     private String telefono;
     private String celular;
     private Date fechanac;
     private String direccion;
     private Character estitular;
     private String nrochapa;
     private String obs;
     private Set actividads = new HashSet(0);
     private Set facturas = new HashSet(0);
     private Set cliexsubs = new HashSet(0);
     private Set reservacions = new HashSet(0);
     private Set movcajas = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(int idcli, Tipodocumento tipodocumento) {
        this.idcli = idcli;
        this.tipodocumento = tipodocumento;
    }
    public Cliente(int idcli, Pais pais, Profesion profesion, Tipodocumento tipodocumento, Empresa empresa, String doc, String nombre, String apellido, String ruc, String telefono, String celular, Date fechanac, String direccion, Character estitular, String nrochapa, String obs, Set actividads, Set facturas, Set cliexsubs, Set reservacions, Set movcajas) {
       this.idcli = idcli;
       this.pais = pais;
       this.profesion = profesion;
       this.tipodocumento = tipodocumento;
       this.empresa = empresa;
       this.doc = doc;
       this.nombre = nombre;
       this.apellido = apellido;
       this.ruc = ruc;
       this.telefono = telefono;
       this.celular = celular;
       this.fechanac = fechanac;
       this.direccion = direccion;
       this.estitular = estitular;
       this.nrochapa = nrochapa;
       this.obs = obs;
       this.actividads = actividads;
       this.facturas = facturas;
       this.cliexsubs = cliexsubs;
       this.reservacions = reservacions;
       this.movcajas = movcajas;
    }
   
    public int getIdcli() {
        return this.idcli;
    }
    
    public void setIdcli(int idcli) {
        this.idcli = idcli;
    }
    public Pais getPais() {
        return this.pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public Profesion getProfesion() {
        return this.profesion;
    }
    
    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }
    public Tipodocumento getTipodocumento() {
        return this.tipodocumento;
    }
    
    public void setTipodocumento(Tipodocumento tipodocumento) {
        this.tipodocumento = tipodocumento;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getDoc() {
        return this.doc;
    }
    
    public void setDoc(String doc) {
        this.doc = doc;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getRuc() {
        return this.ruc;
    }
    
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public Date getFechanac() {
        return this.fechanac;
    }
    
    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Character getEstitular() {
        return this.estitular;
    }
    
    public void setEstitular(Character estitular) {
        this.estitular = estitular;
    }
    public String getNrochapa() {
        return this.nrochapa;
    }
    
    public void setNrochapa(String nrochapa) {
        this.nrochapa = nrochapa;
    }
    public String getObs() {
        return this.obs;
    }
    
    public void setObs(String obs) {
        this.obs = obs;
    }
    public Set getActividads() {
        return this.actividads;
    }
    
    public void setActividads(Set actividads) {
        this.actividads = actividads;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }
    public Set getCliexsubs() {
        return this.cliexsubs;
    }
    
    public void setCliexsubs(Set cliexsubs) {
        this.cliexsubs = cliexsubs;
    }
    public Set getReservacions() {
        return this.reservacions;
    }
    
    public void setReservacions(Set reservacions) {
        this.reservacions = reservacions;
    }
    public Set getMovcajas() {
        return this.movcajas;
    }
    
    public void setMovcajas(Set movcajas) {
        this.movcajas = movcajas;
    }




}


