/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_12_PUNTO_3;

/**
 *
 * @author LENOVO
 */
public class Renta {
    
    String nombre;
    String cedula;
    int horas;
    
    public int pago(){
        int precio = 17000*horas;
        return precio;
    }
}
