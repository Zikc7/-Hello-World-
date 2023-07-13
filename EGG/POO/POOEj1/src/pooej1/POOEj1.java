/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class POOEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona(leer.next(), leer.nextInt());

        p1.setNombre(leer.next());
        System.out.println(" ¿Cual es su estado de animo?");
        p1.setState(leer.nextInt());
        System.out.println(p1);
        p1.Estado(5);
        System.out.println(p1);
    }

}
