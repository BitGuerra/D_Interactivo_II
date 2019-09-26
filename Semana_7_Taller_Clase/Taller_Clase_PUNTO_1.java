/*
1.Un centro de reclutamiento de soldados requiere de un algoritmo para registrar la
altura de cada una de las personas, la cantidad de soldados esta dada por el usuario. 
El código luego de registrar la estatura deberá imprimir todas las estaturas e indicar 
la cantidad de soldados que son mayores de 1.70 metros.
 */
package Semana_7_Taller_Clase;

import javax.swing.JOptionPane;


public class Taller_Clase_PUNTO_1 {
    public static void main(String[] args) {
        
        int cantidadSold = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de soldados a registrar: "));
        double[] estaturas = new double[cantidadSold];
        int mayores = 0;
        String salida="Estaruras: \n";
        
        for(int i=0;i<cantidadSold;i++){
            estaturas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,i+". Digite la estatura: "));
            salida += i+". "+estaturas[i]+"\n";
            if(estaturas[i]>1.70){
               mayores += 1; 
            }
        }
        salida += "Mayores a 1.70: "+mayores;
        
        JOptionPane.showMessageDialog(null,salida);
        
    }
    
}
