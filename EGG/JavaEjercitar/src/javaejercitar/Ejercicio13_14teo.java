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
public class Ejercicio13_14teo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] equipos; 
        int cantidad;
        Scanner leer = new Scanner(System.in);
        
        System.out.println(" ¿Cuantos equipo van a participar?");
        cantidad = leer.nextInt();
        
        equipos = new String [cantidad];
        
        System.out.println(" Ingrese los nombres de los equipos");
        
        for(int i = 0; i < cantidad; i++){
            
            equipos[i] = leer.nextLine();
        
        }
        System.out.println(" Los nombres de los equipos registrados son");
                for(int i = 0; i < cantidad; i++){
            
                    System.out.println(equipos[i]);
                    System.out.println("=================");
        
        }
        
        
        
        
        
    }
    
}
