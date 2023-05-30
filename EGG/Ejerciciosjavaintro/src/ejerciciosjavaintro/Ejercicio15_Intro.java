/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintro;

/**
 *
 * @author santi
 */
public class Ejercicio15_Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] num1 = new int [100];
        int i;
        for(i = 0; i<100; i++){
        num1[i] = (int) (Math.random()* 101);
        }
        
        System.out.println("Loading....");
        System.out.println("Los números son: ");
        for(i=99; i>=0; i--){
        
            System.out.println("Número " + (i + 1) + ": " + num1[i]);
           
            //System.out.println(num1[i]);
        }
    }
    
}
