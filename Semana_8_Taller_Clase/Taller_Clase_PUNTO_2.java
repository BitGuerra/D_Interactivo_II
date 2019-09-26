/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_8_Taller_Clase;
import javax.swing.JOptionPane;

public class Taller_Clase_PUNTO_2 {
    
    public static void main(String[]args){
        
        double numeroA = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el primer numero"));
        double numeroB = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el segundo numero"));
        double numeroC = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el tercer numero"));
        
        double prom = CalculaProm(numeroA,numeroB,numeroC);
        
        JOptionPane.showMessageDialog(null,"El promedio de los numeros es: "+prom);
        
    }
    
    public static double CalculaProm(double numero1,double numero2,double numero3){
        double promedio = (numero1+numero2+numero3)/3;
        return promedio;
    }
}
