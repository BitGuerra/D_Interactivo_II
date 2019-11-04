/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_12_PUNTO_2;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Principal {
    public static void main(String[]args){
        
        Producto Compra = new Producto();
        
        Compra.precioBruto = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el precio"));
        
        JOptionPane.showMessageDialog(null,"Costo al Detal: "+Compra.PrecioDetal()+
                "\nCosto al por Mayor: "+Compra.PrecioMayor());
    }
}
