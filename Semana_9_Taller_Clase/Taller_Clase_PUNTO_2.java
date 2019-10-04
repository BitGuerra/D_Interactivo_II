/*
Diseñe una función para calcular el mínimo de un arreglo de longitud desconocida
 */
package Semana_9_Taller_Clase;
import javax.swing.JOptionPane;

public class Taller_Clase_PUNTO_2 {
    public static void main(String[]args){
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de numeros: "));
        int[] numeros = new int[cantidad];
        int minimo = 0;
        
        for(int i=0;i<numeros.length;i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,i+". Digite el numero: "));
        }
        
        minimo =  CalculaMenor(numeros);
        
        JOptionPane.showMessageDialog(null,"El numero menor es: "+minimo);
        
    }
    
    public static int CalculaMenor(int[]numeros){
        
        int menor = numeros[0];
        
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]<menor){
                menor=numeros[i];
            }
        }
        
        return(menor);
    }
}
