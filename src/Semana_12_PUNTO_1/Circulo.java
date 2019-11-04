/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_12_PUNTO_1;

/**
 *
 * @author LENOVO
 */
public class Circulo {
    
    //Atributos
    
    double radio;
    
    public double area(){
        double Area = 3.1416*radio*radio;
        return Area;
    }
    public double diametro(){
        double diameter = 2*radio;
        return diameter;
    }
    public double perimetro(){
        double per = 2*3.1416*radio;
        return per;
    }
}
