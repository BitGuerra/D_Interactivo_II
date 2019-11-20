/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO_4;

public class Cliente {

    private String nombre;
    private int edad;
    private String id;

    public Cliente(String nombre, int edad, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double costo(){
        double precio=0;
        
        if(edad>=40){
            precio = 45000-0.1*45000;
        }else if(edad>=20 && edad <40){
            precio = 0.05*45000+45000;
        }else if(edad<20){
            precio = 45000;
        }
        return precio;
    }
    @Override
    public String toString() {
        return "Cliente: "+ nombre + ", Edad: " + edad + ", ID: " + id ;
    }
    
    
}
