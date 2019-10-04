/*
Use este ejemplo para entender como validar entradas para un arreglo, primero lea 
con cuidado este ejercicio luego diríjase al repositorio en:
Semana_9/ Semana_9_Preparcial_II/Repaso_9_PUNTO_3
diseñe un algoritmo para un almacén que registre la ganancia obtenida en cada día de 
la semana, el algoritmo debe imprimir las ganancias registradas indicando el día y la 
ganancia total, que corresponde a la suma se las ganancias de la semana, Nota: debe 
validar las entradas.

 */
package Semana_9_Preparcial_II;
import javax.swing.JOptionPane;

public class Repaso_9_PUNTO_3 {
    public static void main(String[]args){
        
        int[] ganancia = new int[7];
        int total = 0;
        //Arreglo con contenido
        String[] dias ={"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        
        String letrero="Las ganacias de cada dia son: \n";
        int bandera = 1;
        
        for(int i=0;i<7;i++){
            //La validacion se hace dentro del ciclo FOR
            do{
                try{
                    ganancia[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la ganacia del dia "+dias[i]));
                    bandera = 0;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Dato invalido");
                }
            }while(bandera==1);
            //La bandera debe resetearse a 1 para el siguiente ciclo
            bandera=1;
            
            letrero  += dias[i]+": "+ganancia[i]+"\n";
            total += ganancia[i]; 
        }
        
        letrero += "\nLa ganacia semanal es: "+total;
        JOptionPane.showMessageDialog(null,letrero);
    }
}
