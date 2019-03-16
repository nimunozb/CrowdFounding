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
public class Oferta {
    
    private int interes;
    private String Nombre;

    public Oferta() {
    }

    public Oferta(int interes, String Nombre) {
        this.interes = interes;
        this.Nombre = Nombre;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    
}
