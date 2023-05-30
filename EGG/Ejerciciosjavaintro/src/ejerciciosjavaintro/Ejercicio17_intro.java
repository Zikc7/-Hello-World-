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
public class Ejercicio17_intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese el tamañno del vector");
        int n = leer.nextInt();
        
        ads(n);
    }
    
    
    public static void ads ( int n){
    
    int [] vec = new int [n];
    int i; String num; int digit1 = 1; int digit2 = 2; int digit3 = 3; int digit4 = 4; int digit5 = 5;
    int j = 0; int l = 0; int p = 0; int k = 0; int h = 0;
    for(i = 0; i < n; i++){
    
    vec[i] = (int) (Math.random() * n +1);

    }
    
     for(i = 0; i < n; i++){
     
     num = String.valueOf(vec[i]);
     
     if ( digit1 == num.length()){
         j++;
         
     } else if ( digit2 == num.length() ){
         h++;
        
     } else if ( digit3 == num.length()){
         p++;
         
     } else if ( digit4 == num.length()){
         l++;
        
     } else if (digit5 == num.length()){
         k++;
    
     }  
   

    }
     System.out.println("La cantidad de números de un digito son: " + j);
     System.out.println("La cantidad de números de dos digito son: " + h);
     System.out.println("La cantidad de números de tres digito son: " + p);
     System.out.println("La cantidad de números de cuatro digito son: " + l);
     System.out.println("La cantidad de números de cinco digito son: " + k);
    
    
    
    
    }
    
}
