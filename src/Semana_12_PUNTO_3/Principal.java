/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_12_PUNTO_3;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Principal {
    public static void main(String[]args){
        
        Renta vehiculo = new Renta();
        
        vehiculo.nombre =JOptionPane.showInputDialog(null,"Digite el nombre de la pesrona que renta el vehiculo: ");
        vehiculo.cedula = JOptionPane.showInputDialog(null,"Digite la cedula de la pesrona que renta el vehiculo: ");
        vehiculo.horas = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas horas usara el vehiculo? : "));
        
        JOptionPane.showMessageDialog(null,"Nombre: "+vehiculo.nombre+
                "\nCedula: "+vehiculo.cedula+
                "\nHoras de uso: "+vehiculo.horas+
                "\nPrecio de la renta: "+vehiculo.pago());
    }
}
