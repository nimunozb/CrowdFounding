package oneclickbreadcontrol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import static oneclickbreadcontrol.OneClickbreadControl.jefe;

/**
 *
 * @author Andres
 */
public class Panaderia implements Serializable {
 private Inventario inv= new Inventario();
 private String nombre;//Chioma Bakery
 private String direccion;//crr 51#134-90
 private int Telefono;//3043513484
 private ArrayList<Caja> cajasmensuales;
 public static Empleado evigente;
private ArrayList<Empleado> empleados; 
private ArrayList<Proveedor> proveedores;

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }
    public void addProv(Proveedor prov){
        this.proveedores.add(prov);
    }

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public Panaderia(String nombre, String direccion, int Telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.Telefono = Telefono;
        this.empleados =new ArrayList<>();
        this.cajasmensuales =new ArrayList<>();
        this.proveedores = new ArrayList<>();
        
        
        
    }
    public void UsuarioVigente(Empleado e){
       
       evigente=new Empleado(e.getSalario(),e.nombre,e.ID,e.ususario,e.contrasena);
                  GregorianCalendar cal=new GregorianCalendar();
               Caja aux=new Caja(cal.getTime().getDay(),cal.getTime().getMonth()+1,cal.getTime().getYear()+1900,cal.getTime().getHours(),e);  
             evigente.setCajas(aux);System.out.println("la monda");
             
            }
        
    
    public ArrayList<Producto>TendenciaMensual(){
        GregorianCalendar cal=new GregorianCalendar();
        HashMap<String,Integer>contador=new HashMap<>();
        for(Caja c:this.cajasmensuales){
            if(c.getMes()==cal.getTime().getMonth()&&c.getAnno()==cal.getTime().getYear()){
                for(Venta v:c.getVentas()){
                    for(Producto p:v.getProductosvendidos()){
                     if(contador.containsKey(p.getID())==false){
                         contador.put(p.getID(), p.getCatidad());
                     }   else{
                         int a = contador.get(p.getID());
                         a += p.getCatidad();
                         contador.replace(p.getID(), a);
                         
                     }
                    }
                }
            }
        }
        ArrayList<Producto> aux = new ArrayList<>();
        int a = 0;
        String max="";
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            String key = entry.getKey();
            
            if(a< contador.get(key)){
                a = contador.get(key);
                max=key;
            }
          }aux.add(new Producto("", "", 0, 0, ""));
        llenarTendencia(0, aux, max);
        
        int b = 0;
       String max2 = "";
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            String key = entry.getKey();
             if((b< contador.get(key))&& a>=contador.get(key)&& !key.equals(aux.get(0).getID()) ){
                b = contador.get(key);
                max2=key;
            }
            
        }llenarTendencia(1, aux, max2);
        int c=0;
        String max3="";
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            String key = entry.getKey();
             if((c< contador.get(key))&& b>=contador.get(key)&& !key.equals(aux.get(0).getID()) ){
                c = contador.get(key);
                max3=key;
            }
            
        }llenarTendencia(2, aux, max3);
    for(Producto p:aux){
        System.out.println(p.getNombre());
    }
        return aux;}
public Venta HacerVenta(ArrayList<Producto>a,GestionDeArchivos gestion) throws InterruptedException{
GregorianCalendar cal=new GregorianCalendar();
    System.out.println("ññññ");
    Venta v=new Venta(cal.getTime().getDay(),cal.getTime().getMonth()+1,cal.getTime().getYear()+1900,cal.getTime().getHours(),a);
    System.out.println(evigente.getCajas().get(0).getEmpleado().getNombre());
    for (Caja c : evigente.getCajas()) {
         System.out.println("lalalal");
    if(c.getAnno()==cal.getTime().getYear()&&c.getMes()==cal.getTime().getMonth()&&c.getDia()==cal.getTime().getDay()){
       c.getVentas().add(v);
    }

    
    for(Producto p:a){
        Thread.sleep(5000);
      System.out.println("lhjkh");
      this.inv.quitar(p.getID(),p.getCatidad(), gestion);
      
  }
}
  return v; 

}
   public ArrayList<Caja> CrearCajaMensual(int dia,int mes,int Anno,int hora){
     GregorianCalendar cal=new GregorianCalendar();
       Caja asignacion=new Caja(cal.getTime().getDay(), cal.getTime().getMonth()+1, cal.getTime().getYear(),cal.getTime().getHours());
       for(Empleado e:this.empleados){
      for (Caja aux : e.getCajas()) {
           if(aux.getAnno()==cal.getTime().getYear()+1900){
               if(aux.getMes()+1==cal.getTime().getMonth()){
                   if(aux.getDia()<=cal.getTime().getDay()){
                       asignacion.getVentas().addAll(asignacion.getVentas().size(),aux.getVentas());
                   }
               }
           }
       }}
   if(asignacion.getVentas().size()>0){
       this.cajasmensuales.add(asignacion);}
   return cajasmensuales;
           }


public boolean ingresar(String username,String contrasena){
    GregorianCalendar cal=new GregorianCalendar();
    for (Empleado e:jefe.getChiomaBakery().empleados) {
        
        System.out.println(e.getContrasena());
        if(e.getUsusario().equals(username)&&e.getContrasena().equals(contrasena)){
            this.UsuarioVigente(e);
            System.out.println("la");
            
            for(Caja c:evigente.getCajas()){
                if(c.getDia()==cal.getTime().getDay()&&c.getAnno()==cal.getTime().getYear()+1900&&c.getMes()==cal.getTime().getMonth()+1){
                    return true;
                } 
             }if(evigente.getCajas().size()!=0){Caja aux=new Caja(cal.getTime().getDay(),cal.getTime().getMonth()+1,cal.getTime().getYear()+1900,cal.getTime().getHours(),e);
             evigente.getCajas().add(aux);}
             return true;
        }
    }
    return false;
}

public Inventario getInv() {
        return inv;
    }

    public void setInv(Inventario inv) {
        this.inv = inv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    

    public ArrayList<Caja> getCajasmensuales() {
        return cajasmensuales;
    }

    public void setCajasmensuales(ArrayList<Caja> cajasmensuales) {
        this.cajasmensuales = cajasmensuales;
    }

    public static Empleado getEvigente() {
        return evigente;
    }

    public static void setEvigente(Empleado evigente) {
        Panaderia.evigente = evigente;
    }
    
    
    
    
    
    public void llenarTendencia(int pos, ArrayList<Producto> aux,String max){
        GregorianCalendar cal=new GregorianCalendar();
        for(Caja c:this.cajasmensuales){
            if(c.getMes()==cal.getTime().getMonth()&&c.getAnno()==cal.getTime().getYear()){
                for(Venta v:c.getVentas()){
                    for(Producto p:v.getProductosvendidos()){
                    if(p.getID().equals(max)&& !(aux.get(pos).getID().equals(p.getID()))){
                        aux.remove(pos);
                        aux.add(p);
                    }
                    }
                }
            }
        }
    }

    
   


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    










    

   
    
    
    
 
















}
