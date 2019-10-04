/*
Diseñe un algoritmo que capture la estatura(metros) y peso (Kg), de un grupo de 
personas determinado por el usuario, luego deberá calcular el IMC (ecuación 1) de 
cada una de las personas, el algoritmo debe imprimir las esturas, pesos, IMC’s de 
cada una de las personas y mostrar cuantas personas se encuentra en cada 
clasificación de acuerdo a la siguiente tabla.

IMC=peso(Kg)/(Altura(m))^2 (ecuacion 1)

Índice de masa corporal (IMC)           Clasificación
Mayor 0 y menor que 18.5                Bajo peso
Mayor o igual que 18 y menor que 25	Normal
Mayor o igual que 25 y menor que 30	Sobrepeso
Mayor o igual que 30                    Obesidad

Por ejemplo, si se registraron 5 personas la salida debe verse de la siguiente manera:

	Altura: 1.70m - Peso: 60 kg - IMC: 20.76
	Altura: 1.55m - Peso: 75kg - IMC: 31.21
	Altura: 1.75m - Peso: 65kg - IMC: 21.22
	Altura: 1.80m - Peso: 59Kg - IMC: 17.28
	Altura: 1.75m - Peso: 55Kg - IMC: 17.95
        Clasificación de las personas registradas:
        Bajo de peso: 0
        Normal: 2
        Sobrepeso: 0
        Obesidad: 1
        Bajo de peso: 2

Note que las alturas y pesos son un ejemplo, estas primero deben ser registradas.	
Nota: Use una función para calcular el IMC.

 */
package Semana_9_Preparcial_II;
import javax.swing.JOptionPane;

public class Repaso_9_PUNTO_2 {
    public static void main(String[]args){
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de personas a registrar"));
        double[] altura = new double[cantidad];
        double[] peso = new double[cantidad];
        double[] imc = new double[cantidad];
        String letrero = "Las alturas, pesos e IMC'2 son: \n";
        int BajoPeso=0,Normal=0,sobrePeso=0,Obesidad=0;
        
        for(int i=0;i<cantidad;i++){
            
            altura[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la altura de la pesona #"+i+":"));
            peso[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el peso de la pesona #"+i+":"));
            imc[i] = calculaIMC(altura[i],peso[i]);
            letrero += i+". Altura: "+altura[i]+"m"+"¨Peso: "+peso[i]+"kg"+" IMC: "+imc[i]+"\n";
            
            if(imc[i] < 18.5){
                BajoPeso += 1;
            }else if(imc[i]>=18 && imc[i]<25){
                Normal += 1;
            }else if(imc[i]>=25 && imc[i]<30){
                sobrePeso += 1;
            }else if(imc[i]>=30){
                Obesidad += 1;
            }
        }
        
        letrero += "\nClasificación de las personas registradas: "
                + "\nBajo de peso: "+BajoPeso
                + "\nNormal: "+Normal
                +"\nSobrepeso: "+sobrePeso
                +"\nObesidad: "+Obesidad;
        
        JOptionPane.showMessageDialog(null,letrero);
    }
    
    public static double calculaIMC(double altura,double peso){
        double imc = peso/(altura*altura);
        return imc;
    }
}
