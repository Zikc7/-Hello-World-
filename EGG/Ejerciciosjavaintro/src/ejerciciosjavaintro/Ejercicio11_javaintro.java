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
public class Ejercicio11_javaintro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1; int num2; int suma; int resta; int multi; int div; int choice; String elec = " ";
        System.out.println("====================================================================");
        System.out.println(" Ingrese dos numero enteros para ingresar al menu");
        System.out.println("====================================================================");
        num1 = leer.nextInt(); num2 = leer.nextInt();
        leer.nextLine(); //PORQUE TE DEJA UN SSALTO DESPUES DEL LEER INT
        do{
        System.out.println(" Menu");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        System.out.println("5: Salir");
        System.out.print(" Ingrese el número de la operación:      ");
        choice = leer.nextInt();
        leer.nextLine(); 
        switch (choice) {
        
            case 1:
                suma = num1 + num2;
                System.out.println("El resultado fue: " + suma);
                break;
            case 2:
                resta = num1 - num2;
                System.out.println("El resultado fue: " + resta);
                break;
            case 3:
                multi = num1 * num2;
                System.out.println("El resultado fue: " + multi);
                break;
            case 4:
                div = num1 / num2;
                System.out.println("El resultado fue: " + div);
                break;
            case 5:
                 System.out.println("¿Está seguro de que quiere salir?");
                    System.out.println("Ingrese S/N");
                    elec = leer.nextLine();
                    if (elec.equalsIgnoreCase("S")) {
                        System.out.println("=============================");
                        System.out.println("Que tenga un buen día");
                        break;
                       
                    } else if (elec.equalsIgnoreCase("N")){                 
                        System.out.println("Volviendo al menu");
                        break;
                    }      default: 
                           System.out.println("Opción invalida");
                           break;
            }

        }while(!"S".equalsIgnoreCase(elec));

    }
    
}
