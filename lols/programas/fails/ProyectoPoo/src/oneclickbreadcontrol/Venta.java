/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneclickbreadcontrol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Andres
 */
public class Venta implements Serializable{
    
    private int total=0;
    private int dia;
    private int mes;
    private int anno;
    private int hora;
    private ArrayList<Producto>productosvendidos=new ArrayList<>();

    public Venta( int dia, int mes, int anno, int hora,ArrayList<Producto>p) {
        p.forEach((producto) -> {
            total+=producto.getPrecio();
        });
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
        this.hora = hora;
        this.productosvendidos=p;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public ArrayList<Producto> getProductosvendidos() {
        return productosvendidos;
    }

    public void setProductosvendidos(ArrayList<Producto> productosvendidos) {
        this.productosvendidos = productosvendidos;
    }

   
       
}
