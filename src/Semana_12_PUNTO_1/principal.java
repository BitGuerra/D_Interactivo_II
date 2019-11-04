/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_12_PUNTO_1;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class principal {
    public static void main(String []args){
        
        Circulo miCirculo = new Circulo();
        
        miCirculo.radio = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el radio del circulo: "));
        
        JOptionPane.showMessageDialog(null,"Diametro del circulo: "+miCirculo.diametro()+
                "\nArea del circulo: "+miCirculo.area()+
                "\nPerimetro del circulo: "+miCirculo.perimetro());
    }
}
