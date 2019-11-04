/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_12_PUNTO_2;

/**
 *
 * @author LENOVO
 */
public class Producto {
    
    double precioBruto;
    
    public double PrecioDetal(){
        
        double Detal = precioBruto +precioBruto*0.3;
        return Detal;
    }
    
    public double PrecioMayor(){
        
        double Mayor = precioBruto +precioBruto*0.5;
        return Mayor;
    }
}
