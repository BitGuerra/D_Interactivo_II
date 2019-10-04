/*
Se requiere un algoritmo para un parqueadero, el cual calcule el precio a pagar por
hora, dicho parqueadero cuenta con tres secciones, la primera se encuentra al aire 
libre, tiene un precio de 6000 pesos- hora, la segunda sección cuenta con cielo raso, 
tiene un costo de 8000 pesos-hora, la tercera sección esta ubicada en un sótano y vale 
13000 pesos-hora. El algoritmo debe capturar la sección y el tiempo e imprimir el 
costo. Use una función para calcular el precio, esta debe tener como entrada el precio 
y la hora.

 */
package Semana_8_Tarea;
import javax.swing.JOptionPane;

public class Tarea_PUNTO_2 {
    public static void main(String[]args){
        
        int seccion = Integer.parseInt(JOptionPane.showInputDialog(null,"Cual es la seccion donde parquera?: 1 - 2 - 3"));
        int tiempo = Integer.parseInt(JOptionPane.showInputDialog(null,"Cual es el tiempo de uso del parqueadero?:"));
        int precio = 0;
        
        if(seccion==1){
            precio = CalculaPrecio(tiempo,6000);
        }else if(seccion==2){
            precio = CalculaPrecio(tiempo,8000);
        }else if(seccion==3){
            precio = CalculaPrecio(tiempo,1300);
        }
        
        JOptionPane.showMessageDialog(null,"El costo es: "+precio);
    }
    
    public static int CalculaPrecio(int time, int price){
        int total = time*price;
        return total;
    } 
}
