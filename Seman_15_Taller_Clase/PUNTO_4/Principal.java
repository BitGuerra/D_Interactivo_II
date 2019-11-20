
package PUNTO_4;
import javax.swing.JOptionPane;
/*
4.	Un teatro requiere de un algoritmo para registrar la entrada de sus clientes, se requiere 
nombre, identificación, edad. la tarifa básica es de 45000 pesos, para mayores de 40 
se da un descuento del 10% sobre la tarifa básica, para personas entre 20 y menores 
de 40, se cobra un 5% por ciento más sobre la tarifa básica, para menores de 20 se 
aplica directamente la tarifa básica. Imprimir los datos de los clientes, la cantidad de 
clientes esta dad por el usuario.

*/
public class Principal {
    public static void main(String[]args){
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de clientes a registrar: "));
        String nombre = "";
        String ID = "";
        int edad = 0;
        String texto="";
        
        Cliente[] clientes = new Cliente[cantidad];
        
        for(int i=0;i<cantidad;i++){
            
            nombre = JOptionPane.showInputDialog(null,"Digite el nombre del cliente #"+i+": ");
            ID = JOptionPane.showInputDialog(null,"Digite el ID del cliente #"+i+": ");
            edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la edad del cliente #"+i+": "));
            
            clientes[i] = new Cliente(nombre,edad,ID);
            texto +="\n"+clientes[i].toString()+", Costo entrada: "+clientes[i].costo();
            
        }
        
        JOptionPane.showMessageDialog(null,texto);
    }
}
