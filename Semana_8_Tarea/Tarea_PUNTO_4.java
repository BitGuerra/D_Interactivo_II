/*
Diseñe un algoritmo realizar una conversión de unidades de temperatura; grados 
Celsius, Kelvin, Fahrenheit, haga uso de un menú:
Seleccione la conversión:

	1. Celsius a Kelvin
	2. Kelvin a Celsius
	3. Celsius a Fahrenheit
	4. Fahrenheit a Celsius
	5. Salir

Para realizar la conversión apóyese en las siguientes ecuaciones
Fahrenheit(F) a Celsius(C)
C=(5(F-32))/9	
Celsius(C) a Fahrenheit(F)
F=9C/5+32
Kelvin(K) a Celsius(C)
C=K-273.15	
Celsius(C) a Kelvin(K)
K=C+273.15

Por ejemplo, si el usuario selecciona “Fahrenheit a Celsius” el código de preguntar 
por una medida en Fahrenheit e imprimir el resultado de la conversión a Celsius, 
luego retorna nuevamente al menú principal. Diseñe una función para cada un de las 
conversiones, por ejemplo, la función FaharenHaitAcelcuis tiene como entrada 
Fahrenheit y retorna Celsius.
 */
package Semana_8_Tarea;
import javax.swing.JOptionPane;

public class Tarea_PUNTO_4 {
    public static void main(String[]args){
        
        int opcion=0;
        double medida,res;
        String menu ="Digie la conversion a realizar:\n"
                + "\n1. Celsius a Kelvin"
                + "\n2. Kelvin a Celsius"
                + "\n3. Celsius a Fahrenheit"
                + "\n4. Fahrenheit a Celsius"
                + "\n5. Salir\n";
        
        while(opcion != 5){
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,menu));
            
            switch(opcion){
                
                case 1:
                    //Celsius a Kelvin
                    medida = Double.parseDouble(JOptionPane.showInputDialog(null,"Digete la Medida en Celsius para convertir a Kelvin"));
                    res = Celsius2Kelvin(medida);
                    JOptionPane.showMessageDialog(null,medida+" °C equivalen a "+res+" Kelvin");
                    break;
                    
                case 2:
                    //Kelvin a Celsius
                    medida = Double.parseDouble(JOptionPane.showInputDialog(null,"Digete la Medida en Kelvin para convertir a Celsius"));
                    res = Kelvin2Celsius(medida);
                    JOptionPane.showMessageDialog(null,medida+" Kelvin equivalen a "+res+"°C");
                    break;
                    
                case 3:
                    //Celsius a Fahrenheit
                    medida = Double.parseDouble(JOptionPane.showInputDialog(null,"Digete la Medida en Celsius para convertir a Fahrenheit"));
                    res = Celsius2Fahrenheit(medida);
                    JOptionPane.showMessageDialog(null,medida+"°C equivalen a "+res+" Fahrenheit");
                    break;
                    
                case 4:
                    //Fahrenheit a Celsius
                    medida = Double.parseDouble(JOptionPane.showInputDialog(null,"Digete la Medida en Fahrenheit para convertir a Celsius"));
                    res = Fahrenheit2Celsius(medida);
                    JOptionPane.showMessageDialog(null,medida+" Fahrenheit equivalen a "+res+" Celsius");
                    break;
            }
        }
    }
    
    public static double Celsius2Kelvin(double celsius){
        double kelvin = celsius + 273.15;
        return kelvin;
    }
    
    public static double Kelvin2Celsius(double kelvin){
        double Celsius = kelvin - 273.15;
        return Celsius;
    }
    
    public static double Celsius2Fahrenheit(double celsius){
        double Fahrenheit = (9*celsius/5)+32;
        return Fahrenheit;
    }
    
    public static double Fahrenheit2Celsius(double fahrenheit){
        double Celsius = 5*(fahrenheit-32)/9;
        return Celsius;
    }
}
