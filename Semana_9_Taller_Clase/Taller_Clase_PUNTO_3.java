/*
Diseñe una función para calcular el máximo de un arreglo de longitud desconocida.
 */
package Semana_9_Taller_Clase;
import javax.swing.JOptionPane;

public class Taller_Clase_PUNTO_3 {

    public static void main(String[] args) {
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de numeros a ingresar"));
        int[] numeros = new int[cantidad];
        double prom = 0;
        
        for(int i=0;i<cantidad;i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,i+". Digite el numero: "));
        }
        
        prom = calculaPromedio(numeros);
        
        JOptionPane.showMessageDialog(null,"EL promedio es: "+prom);
    }
    
    public static double calculaPromedio(int [] numeros){
        double promedio=0;
        
        for(int i=0;i<numeros.length;i++){
            
            promedio += numeros[i];
        }
        
        promedio = promedio/numeros.length;
        
        return(promedio);
    }

}
