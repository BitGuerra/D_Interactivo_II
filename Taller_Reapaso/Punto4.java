/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Repaso;
import javax.swing.JOptionPane;

public class Punto4 {
    public static void main(String [] args){
        
        int numero = 0;
        int mayor = 0;
        
        for(int i=0;i<=10;i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,i+". Dite el numero: "));
            
            if(numero > mayor){
                mayor = numero;
            }
        }
        
        JOptionPane.showMessageDialog(null,"El numero mayor es: "+mayor);
    }
}
