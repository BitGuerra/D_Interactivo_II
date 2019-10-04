/*
Diseñe un algoritmo que capture la edad e imprima si es mayor de edad o no, para 
esto use una función que tenga como entrada la edad y retorne la cadena si es mayor 
o menor de edad.

 */
package Semana_8_Tarea;
import javax.swing.JOptionPane;

public class Tarea_PUNTO_5 {
    
    public static void main(String[]args){
        
        int  age = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su edad"));
        
        JOptionPane.showMessageDialog(null,mayor(age));
    }
    public static String mayor(int edad){
        String salida="";
        
        if(edad >= 18){
            salida = "Mayor de edad";
        }else{
            salida = "Menor de edad";
        }
        
        return salida;
    }
}
