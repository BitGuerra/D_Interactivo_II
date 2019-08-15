
package Ejercicios_Repaso;
import javax.swing.JOptionPane;

public class Punto3 {
    public static void main(String[]args){
        
        String numeros="";
        
        for(int i=1;i<=12;i++){
            numeros += i+"-";
        }
        
        JOptionPane.showMessageDialog(null,"Los numeros son"+
                "\n"+numeros);
    }
}
