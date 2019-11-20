/*
3.	Diseñe un algoritmo que capture de un grupo de personas determinado por el usuario: 
nombre, edad, estatura y peso e imprima los datos registrados más el promedio 
de edad, estatura y peso.

 */
package PUNTO_3;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Principal {
    public static void main(String [] args){
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de personas a registrar?:"));
        String texto="Nombre    Edad    Peso    Estatura";
        String nombre = "";
        int edad=0;
        double peso=0,estatura=0;
        
        double acumEdad=0,acumPeso=0,acumEstatura=0;
        double EdadProm=0,pesoProm=0,estaturaProm=0;
        
        
        Persona[] personas = new Persona[cantidad];
        
        for(int i=0;i<personas.length;i++){
            
            nombre = JOptionPane.showInputDialog(null,i+". Nombre: ");
            edad = Integer.parseInt(JOptionPane.showInputDialog(null,i+".Edad: "));
            peso = Double.parseDouble(JOptionPane.showInputDialog(null,i+".Peso: "));
            estatura = Double.parseDouble(JOptionPane.showInputDialog(null,i+".Estatura"));

            personas[i] = new Persona(nombre,edad,peso,estatura);
            
            acumEdad += personas[i].getEdad();
            acumPeso += personas[i].getPeso();
            acumEstatura += personas[i].getEstatura();
            
            texto += "\n"+personas[i].toString(); 
        }
        
        EdadProm = acumEdad/cantidad;
        pesoProm = acumPeso/cantidad;
        estaturaProm = acumEstatura/cantidad;
        
        JOptionPane.showInputDialog(null,texto+
                "\nPromedio edad: "+EdadProm+
                "\nPromedio estatura: "+estaturaProm+
                "\nPromedio peso: "+pesoProm);
    }
    
}
