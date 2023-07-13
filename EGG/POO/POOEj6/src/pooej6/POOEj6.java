/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej6;

import Entidad.CuentaB;
import ServiceCB.ServiceCB;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class POOEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiceCB s1 = new ServiceCB();
        CuentaB c1 = s1.CrearCuenta();
        int opcion;
        boolean salir = true;
        
        do {
            System.out.println("Que operación desea realizar, presione el número de operación");
            System.out.println("1: Ingresar monto");
            System.out.println("2: Retirar monto");
            System.out.println("3: Extración rapida");
            System.out.println("4: Consultar Saldo");
            System.out.println("5: Consultar datos");
            System.out.println("6: Salir");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    c1.setSaldoAc(s1.ingresarMonto());
                    System.out.println("---------------------------");
                    System.out.println(" ");
                    break;
                case 2:
                    c1.setSaldoAc(s1.retirarMonto());
                    System.out.println("---------------------------");
                    System.out.println(" ");
                    break;
                case 3:
                    //Falta retocar el porcentaje
                    c1.setSaldoAc(s1.extracfast());
                    System.out.println("---------------------------");
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Su saldo es: " + c1.getSaldoAc());
                    System.out.println("---------------------------");
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("Sus datos son:  " + c1.toString());
                    System.out.println("---------------------------");
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println("Tenga un buen dia");
                    salir = false;
                    break;
                default:
                    System.out.println("Seleccione una operacion disponible por favor");
                    break;
            }
        } while (salir);
        
    }

}
