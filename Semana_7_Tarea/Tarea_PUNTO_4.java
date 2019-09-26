/*
Diseñe un algoritmo que capture una cantidad de letras dadas por el usuario, el código 
al final debe imprimir las letras registradas con su respectiva posición y deberá 
preguntar por cual letra desea cambiar, todo esto en un solo mensaje, luego preguntar 
por la nueva letra y finalmente imprimir las la lista de letras con el cambio realizado.
 */
package Semana_7_Tarea;
import javax.swing.JOptionPane;

public class Tarea_PUNTO_4 {
    public static void main(String[]args){
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de letrsa a ingresar"));
        char[] letras = new char[cantidad]; 
        String letra=" ";
        int posicion =0;
        char Nuevaletra = ' ';
        String salida = "Las letras registradas son: \n";
        
        for(int i=0;i<cantidad;i++){
           letra = JOptionPane.showInputDialog(null,i+ ", Digite la nota a registrar");
           letras[i] = letra.charAt(0);
           salida += i+". "+letras[i]+"\n";
        }
        
        salida += "Digite la posicion de la nueva letra a cambiar";
        posicion = Integer.parseInt(JOptionPane.showInputDialog(null,salida));
        letra = JOptionPane.showInputDialog(null,"Digite la nueva letra: ");
        Nuevaletra = letra.charAt(0);
        letras[posicion] = Nuevaletra;
        
        salida = "La lista con los cambios es: \n";
        
        for(int i=0;i<cantidad;i++){
           salida += i+". "+letras[i]+"\n";
        }
        
        JOptionPane.showMessageDialog(null,salida);
    }
}
