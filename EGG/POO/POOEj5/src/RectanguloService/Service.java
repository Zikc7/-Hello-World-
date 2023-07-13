/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RectanguloService;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Service {
    //Se importa el escaner "leer" y se agrega el .useDelimiter("\n") para que no tome mas "entradas"
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //Se definen las variables que van a reemplazar a los atributos de la 1 a la 4, en el orden de los atributos
    int num1;
    int num2;
    int num3;
    int num4;
    
    //Funcion CrearRec que solicita al usuario la base y la altura, cuando este lo ingresa, crea el triangulo
    public Rectangulo CrearRec() {

        System.out.println(" Ingrese el base del Rectangulo");
        num1 = leer.nextInt();
        System.out.println("----------------------------------------------");
        System.out.println(" Ingrese el altura del Rectangulo");
        num2 = leer.nextInt();

        return new Rectangulo(num1, num2);
    }
    
    //Funcion CrearPer una funcion que utiliza los atributos base(num1) y altura(num2) para crear el atributo perimetro(num3)
    public int CrearPer() {

        num3 = (num1 + num2) * 2;

        return num3;
    }
    
    //Funcion CrearSurp una funcion que utiliza los atributos base(num1) y altura(num2) para crear el atributo superficie(num4)
    public int CrearSurp() {

        num4 = num1 * num2;

        return num4;
    }
    
    //Funcion DibujarAs que utiliza la base y la altura para "dibujarlo" con asteriscos a travez de dos "for"
    public void DibujarAs() {

        for (int j = 0; j < (num2 - 1); j++) {
            System.out.println("*");

        }
        for (int i = 0; i < num1; i++) {

            System.out.print("*");
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
