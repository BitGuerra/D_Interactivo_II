
package Ejercicios_Repaso;
import javax.swing.JOptionPane;

public class Punto2 {
    public static void main(String [] args){
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la edad del trabajador: "));
        int base = 700000;
        double pago = 0;
        
        if( edad < 18 ){
            
            JOptionPane.showMessageDialog(null,"No tiene edad para trabajar");
            
        }else if(edad >= 19 && edad <= 50 ){
            pago = base + base*0.05;
            
        }else if(edad >= 51 && edad <= 60 ){
            pago = base + base*0.1;
        }else if(edad >= 61){
            pago = base + base*0.15;
        }
        
        JOptionPane.showMessageDialog(null,"El pago es: "+pago);
    }
}
