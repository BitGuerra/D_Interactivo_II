/*
Diseñe un algoritmo que calcule el promedio de tres notas dadas por el usuario, valide 
las entradas del algoritmo.
//SOLUCION CON ARREGLOS
 */
package Semana_9_Taller_Clase;
import javax.swing.JOptionPane;

public class Taller_Clase_PUNTO_5C {
    public static void main(String[]args){
        
        double[] notas = new double[3];
        double bandera=1,prom=0;
        
        for(int i=0;i<3;i++){
            do{
                try{
                    notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,i+".Digite la nota: "));
                    bandera = 0;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Entrada invalida, digite de nuevo..");
                }
            }while(bandera==1);
            
            bandera=1;
        }
        
        prom = Promedio(notas);
        JOptionPane.showMessageDialog(null,"El promedio es: "+prom);
    }
    
    public static double Promedio(double [] notas){
        
        double promedio =0;
        double suma =0;
        int longitud= notas.length;
        
        for(int i=0;i<longitud;i++){
            suma += notas[i];
        }
        
        promedio = suma/longitud;
        return promedio;
    }
}
