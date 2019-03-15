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
public class Proyecto {
    
    private String descripcion;
    private int valoasolicitar;

    public Proyecto() {
    }

    public Proyecto(String descripcion, int valoasolicitar) {
        this.descripcion = descripcion;
        this.valoasolicitar = valoasolicitar;
    }

    public Proyecto(String descripcion) {
        this.descripcion = descripcion;
    }

    public Proyecto(int valoasolicitar) {
        this.valoasolicitar = valoasolicitar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValoasolicitar() {
        return valoasolicitar;
    }

    public void setValoasolicitar(int valoasolicitar) {
        this.valoasolicitar = valoasolicitar;
    }
        
            
    
    
    
}
