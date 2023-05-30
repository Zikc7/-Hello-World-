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
public class Ejercicio18_intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matriz = new int [4][4];
        //asigno valores
        for(int f= 0; f<4; f++ ){
            for(int c = 0; c<4; c++){
            
            matriz[f][c] = (int) (Math.random()*20);
            
            }
        }
        matrizd(matriz);
    }
    
    
    
    public static void matrizd (int[][] matriz){
    
    
    for(int f= 0; f<4; f++ ){
        
        for(int c = 0; c<4; c++){
          
            System.out.print(matriz[f][c]);
              System.out.print(" ");

        
        
        }
        System.out.println("");
    }
                     //Transpuesta
        System.out.println("la matriz al reves seeria: ");
    
        for(int c= 0; c<4; c++ ){
        
        for(int f = 0; f<4; f++){
          
            System.out.print(matriz[f][c]);
              System.out.print(" ");

        
        
        }
        System.out.println("");
    }
    
    
    
    
    }
}
