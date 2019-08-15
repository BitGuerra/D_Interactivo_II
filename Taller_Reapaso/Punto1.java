
package Ejercicios_Repaso;
import javax.swing.JOptionPane;

public class Punto1 {
    public static void main(String []args){
    
        int cantidad = 0;
        double precio = 0;
        double totalBruto = 0;
        double totalNeto = 0;
        double descuento = 0;
        
        precio = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el precio de la unidad del producto: "));
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de productos: "));
        
        totalBruto = precio*cantidad;
        
        if(totalBruto < 50000){
            descuento = 0.08*totalBruto;
            totalNeto = totalBruto - descuento;
        }else if(totalBruto>=50000){
            descuento = 0.1*totalBruto;
            totalNeto = totalBruto - descuento;
        }
        
        JOptionPane.showMessageDialog(null,"Precio sin descuento: "+totalBruto
                +"\nDescuento: "+descuento
                +"\nPrecio con descuento: "+totalNeto);
    }
}
