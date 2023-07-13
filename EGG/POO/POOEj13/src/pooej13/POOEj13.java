/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej13;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class POOEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona p1 = new Persona();
        p1.crearPersona();
        System.out.println("La edad es: " + p1.Edad());
        System.out.println(p1.menorque());
        System.out.println(p1.mostrarPersona());
    }


    



}
