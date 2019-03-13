/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneclickbreadcontrol;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Empleado extends Persona implements Serializable{
    
   private int salario;
private ArrayList<Caja>cajas;

    public Empleado(int salario, String nombre, String ID, String ususario, String contrasena) {
        super(nombre, ID, ususario, contrasena);
        this.salario = salario;
        this.cajas=new ArrayList<>();
        
    }

   
    

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public ArrayList<Caja> getCajas() {
        return cajas;
    }

    public void setCajas(ArrayList<Caja> cajas) {
        this.cajas = cajas;
    }
   public void setCajas(Caja cajas) {
        this.cajas.add(cajas);
    }

   

  
   
        
    
    
   
        
    
    
    
    
}
