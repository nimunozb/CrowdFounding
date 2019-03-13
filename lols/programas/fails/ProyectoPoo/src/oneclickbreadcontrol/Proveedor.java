/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneclickbreadcontrol;

import java.io.Serializable;

/**
 *
 * @author Andres
 */
public class Proveedor implements Serializable{
    private String nombre;
    private int telefono;
    private Producto matPrima;

    public Proveedor(String nombre, int telefono, Producto matPrima) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.matPrima = matPrima;
    }

    Proveedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Producto getMatPrima() {
        return matPrima;
    }

    public void setMatPrima(Producto matPrima) {
        this.matPrima = matPrima;
    }
    
    
}
