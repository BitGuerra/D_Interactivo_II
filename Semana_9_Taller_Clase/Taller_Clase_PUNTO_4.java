/*
Diseñe un algoritmo que calcule el cuadrado de un número real, para ello valide las 
entradas es decir cuando el usuario ingrese un carácter incorrecto en lugar de un 
numero el algoritmo muestre que hay un error y pregunte de nuevo por el dato.
 */
package Semana_9_Taller_Clase;
import javax.swing.JOptionPane;

public class Taller_Clase_PUNTO_4 {
    public static void main(String[]args){
        
        int bandera = 1;
        int numero=0,cuadrado=0;
        
        do{
            try{
                numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero: "));
                bandera=0;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Entrada invalida, digite de nuevo..");
            }
        }while(bandera==1);
        
        cuadrado = numero*numero;
        
        JOptionPane.showMessageDialog(null,"El cuadrado de "+numero+" es "+cuadrado);
    }
}
