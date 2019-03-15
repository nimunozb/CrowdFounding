/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crowdfounding1;

/**
 *
 * @author Horacio
 */
public class Persona {
 private String nombre;
 private int cedula;
 private int telefono;

    public Persona() {
    }

    public Persona(String nombre, int cedula, int telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
 
    
    
    
    
}
