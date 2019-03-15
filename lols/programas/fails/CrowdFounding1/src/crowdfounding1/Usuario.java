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
public class Usuario {
   
    private Persona persona=new Persona();
    private int dinero;
    private String Contrasena;
    private String username;

    public Usuario(int dinero, String Contrasena, String username) {
        this.dinero = dinero;
        this.Contrasena = Contrasena;
        this.username = username;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    
    
    
}
