/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO_2;

/**
 *
 * @author LENOVO
 */
public class Trabajador {
    
    private String nombre;
    private String cargo;
    private int horasMensuales;
    private int costoHora;

    public Trabajador(String nombre, String cargo, int horasMensuales, int costoHora) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.horasMensuales = horasMensuales;
        this.costoHora = costoHora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public int getHorasMensuales() {
        return horasMensuales;
    }

    public int getCostoHora() {
        return costoHora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setHorasMensuales(int horasMensuales) {
        this.horasMensuales = horasMensuales;
    }

    public void setCostoHora(int costoHora) {
        this.costoHora = costoHora;
    }

    public int Salario(){
        
        int salario = costoHora*horasMensuales;
        return salario;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cargo: " + cargo + ", Horas Mensuales laboradas: " + horasMensuales + ", Coosto Hora: " + costoHora;
    }
    
    
}
