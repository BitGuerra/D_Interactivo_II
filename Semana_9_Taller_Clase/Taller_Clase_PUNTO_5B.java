/*
Diseñe un algoritmo que calcule el promedio de tres notas dadas por el usuario, valide 
las entradas del algoritmo.
//SOLUCION SIN USAR ARREGLOS - CON UNA BANDERA
 */
package Semana_9_Taller_Clase;
import javax.swing.JOptionPane;


public class Taller_Clase_PUNTO_5B {
    public static void main(String[]args){
        
        double nota1=0,nota2=0,nota3=0,prom=0;
        int bandera1=1;
        
        //VALIDA PRIMERA NOTA
        do{
            try{
                nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la primera nota: "));
                bandera1=0;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Entrada invalida, digite de nuevo..");
            }
        }while(bandera1==1);
        bandera1=1;
        //VALIDA SEGUNDA NOTA
        do{
            try{
                nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la segunda nota: "));
                bandera1=0;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Entrada invalida, digite de nuevo..");
            }
        }while(bandera1==1);
        bandera1=1;
        //VALIDA SEGUNDA NOTA
        do{
            try{
                nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la tercera nota: "));
                bandera1=0;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Entrada invalida, digite de nuevo..");
            }
        }while(bandera1==1);
        
        //CALCULA E IMPRIME PROMEDIO
        
        prom = Promedio(nota1,nota2,nota3);
        JOptionPane.showMessageDialog(null, "El promedio es: "+prom);
    }
    
    public static double Promedio(double n1,double n2,double n3){
        double promedio = (n1+n2+n3)/3;
        return promedio;
    }
}
