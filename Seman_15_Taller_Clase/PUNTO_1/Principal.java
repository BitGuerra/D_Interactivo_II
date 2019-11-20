/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO_1;
import javax.swing.JOptionPane;
/**
Diseñe un aplicativo para una empresa que tenga registrados los siguientes datos de 
sus trabajadores; nombre, cargo, horas mensuales laboradas y valor hora. Los datos 
son:

Nombre	Cargo   	Horas	Costo
Hanna	Secretaria	160	30000
Héctor	Manager 	150     28500
Jesús	Contador	170	25600
Camilo	Gerente         160     35000

El aplicativo debe imprimir la lista de los datos registrados incluyendo el salario 
mensual, la suma de todos los salarios mensuales y suma de las horas laboradas de 
todos los empleados.
 */
public class Principal {
    public static void main(String[]args){
        
        int sumaSalarios = 0;
        int sumaHoras = 0;
        String texto=" ";
        //Crear Arreglo de objetos
       
        Trabajador[] empleados = new Trabajador[4];
        
        empleados[0] = new Trabajador("Hanna","Secretaria",160,30000);
        empleados[1] = new Trabajador("Hector","Manager",150,28500);
        empleados[2] = new Trabajador("Jesus","Contador",170,25600);
        empleados[3] = new Trabajador("Camilo","Gerente",160,35000);
        
        for(int i=0;i<4;i++){
            
            sumaSalarios += empleados[i].Salario();
            sumaHoras += empleados[i].getHorasMensuales();
            
            texto += "\n"+empleados[i].toString()+", Salario: "+empleados[i].Salario();
        }
        
        JOptionPane.showMessageDialog(null,texto+
                "\nSuma de los salarios: "+sumaSalarios+
                "\nSuma horas laboradas: "+sumaHoras);
    }
}
