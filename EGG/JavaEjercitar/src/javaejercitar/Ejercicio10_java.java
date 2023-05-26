package javaejercitar;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santi
 */
public class Ejercicio10_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;int num2;int num3;
        int suma;
        System.out.println(" Ingrese el número limite");
        int limite = leer.nextInt();
        
        do{
            System.out.println(" Ingrese los numeros que desea sumar");
            num = leer.nextInt();
            num2 = leer.nextInt();
            suma = num + num2;
        } while( suma < limite);
        System.out.println(" Felicidades salio del bucle!! el ressultado fue: " + suma);
    }
    
}
