/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class ServiceCafe {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int cap;
    int cantAc;

    public Cafetera CrearcaFetera() {

        System.out.println("Cual es la capacidad de la cafetera");
        cap = leer.nextInt();
        System.out.println("-------------------------------------------");
        System.out.println("Cual es la catidad actual de la cafetera");
        cantAc = leer.nextInt();

        return new Cafetera(cap, cantAc);
    }

    public int Igualar() {

        cantAc = cap;

        return cantAc;

    }

    public int ServirTaza() {

        System.out.println("¿De cuanto es la capacidad de la taza?");
        int taza = leer.nextInt();

        taza = taza - cantAc;

        if (taza < 0) {
            System.out.println("Se lleno la taza");
            System.out.println("Sobra una capacidad de: " + taza * (-1));
            cantAc = taza;
        } else if (taza == 0) {
            System.out.println("Se lleno la taza");
            System.out.println("No hay más capacidad");
            cantAc = taza;
        } else if (taza >= 0) {
            System.out.println("No se lleno la taza, falta llenar un: " + taza + " de su capacidad");
            cantAc = taza;
        } 
        return cantAc;
    }

    public int Vaciar() {

        return cantAc = 0;
    }

    public int AgregarCafe() {

        System.out.println("¿Cuanto café va a agregar?");
        int agrega = leer.nextInt();

        return cantAc = agrega + cantAc;
    }
}
