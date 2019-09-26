/*
Diseñe un algoritmo que permita calcular el área tres figuras geométricas,
un círculo, triangulo y un rectángulo, mediante un menú:

Seleccione la figura:
1. Reactangulo
2. Circulo
3. Triangulo
4. Salir

El usuario tras seleccionar la figura, el código deberá preguntar los parámetros 
necesarios para calcular el área de dicha figura, por ejemplo, si se escogió 1 
(Rectángulo), el código debe leer la medida de la base y altura.  Cada área se debe 
calcular empleando una función.
 */
package Semana_8_Taller_Clase;
import javax.swing.JOptionPane;
        
public class Taller_Clase_PUNTO_5 {
    public static void main(String[]args){
        
        int opcion = 0;
        //Parametros rectangulo ytriangulo
        double altura = 0;
        double base = 0;
        //Parametros circulo
        double radio=0;
        //area
        double Area=0;
        
        String letrero="Que area desea calcular?:\n"
                + "1. Rectangulo\n"
                + "2. Triangulo\n"
                + "3. Circulo";
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,letrero));
        
        if(opcion==1){
            
            base = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la medida de la base"));
            altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la medida de la altura"));
            Area = AreaRectangulo(base,altura);
            letrero = "El area del rectangulos es: "+Area;
            
        }else if(opcion==2){
            
            base = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la medida de la base"));
            altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la medida de la altura"));
            Area = AreaTriangulo(base,altura);
            letrero = "El area del triangulo es: "+Area;
            
        }else if(opcion==3){
            
            radio = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la medida del radio"));
            Area = AreaCirculo(radio);
            letrero = "El area del triangulo es: "+Area;
            
        }
        
        JOptionPane.showMessageDialog(null, letrero);
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
