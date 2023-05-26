/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintro;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Ejercicio14_Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int [] cambio = new int [3];
     
        
        System.out.println(" Introduzca la cantidad de euros que quiere cambiar");
        int num = leer.nextInt();
        leer.nextLine();

       change(cambio , num);
       
   }
   
    
    
   public static void change (int [] cambio ,int num){

              cambio[0] = (int) (num * 0.86);
              System.out.println(" El tipo de cambio a libras es " + cambio[0]);
          

              cambio[1] = (int) (num * 1.28611);
              System.out.println(" El tipo de cambio a yenes es " + cambio[1]);
      

              cambio[2] = (int) (num * 129.852);
              System.out.println(" El tipo de cambio a dolares es " + cambio[2]);
   }

       
   }
   


