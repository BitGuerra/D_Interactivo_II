/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_8_Taller_Clase;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Taller_Clase_PUNTO_5B {
        public static void main(String[]args){
        
        int opcion = 0;
        //Parametros rectangulo ytriangulo
        double altura = 0;
        double base = 0;
        //Parametros circulo
        double radio=0;
        //area
        double Area=0;
        
        while(opcion != 4){
            
            String letrero="Que area desea calcular?:\n"
                + "1. Rectangulo\n"
                + "2. Triangulo\n"
                + "3. Circulo\n"
                + "4. Salir";
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,letrero));
        
            if(opcion==1){
            
                base = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la medida de la base"));
                altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la medida de la altura"));
                Area = AreaRectangulo(base,altura);
                letrero = "El area del rectangulos es: "+Area;
                JOptionPane.showMessageDialog(null, letrero);
            
            }else if(opcion==2){
            
                base = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la medida de la base"));
                altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la medida de la altura"));
                Area = AreaTriangulo(base,altura);
                letrero = "El area del triangulo es: "+Area;
                JOptionPane.showMessageDialog(null, letrero);
            
            }else if(opcion==3){
            
                radio = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la medida del radio"));
                Area = AreaCirculo(radio);
                letrero = "El area del triangulo es: "+Area;
                JOptionPane.showMessageDialog(null, letrero);
        }
        }
        

    }
    //Funcion para clacula el area del rectangulo
    public static double AreaRectangulo(double medidaBase,double medidaAltura){
        double area = medidaBase*medidaAltura;
        return area;
    }
    //Funcion para clacula el area del triangulo
    public static double AreaTriangulo(double medidaBase,double medidaAltura){
        double area = medidaBase*medidaAltura/2;
        return area;
    }   
    //Funcion para clacula el area del circulo
    public static double AreaCirculo(double radio){
        double area = radio*radio*3.1416;
        return area;
    }
    
}
