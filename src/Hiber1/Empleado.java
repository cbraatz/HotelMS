package Hiber1;
// Generated 09-ene-2012 14:16:06 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private int idempleado;
     private Cargos cargos;
     private String numdoc;
     private String nombre;
     private String apellido;
     private String direccion;
     private String telefono;
     private Float sueldo;
     private Character activo;
     private Set trabajos = new HashSet(0);
     private Set usuarioses = new HashSet(0);
     private Set rutinas = new HashSet(0);

    public Empleado() {
    }

	
    public Empleado(int idempleado) {
        this.idempleado = idempleado;
    }
    public Empleado(int idempleado, Cargos cargos, String numdoc, String nombre, String apellido, String direccion, String telefono, Float sueldo, Character activo, Set trabajos, Set usuarioses, Set rutinas) {
       this.idempleado = idempleado;
       this.cargos = cargos;
       this.numdoc = numdoc;
       this.nombre = nombre;
       this.apellido = apellido;
       this.direccion = direccion;
       this.telefono = telefono;
       this.sueldo = sueldo;
       this.activo = activo;
       this.trabajos = trabajos;
       this.usuarioses = usuarioses;
       this.rutinas = rutinas;
    }
   
    public int getIdempleado() {
        return this.idempleado;
    }
    
    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }
    public Cargos getCargos() {
        return this.cargos;
    }
    
    public void setCargos(Cargos cargos) {
        this.cargos = cargos;
    }
    public String getNumdoc() {
        return this.numdoc;
    }
    
    public void setNumdoc(String numdoc) {
        this.numdoc = numdoc;
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
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Float getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }
    public Character getActivo() {
        return this.activo;
    }
    
    public void setActivo(Character activo) {
        this.activo = activo;
    }
    public Set getTrabajos() {
        return this.trabajos;
    }
    
    public void setTrabajos(Set trabajos) {
        this.trabajos = trabajos;
    }
    public Set getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set usuarioses) {
        this.usuarioses = usuarioses;
    }
    public Set getRutinas() {
        return this.rutinas;
    }
    
    public void setRutinas(Set rutinas) {
        this.rutinas = rutinas;
    }




}


