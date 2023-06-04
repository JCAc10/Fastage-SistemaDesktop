/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda_inventario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calcular {
    int cantidad;
    double precio;

    public Calcular(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public double subTotal(){
        double sub = getCantidad()*getPrecio();
        BigDecimal bd = new BigDecimal(sub).setScale(2, RoundingMode.HALF_UP);
        double subT = bd.doubleValue();
        return subT;
    }
    
    public double IGV(){
        double IGV = subTotal()*0.18;
        BigDecimal bd = new BigDecimal(IGV).setScale(2, RoundingMode.HALF_UP);
        double igvF = bd.doubleValue();
        return igvF;
    }
    
    public double Total(){
        double tot = subTotal()+IGV();
        BigDecimal bd = new BigDecimal(tot).setScale(2, RoundingMode.HALF_UP);
        double total = bd.doubleValue();
        return total;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
