/*
Diseñe una calculadora para realizar las operaciones básicas con dos números; suma, 
resta, multiplicación y división. Use para ello un menú:

Seleccione la operación:
1.	Suma
2.	Resta
3.	Multiplicación
4.	División
5.	Salir

Por ejemplo, si el usuario ingresa 4, una división, debe preguntar por el numerador y 
el denominador de la división e imprimir el resultado de la operación, luego debe 
retornar al menú principal. En caso de digitar 5 el algoritmo debe terminar. Use una 
función para calcular cada operación suma, resta, multiplicación y división.

 */
package Semana_8_Tarea;
import javax.swing.JOptionPane;

public class Tarea_PUNTO_3 {
    public static void main(String[]args){
        
        double numA,numB,res;
        int opcion=0;
        String letrero="Digite la operacion a realizar"
                + "\n1.Suma"
                + "\n2.Resta"
                + "\n3.Multiplicación"
                + "\n4.División"
                + "\n5Salir";
        
        while(opcion != 5){
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,letrero));
            
            switch (opcion){
                
                case 1:
                    
                    numA = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el primer numero"));
                    numB = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el segundo numero"));
                    res = Suma(numA,numB);
                    JOptionPane.showMessageDialog(null,"El resultado es: "+res);
                    break;
                    
                case 2:
                    
                    numA = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el primer numero"));
                    numB = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el segundo numero"));
                    res = Resta(numA,numB);
                    JOptionPane.showMessageDialog(null,"El resultado es: "+res);
                    break;
                    
                case 3:
                    
                    numA = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el primer numero"));
                    numB = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el segundo numero"));
                    res = Mult(numA,numB);
                    JOptionPane.showMessageDialog(null,"El resultado es: "+res);
                    break;
                    
                case 4:
                    
                    numA = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numerador"));
                    numB = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el denominador"));
                    res = Divide(numA,numB);
                    JOptionPane.showMessageDialog(null,"El resultado es: "+res);
                    break;
            }
        }
    }
    
    public static double Suma(double numeroA,double numeroB){
        double resultado = numeroA + numeroB;
        return(resultado);
    }
    
    public static double Resta(double numeroA,double numeroB){
        double resultado = numeroA - numeroB;
        return(resultado);
    }
    
    public static double Mult(double numeroA,double numeroB){
        double resultado = numeroA * numeroB;
        return(resultado);
    }
    
    public static double Divide(double numerador,double denominador){
        double resultado = numerador/denominador;
        return(resultado);
    }
}
