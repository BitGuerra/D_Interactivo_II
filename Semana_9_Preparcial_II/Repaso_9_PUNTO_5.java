/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_9_Preparcial_II;
import javax.swing.JOptionPane;

public class Repaso_9_PUNTO_5 {
    public static void main(String[]args){
        
        int cantidad = 0,mayores = 0,menores = 0;
        String letrero = "Los numeros registrados son:\n";
        int bandera1 = 1;
        int bandera2 = 1;
        
        //Valida la cantida de edades a ingresar
        do{
            try{
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de numeros a resgistrar: "));
                bandera1 = 0;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Entrada invalida ! ! !");
            }
        }while(bandera1==1);
        
        double[] numeros = new double[cantidad];
        
        for(int i=0;i<cantidad;i++){
            
            do{
                try{
                    numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,i+".Digite lel numero: "));
                    bandera2 = 0;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Entrada invalida ! ! !");
                }
            }while(bandera2==1);
            
            bandera2 = 1;
            letrero += i+". "+numeros[i]+"\n";   
            
            if(numeros[i]>5){
                mayores +=1;
            }else{
                menores +=1;
            }
        }
        
        letrero += "\nLa catidad de numeros menores o iguales a 5 son: "+menores
                +"\nLa catidad de numeros mayores a 5 son: "+mayores;
        
        JOptionPane.showMessageDialog(null,letrero);
    }
}
