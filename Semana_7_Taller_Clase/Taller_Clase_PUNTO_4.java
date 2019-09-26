/*
Un supermercado desea un algoritmo para registrar una cantidad de productos 
determinada, el algoritmo después de ingresar el nombre de todos los productos debe 
imprimir los productos con su posición en el arreglo y preguntar cual producto desea 
cambiar, el usuario ingresa la posición del producto y el nuevo producto. Finalmente, 
el código mostrara la lista de productos con el cambio sugerido.

 */
package Semana_7_Taller_Clase;
import javax.swing.JOptionPane;
        
public class Taller_Clase_PUNTO_4 {
    public static void main(String[]args){
        
        int cantidadP = Integer.parseInt(JOptionPane.showInputDialog(null,"Cual es la cantidad de productos a registrar:"));
        String[] Productos = new String[cantidadP];
        String salida="";
        String nuevoProducto = "";
        int posModificar = 0;
        
        for(int i=0;i<cantidadP;i++){
            Productos[i]=JOptionPane.showInputDialog(null,i+". Digite el nombre del producto: ");
            salida += i+". "+ Productos[i]+"\n";
        }
        salida += "Digite la posicion del producto que desea cambiar: ";
        posModificar = Integer.parseInt(JOptionPane.showInputDialog(null,salida));
        nuevoProducto = JOptionPane.showInputDialog(null,"Digite el nuevo producto");
        salida = "Lista de productos con modiciacion: \n";
        
        for(int i=0;i<cantidadP;i++){
            salida += i+" "+Productos[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,salida);
    }
}
