package ejerciciosjavaintro;

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
public class Ejercicio12_Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =  new Scanner(System.in);
        String mensaje; int cont1 = 0; int cont2 = 0;String exit = "O";
        
        
        do{
            System.out.println(" Ingrese la frase");
            mensaje = leer.nextLine();
            if (mensaje.startsWith("X") && mensaje.endsWith("O") && mensaje.length() <= 5){
                System.out.println("Bienvenido");
                System.out.println("Comenzando el analisis......");
                System.out.println("==========================================================");
                System.out.println("Secuencia FDE aceptada");
                cont1++;
            } else {
                 System.out.println("Secuencia FDE incorrecta");
                 System.out.println("===========================================================");
                 System.out.println("Recuerde que el mensaje tiene que empezar con X y terminar con O ");
                 System.out.println("Además de tener 5 caracteres de largo, contando espacios.");
                 cont2++;
                }
                 System.out.println("¿Desea salir?");
                 System.out.println("S/N");
                 exit = leer.nextLine();
        } while(!"S".equalsIgnoreCase(exit));
       
        
        System.out.println("Se realizaron " + cont1 + " análisis aceptados.");
        System.out.println("Se realizaron " + cont2 + " análisis incorrectos.");
       
    }
    
}
