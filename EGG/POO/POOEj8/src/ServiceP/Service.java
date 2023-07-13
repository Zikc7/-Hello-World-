/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceP;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    double peso;
    double altura;
    String sex;
    boolean verify = false;
    boolean ageVerify = false;
    int age;

    public Persona CrearPersona() {

        System.out.println("Hola bienvenido a la calculadora de IMC");
        System.out.println("Por favor ingrese los siguientes datos del usuario: ");
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("");

        System.out.println("Nombre: ");
        String name = leer.next();

        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("");

        System.out.println("Edad: ");
        age = leer.nextInt();

        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("");

        do {
            //Ver como hacer que segun la letra te lo tome como !"M".equals(sex); era algo asi verificar en cogido aprte.
            System.out.println("Sexo: ");
            sex = leer.next();
            sex = sex.toUpperCase();
            if (sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("H") || sex.equalsIgnoreCase("O")) {
                verify = true;
            } else {
                System.out.println(" Por favor ingrese un sexo determinado");
                System.out.println("'H' hombre, 'M' mujer, 'O' otro");
                verify = false;
            }
        } while (!verify);

        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("");

        System.out.println("Peso: ");
        peso = leer.nextDouble();

        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("");

        System.out.println("Altura: ");
        altura = leer.nextDouble();

        return new Persona(name, age, sex, peso, altura);
    }

    public double CalcularIMC(double altura, double peso) {

        double imc = peso / (altura * altura);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean EsMayorDeEdad(int age) {

        if (age >= 18) {
            System.out.println(" Es mayor  de edad:");
            System.out.println(" ");
            return ageVerify = true;
        } else {
            System.out.println(" Es mayor  de edad:");
            System.out.println(" ");
            return ageVerify = false;
        }

    }

}
