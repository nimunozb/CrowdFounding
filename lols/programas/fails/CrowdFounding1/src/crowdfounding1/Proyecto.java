/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crowdfounding1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Horacio
 */
public class Proyecto {
    
    private String descripcion;
    private int valoasolicitar;
    private ArrayList <Oferta> oferta=new ArrayList();
    private String nombredepromotor;
    private int minutos;
   

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

    public Proyecto(int valoasolicitar, String nombredepromotor, int minutos) {
        this.valoasolicitar = valoasolicitar;
        this.nombredepromotor = nombredepromotor;
        this.minutos = minutos;
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

    public ArrayList<Oferta> getOferta() {
        return oferta;
    }

    public void setOferta(ArrayList<Oferta> oferta) {
        this.oferta = oferta;
    }
   
   

    public String getNombredepromotor() {
        return nombredepromotor;
    }

    public void setNombredepromotor(String nombredepromotor) {
        this.nombredepromotor = nombredepromotor;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
     public String elegirganador(){
            
             double max = 0;
        for (int i = 0; i <this.getOferta().size(); i++) {
            if ( this.getOferta().get(i).getInteres() > max) {
                max = this.getOferta().get(i).getInteres();
            }
        }
        double min = max;
        for (int i = 0; i < this.getOferta().size(); i++) {
            if (this.getOferta().get(i).getInteres() < min) {
                min = this.getOferta().get(i).getInteres();
            }
        }
            
            int i= this.getOferta().indexOf(min);
          return  this.getOferta().get(i).getNombre();
          }
        
    
    public void Mostrarganador(){
        
        JOptionPane.showMessageDialog(null,"El ganador de la subasta es:"+elegirganador(),"Information",JOptionPane.INFORMATION_MESSAGE);
        
        
    }
            
    
    
    
}
