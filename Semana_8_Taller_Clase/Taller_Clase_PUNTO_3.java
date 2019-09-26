/*
Diseñe un algoritmo que calcule la suma de dos números, dicha suma debe ser 
realizada en una función que tenga como entrada los dos números y salida será la 
suma de las entradas. 
 */
package Semana_8_Taller_Clase;
import javax.swing.JOptionPane;

public class Taller_Clase_PUNTO_3 {
    public static void main(String[]args){
        
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el primer numero"));
        double Num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el segundo numero"));
        double resultado = CalculaSuma(Num1,Num2);
        
        JOptionPane.showMessageDialog(null,"La suma de los numeros es: "+resultado);
    }
    public static double CalculaSuma(double numeroA,double numeroB){
        double suma = numeroA-numeroB;
        return suma;
    }
}
