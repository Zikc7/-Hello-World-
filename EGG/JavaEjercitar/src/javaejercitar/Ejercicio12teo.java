/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercitar;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Ejercicio12teo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int num1; int num2;
         Scanner leer = new Scanner(System.in);
         
         System.out.println(" Ingrese el número para saber si es multiplo del número 2");
         num1 = leer.nextInt();
         System.out.println(" Ingrese el número");
         num2 = leer.nextInt();
              
        Esmultiplo(num1,num2);
    }
    
    public static void Esmultiplo (int num1, int num2){

       int resultado;
       
       resultado = num1 % num2;
       
       if (resultado == 0 ){
       
       
           System.out.println(" El primer número es multiplo del segundo");
       }
       else{
                   
           System.out.println(" El primer número no es multiplo del segundo");
                   }
       
       

}
    
}
