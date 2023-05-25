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
public class Ej_1_A_9Pract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                        // EJERCICIO 1
        Scanner leer = new Scanner(System.in);
        int num1; int num2; int suma;
        System.out.println(" Ingrese los numero que deseé sumar");
        num1 = leer.nextInt();
        System.out.println("=========");
        num2 = leer.nextInt();
        
        suma = num1 + num2;
        
        System.out.println(" El resultado de la suma de " + num1 + " y " + num2 + " es: " + suma);
        

                        // EJERCICIO 2 
     
         
        System.out.println(" Ingrese su nombre");
        String frase = leer.nextLine();
        System.out.println("========");
        System.out.println(" El nombre registrado es: " + frase);
        System.out.println("========");

                        // EJERCICIO 3
        System.out.println(" Ingrese la frase que desee convertir a mayusculas y minusculas");
        frase = leer.nextLine();
        
        System.out.println(" En mayusculas " + frase.toUpperCase());
        System.out.println("=====================");
        System.out.println(" En minuscula " + frase.toLowerCase());
     
                        // EJERCICIO 4
        int grados = (int)(Math.random() * 20);
        int convert;
        convert = 32 + (9*grados/5);
        System.out.println(" La conversion a Farenheits es: " + convert);
        
                        // EJERCICIO 5
        int num3;
        
        System.out.println(" Ingrese el numero que quiere ver el doble, triple y raiz");
        num3 = leer.nextInt();
        System.out.println(" La raiz cuadrada es: " + Math.sqrt(num3));
        System.out.println(" El doble del número es: " + num3 * 2);
        System.out.println(" El triple del número es: " + num3 * 3);
         System.out.println(" ");
        System.out.println("=======================================");
        System.out.println(" ");
        
        
                        //CONDICIONALES
                        // EJERCICIO 6
        System.out.println(" Ingrese un numero para saber si es par o impar");
        num1 = leer.nextInt();
        if ( num1 % 2 == 0){
            System.out.println(" El numero es par");
        } else{
        
            System.out.println(" El numero es impar");
        }
                        // EJERCICIO 7
        System.out.println(" ");
        System.out.println(" Ingrese la palabra clave eureka");
        String frases = leer.nextLine();
        if (frases.equals("eureka")){
            System.out.println(" Correcto");
        } else {
            System.out.println(" Incorrecto");
        }
                       //EJERCICIO 8
        System.out.println(" ");
        System.out.println("===========");
        System.out.println(" Ingrese una frase de 8 de largo");
        frases=leer.nextLine();
        
        if(frases.length() == 8){
            System.out.println("Correcto");
        
        } else{
            System.out.println(" Incorrecto");
        }
                        //EJERCICIO 9
        
        System.out.println(" Ingrese una frase que empiece con A");
        frases = leer.nextLine();
        if (frases.startsWith("A")){
            System.out.println(" Correcto");
        } else {
            System.out.println(" Incorrecto");
        }
        
    }
    
    
}
