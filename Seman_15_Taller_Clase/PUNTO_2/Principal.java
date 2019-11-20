/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO_2;
import javax.swing.JOptionPane;
/**
2.	Modifique el anterior código para que capture los datos de tres empleados (del 
usuario) e imprima los datos registrados el salario más bajo y el más alto.

 */
public class Principal {
    public static void main(String[]args){
        
        Trabajador[] empleados = new Trabajador[3];
        
        int SalarioMayor = 0;
        int SalarioMenor = 0;
        String nombre="";
        String cargo="";
        int horas =0;
        int costo =0;
        String texto=" ";
        
        for(int i=0;i<empleados.length;i++){
            
            nombre = JOptionPane.showInputDialog(null,"Digite el nombre de #"+i+": ");
            cargo = JOptionPane.showInputDialog(null,"Digite el cargo de #"+i+": ");
            horas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de horas de #"+i+": "));
            costo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el costo de #"+i+": "));
            
            empleados[i] = new Trabajador(nombre,cargo,horas,costo);
            texto += "\n"+empleados[i].toString()+", Salario: "+empleados[i].Salario();
            //Salario Mayor
            if(empleados[i].Salario()>SalarioMayor){
                SalarioMayor = empleados[i].Salario();
            }
            
            //Salario Menor
            if(empleados[i].Salario() < 1e10){
                SalarioMenor = empleados[i].Salario();
            }
        }
        
        JOptionPane.showMessageDialog(null,texto+
                "\nSalario Mayor: "+SalarioMayor+
                "\nSalario menor: "+SalarioMenor);
        
    }
}
