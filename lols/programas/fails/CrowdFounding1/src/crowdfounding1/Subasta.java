/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crowdfounding1;

import static crowdfounding1.main.calendario;
import static crowdfounding1.main.usuario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Horacio
 */
public class Subasta {
    
    private ArrayList<Proyecto> proyectos=new ArrayList();// ey men subasta es un array de proyectos, un proyecto es como la iniciativa del promotor
                                                           // de que le presten dinero, la subasta solo se ejecuta para el ultimo de los proyectos
                                                           // osea que solo se va a ejecutar una subasta a la vez

    public Subasta() {
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    
    // esta funcion la vas a poner como evento de el boton que esta en subasta, que crea una subasta nueva 
    // y la mete en el array de subasa de todos los proyectos
    public void crearsubasta(int inteceses){
        
       Promotor promotor=(Promotor)usuario;
        this.proyectos.add(promotor.crearunproyecto(inteceses));
    }
     
    // esta funcion es el evento de el boton unirse que esta en subasta con el fin de ejercer ofertas, para realizar la subasta
    
public void unirse(int interes){
        Oferta oferta=new Oferta(interes,usuario.getNombre());    
        this.proyectos.get(this.proyectos.size()).getOferta().add(oferta);
        }
        
       
    
        //esta funcion la vas a colocar en el evento de unirse, es un hilo que rectifica en cada interaccion del procesaro si la hora pactada al momento
       //de crear el proyecto es igual a la actual, cuando pasa de hora no funciona
        
        public void ganador(ArrayList<Proyecto>proyecto){
           Calendar cal=new GregorianCalendar();
            new Thread(){
             public void run(){
                 boolean salir=false;
                 while(!false){
                     
                     if(proyecto.get(proyecto.size()).getMinutos()==cal.getTime().getMinutes()){
                         
                      proyecto.get(proyecto.size()).Mostrarganador();
                         
                         salir=true;
                    
                     }}}}.start();
            
            
            
            
            
        }
        
        
    
    
}
