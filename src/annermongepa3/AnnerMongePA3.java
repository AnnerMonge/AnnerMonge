/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package annermongepa3;
import java.util.Scanner;

/**
 *
 * @author COMPHP
 */
public class AnnerMongePA3 {
 
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
   Scanner entrada=new Scanner (System.in);
 int i;
 double montodespositar;
 double totalcuenta=0;//acumalador
 
     for (i=1; i<=12; i++){
     System.out.println("Introduzca el monto a despositar del mes"+i);
     montodespositar=entrada.nextDouble();
     totalcuenta=totalcuenta+montodespositar;
    System.out.println("monto ahorrado"+totalcuenta); 
    }
   
    }
    
}