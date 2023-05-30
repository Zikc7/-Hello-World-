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
public class Ejercicio16_intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer  = new Scanner(System.in);
        int n; int num;int i;
        int j = 0;
        System.out.println(" Bienvenido");
        System.out.print(" Ingrese el tamaño del vector:      ");
        n = leer.nextInt();
        leer.nextLine();
        
        int [] vec = new int [n];
        
        for(i = 0; i < n; i++){
            
            vec [i] = (int) (Math.random() * n + 1);
            
        }
        
        System.out.println(" ¿Que número desea buscar?");
        
        num = leer.nextInt();
        
        for(i = 0; i < n; i++){
            
            if (num == vec[i]){
                
                
                System.out.println(" El " + num + " Se encuentra en el indice " + i);
                j++;
            }   
        }
            if( j != 0){
            System.out.println(" El " + num + " Se repite " + j + " veces" );
            } else {
                System.out.println(" El número que solicita no se encuentra");
            }
        
    }
    
}
