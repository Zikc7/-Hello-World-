/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej7;

import Entidad.Cafetera;
import Service.ServiceCafe;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class POOEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al administrador de cafetera");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServiceCafe s1 = new ServiceCafe();
        Cafetera c1 = s1.CrearcaFetera();

        int opcion;

        do {
            System.out.println("Que operación desea realizar, presione el número de operación");
            System.out.println("1: llenar  Cafetera");
            System.out.println("2: Servir Taza");
            System.out.println("3: Vaciar Cafetera");
            System.out.println("4: Agregar Cafe");
            System.out.println("5: Salir");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    c1.setCantidadAct(s1.Igualar());
                    System.out.println("---------------------------");
                    break;
                case 2:
                    c1.setCantidadAct(s1.ServirTaza());
                    System.out.println("---------------------------");
                    break;
                case 3:
                    c1.setCantidadAct(s1.Vaciar());
                    System.out.println("---------------------------");
                    break;
                case 4:
                    c1.setCantidadAct(s1.AgregarCafe());
                    System.out.println("---------------------------");
                    break;
                case 5:
                    System.out.println("Tenga un buen dia");
                    break;
                default:
                    System.out.println("Seleccione una operacion disponible por favor");
                    break;
            }

        } while (opcion != 5);

    }

}
