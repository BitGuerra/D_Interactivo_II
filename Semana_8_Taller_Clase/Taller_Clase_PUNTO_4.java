/*
Diseñe un Algoritmo que calcule el año de nacimiento a partir de la edad y el año 
actual, usar una función que tenga como entradas la edad y el año actual y retornar la 
edad.

 */
package Semana_8_Taller_Clase;
import javax.swing.JOptionPane;

public class Taller_Clase_PUNTO_4 {
    public static void main(String[]args){
         
        int actual = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año actual: "));
        int nacimiento = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año de nacimiento: "));
        
        int edad = calculoEdad(actual,nacimiento);
        
        JOptionPane.showMessageDialog(null,"Su edad es: "+edad);
    }
    
    public static int calculoEdad(int FechaActual,int FechaNacimiento){
        int tiempo = FechaActual-FechaNacimiento; 
        return(tiempo);
    }
}
