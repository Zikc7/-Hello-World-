/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceCB;

import Entidad.CuentaB;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class ServiceCB {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    double saldo;

    public CuentaB CrearCuenta() {

        System.out.println("Bienvenido");
        System.out.println("Ingrese los datos para ingresar a su cuenta");
        System.out.println("---------------------------");

        System.out.println("Número de cuenta: ");
        int num1 = leer.nextInt();
        System.out.println("---------------------------");

        System.out.println("DNI: ");
        long num2 = leer.nextInt();
        System.out.println("---------------------------");

        saldo = 100;
        System.out.println("");

        return new CuentaB(num1, num2, saldo);
    }

    public double ingresarMonto() {

        System.out.println("De cuanto es el monto que desea ingresar: ");
        double montoI = leer.nextDouble();

        saldo = (double) (saldo + montoI);

        System.out.println("Su saldo es de: " + saldo);

        return saldo;
    }

    public double retirarMonto() {
        System.out.println("De cuanto es el monto que desea retirar: ");
        double montoR = leer.nextDouble();

        if (montoR > saldo) {
            saldo = 0;
        } else {
            saldo = (double) (saldo - montoR);
        }

        System.out.println("Su saldo es de: " + saldo);

        return saldo;
    }

    public double extracfast() {

        System.out.println("Que porcentaje de su saldo desea retirar");
        int porcentaje = leer.nextInt();

        if (porcentaje <= 20) {
            saldo = saldo - (porcentaje * 100 /  saldo);
        } else {
            System.out.println("El porcentaje que desea retirar es superior a lo permitido");
            System.out.println("Recuerde que es el 20 porciento");
        }

        return saldo;
    }

}
