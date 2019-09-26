
package Semana_7_Taller_Clase;
import javax.swing.JOptionPane;
/**
Diseñe un algoritmo capture una cantidad números enteros dada por el usuario entre
0 y 5, luego el código debe imprimir la lista de números ingresados y la cantidad de 
cuatros (4) que el usuario halla ingresado.
 */
public class Taller_Clase_PUNTO_2 {
    public static void main(String[]args){
        
       int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de numeros a registrar: "));
       int[] numeros = new int[cantidad];
       String salida = "Numeros registrados: \n";
       int cuatros = 0;
       
       for(int i=0;i<cantidad;i++){
           numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,i+". Digite el numero: "));
           salida += i+". "+numeros[i]+"\n";
           
           if(numeros[i]==4){
               cuatros += 1;
           }
       }
       salida += "Iguales a cuatro: "+cuatros;
       JOptionPane.showMessageDialog(null,salida);
       
    }
}
