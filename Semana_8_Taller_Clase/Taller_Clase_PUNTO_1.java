/*
Diseñe un algoritmo que capture un numero e imprima su cuadrado, para el cálculo 
del cuadrado use una función tenga como entrada el número y retorne su cuadrado

 */
package Semana_8_Taller_Clase;
import javax.swing.JOptionPane;

public class Taller_Clase_PUNTO_1 {
    public static void main(String[]args){
        
        int Numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el primer numero: ")); 
        int cuadrado = CalculaCuadrado(Numero);
        
        String salida="El cuadrado del numero es: "+cuadrado;
        
        JOptionPane.showMessageDialog(null, salida);
    }
    
    public static int CalculaCuadrado(int numero){
        int cuadrado =numero*numero;
        return(cuadrado);
    }
}
