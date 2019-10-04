/*
Diseñe una función para calcular el mínimo de un arreglo de longitud desconocida
 */
package Semana_9_Taller_Clase;
import javax.swing.JOptionPane;

public class Taller_Clase_PUNTO_1 {
    public static void main(String[]args){
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de numeros: "));
        int[] numeros = new int[cantidad];
        int max = 0;
        
        for(int i=0;i<numeros.length;i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,i+". Digite el numero: "));
        }
        
        max =  CalculaMayor(numeros);
        
        JOptionPane.showMessageDialog(null,"El numero mayor es: "+max);
        
    }
    
    public static int CalculaMayor(int[]numeros){
        
        int mayor = numeros[0];
        
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>mayor){
                mayor=numeros[i];
            }
        }
        
        return(mayor);
    }
}
