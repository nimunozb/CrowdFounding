/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crowdfounding1;

import java.util.logging.Logger;

/**
 *
 * @author Horacio
 */
public class Promotor extends Usuario{
 
    private Proyecto proyecto=new Proyecto();

    public Promotor(int dinero, String Contrasena, String username, String nombre, int cedula, int telefono) {
        super(dinero, Contrasena, username, nombre, cedula, telefono);
    }

    public Promotor(int dinero, String Contrasena, String username, String nombre, int cedula) {
        super(dinero, Contrasena, username, nombre, cedula);
    }

   
    
    
    

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
   
    public Proyecto crearunproyecto(int intereces){
        Proyecto proyecto=new Proyecto("Un prestamo de efectivo",intereces);
         proyecto.setNombredepromotor(this.getNombre());
         proyecto.setMinutos(main.calendario.getTime().getMinutes()+3);
         return proyecto;
    }
    
   
    
    
    
}
