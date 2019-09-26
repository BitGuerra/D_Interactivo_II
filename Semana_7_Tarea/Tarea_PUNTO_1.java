/*
Diseñe un algoritmo para la clase de diseño interactivo que capture el nombre y la 
nota final de cada estudiante, luego el algoritmo deberá imprimir las notas de los 
estudiantes junto al nombre que se registraron y también la cantidad de estudiantes 
que pasaron la materia, todo esto en un solo mensaje. La cantidad de estudiante esta 
dada por el usuario.
 */
package Semana_7_Tarea;
import javax.swing.JOptionPane;

public class Tarea_PUNTO_1 {
    public static void main(String[]args){
        
        int estudiantes = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de estudiantes"));
        String[] nombres = new String[estudiantes];
        double[] notas = new double[estudiantes];
        int pasan = 0;
        String salida="Las notas registradas son:\n";
        
        for(int i=0;i<estudiantes;i++){
            nombres[i] = JOptionPane.showInputDialog(null,i+". Digite el nombre del estudiante a registrar: ");
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la nota de "+nombres[i]));            
            salida += i+". "+nombres[i]+": "+notas[i]+"\n";           

            
            if(notas[i]>=3.0){
                pasan += 1;
            }
        }
        salida += "Pasan la asignatura: "+pasan;
        JOptionPane.showMessageDialog(null,salida);
    }
}
