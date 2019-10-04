/*
Diseñe un algoritmo que calcule el porcentaje de un número, el código debe leer el 
numero y el porcentaje que desea calcular sobre dicho número e imprimir el cálculo, 
por ejemplo, ingresa 10 como número y 50 como porcentaje, entonces el código 
calcularía el 50% de 10 que seria 5 e imprime 5. El calculo del porcentaje debe 
realizarse en una función.

 */
package Semana_8_Tarea;
import javax.swing.JOptionPane;

public class Tarea_PUNTO_1 {
    public static void main(String[]args){
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el numero"));
        double porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el porcentaje que desea calcular de: "+numero));
        double resultado = Calcula(numero,porcentaje);
        
        JOptionPane.showMessageDialog(null,"El "+porcentaje+"% de "+numero+" es: "+resultado);
        
    }
    
    public static double Calcula(double num, double por){
        double res = num*por/100;
        return res;
    }
}
