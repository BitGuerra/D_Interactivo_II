/*
Diseñe un algoritmo que capture el número de placa de un grupo de vehículos, luego 
deberá imprimir las placas registradas con su respectiva posición en el arreglo y 
preguntar cuál es la posición de la placa que desea cambiar, todo esto en un solo 
mensaje, el usuario ingresa la posición de la placa y la nueva placa. Finalmente, el 
código mostrara la lista de placas con el cambio sugerido. El número de placas a 
registrar es indicado por el usuario.
 */

package Semana_7_Tarea;
import javax.swing.JOptionPane;

public class Tarea_PUNTO_3 {
    public static void main(String[]args){
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de placas a ingresar")); 
        String[] placas = new String[cantidad];
        int posicion = 0;
        String nuevaPlaca ="";
        String salida ="Las placas registradas son\n";
        
        for(int i=0;i<cantidad;i++){
            placas[i] = JOptionPane.showInputDialog(null,i+". Digite la placa: ");
            salida += i+". "+placas[i]+"\n";
        }
        
        salida += "Digite la posicion de la placa que desea cambiar";
        posicion = Integer.parseInt(JOptionPane.showInputDialog(null,salida));
        nuevaPlaca = JOptionPane.showInputDialog(null,"Digite la nueva placa a ingresar");
        placas[posicion] = nuevaPlaca;
        
        salida = "La lista con el cambio es:\n";
        for(int i=0;i<cantidad;i++){
            salida += i+". "+placas[i]+"\n";
        }
        
        JOptionPane.showMessageDialog(null,salida);
    }}
