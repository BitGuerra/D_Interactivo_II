/*
Diseñe un código para una escuela que capture el nombre y edad de cada uno de los 
alumnos del curso, luego el código deberá imprimir todos los nombres, edades de los 
alumnos y la cantidad de estudiantes mayores de edad y menores de edad, todo esto 
en un solo mensaje. La cantidad de alumnos es determinada por el usuario

 */
package Semana_7_Tarea;
import javax.swing.JOptionPane;

public class Tarea_PUNTO_2 {
    public static void main(String[]args){
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de estudiantes a registrar"));
        String[] nombres = new String[cantidad];
        int[] edades = new int[cantidad];
        int mayores=0;
        int menores=0;
        String salida = "Los alumnos registrados son: \n";
        
        for(int i=0;i<cantidad;i++){
            nombres[i]=JOptionPane.showInputDialog(null,i+". Digite el nombre del alumno a registrar");
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad de "+nombres[i]));
            salida += nombres[i]+": "+edades[i]+"\n";
            
            if(edades[i]>= 18){
                mayores += 1;
            }else{
                menores += 1;
            }
        }
        salida += "Mayores de edad: "+mayores+"\n";
        salida += "Menores de edad: "+menores+"\n";
        
        JOptionPane.showMessageDialog(null,salida);
    }    
}
