/*
Diseñe un algoritmo que capture la edad de un nuero determinado de personas, las 
entradas deben ser validadas, el algoritmo debe imprimir las edades registradas y el 
promedio de las edades. Para entender  como validar arreglos véase:
Semana_9/ Semana_9_Taller_Clase/ Taller_Clase_PUNTO_5C.
 */
package Semana_9_Preparcial_II;
import javax.swing.JOptionPane;

public class Repaso_9_PUNTO_4 {
    public static void main(String[]args){
               
        int cantidad = 0;
        double promedio = 0;
        int suma = 0;
        String letrero = "Las edades resgistradas son:\n";
        int bandera1 = 1;
        int bandera2 = 1;
        
        //Valida la cantida de edades a ingresar
        do{
            try{
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de edades a resgistrar: "));
                bandera1 = 0;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Entrada invalida ! ! !");
            }
        }while(bandera1==1);
        
        int[] edades = new int[cantidad];
        
        for(int i=0;i<cantidad;i++){
            
            do{
                try{
                    edades[i] = Integer.parseInt(JOptionPane.showInputDialog(null,i+".Digite la edad: "));
                    bandera1 = 0;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Entrada invalida ! ! !");
                }
            }while(bandera1==1);
            bandera1 = 1;
            
            suma += edades[i];
            
            letrero += i+". "+edades[i]+" años\n";   
        }
        
        promedio = suma/cantidad;
        letrero += "\n El promedio de edades es: "+promedio;
        JOptionPane.showMessageDialog(null,letrero);
    }
}
