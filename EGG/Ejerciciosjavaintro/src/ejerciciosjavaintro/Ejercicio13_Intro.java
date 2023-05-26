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
public class Ejercicio13_Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese la cantidad de elementos por lado");
        int num = leer.nextInt();
        leer.nextLine();
        String ele = "*";
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
              if( j == num -1 || i==0 || i == num -1 || j==0){
                 System.out.print(ele + " ");
              } else{
                 System.out.print("  ");
              }
            }
            System.out.println("");
        }
        
    }
    
}
