/*
Un docente de la UTAP necesita de su ayuda para crear un sistema que le permita 
ingresar 6 notas de un estudiante y al final modificar una de ellas. Después de capturar 
cada una de las 6 notas el algoritmo debe mostrar todas las notas con su respectiva 
posición en el arreglo y preguntar la nota que desea modificar, el usuario debe 
ingresar la posición de arreglo y la nueva nota por la que desea cambiarla. Finalmente, 
el codigo mostrara la lista de notas con el cambio sugerido.

 */
package Semana_7_Taller_Clase;
import javax.swing.JOptionPane;

public class Taller_Clase_PUNTO_3 {
    public static void main(String[]args){
        
        double[] notas = new double[6];
        double nuevaNota = 0;
        int posModificar = 0;
        String salida = "Notas Registradas: \n";
        
        for(int i=0;i<6;i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,i+". Digite la nota: "));
            salida += i+". "+notas[i]+"\n";
        }
        
        salida += "Digite la posicion de la nota a modificar:"; 
        posModificar = Integer.parseInt((JOptionPane.showInputDialog(null,salida)));
        nuevaNota = Double.parseDouble((JOptionPane.showInputDialog(null,"Digite la nueva nota:")));
        notas[posModificar] = nuevaNota;
        
        salida="Lista de notas con el cambio: \n";
        for(int i=0;i<6;i++){
            salida += i+". "+notas[i]+"\n";
        }
        
        JOptionPane.showMessageDialog(null,salida);
    }
}
