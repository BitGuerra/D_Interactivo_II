/*
Diseñe un algoritmo que capture un número de notas determinadas por el usuario, 
después de capturar las notas el código deberá imprimir las notas registradas con su 
posición, promedio y permitir cambiar una nota. Al introducir la posición de la nota 
a cambiar el algoritmo debe preguntar por la nueva nota, a continuación, el código 
debe mostrar la lista de las notas con el cambio y el promedio, puesto que si cambia 
una nota cambia el promedio.

 */
package Semana_9_Preparcial_II;
import javax.swing.JOptionPane;

public class Repaso_9_PUNTO_1 {
    public static void main(String[]args){
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de notas a registrar: "));
        double[] notas = new double[cantidad];
        double suma = 0;
        double promedio = 0;
        double nuevaNota = 0;
        int posicion = 0;
        String letrero="Las notas registradas son: \n";
        
        for(int i=0;i<cantidad;i++){
            
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,i+".Digite la nota: "));
            letrero +=i+".  "+notas[i]+"\n";
            suma += notas[i];
        }
        
        promedio = suma/cantidad;
        letrero +="El promedio de las notas es: "+promedio+"\n";
        letrero +="Digite la posicion de la nota que desea cambiar: ";
        posicion = Integer.parseInt(JOptionPane.showInputDialog(null,letrero));
        
        nuevaNota = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la nueva nota:"));
        notas[posicion]=nuevaNota;
        
        letrero = "Las nuevas notas son: \n"; 
        suma = 0;
                
        for(int i=0;i<cantidad;i++){
            
            letrero+=i+".  "+notas[i]+"\n";
            suma += notas[i];
        }
        promedio = suma/cantidad;
        letrero +="El promedio de las notas es: "+promedio+"\n";
        JOptionPane.showMessageDialog(null,letrero);
    }
}
