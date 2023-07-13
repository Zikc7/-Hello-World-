/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Operacion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int num1;
    private int num2;
    private int suma;
    private int resta;
    private int mult;
    private int div;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void Crearoperacion() {

        System.out.println("Ingrese los numeros que desea: ");
        num1 = leer.nextInt();
        System.out.println("-------------------------------------------");
        num2 = leer.nextInt();

    }

    public void Sumar() {

        suma = num1 + num2;

        System.out.println("El resultado de la resta es " + suma);
    }

    public void Restar() {

        resta = num1 - num2;

        System.out.println("El resultado de la resta es " + resta);
    }

    public void Multi() {
        mult = 0;
        if (num1 == 0 || num2 == 0) {

            System.out.println("Parece que ocurrio un error, el resultdo es 0");

        } else {
            mult = num1 * num2;
            System.out.println("El resultado de la multiplicación es " + mult);
        }

    }

    public void Div() {

        if (num1 == 0 || num2 == 0) {

            System.out.println("Parece que ocurrio un error, el resultdo es 0");

        } else {
            div = num1 / num2;
            System.out.println("El resultado de la división es " + div);
        }

    }

    @Override
    public String toString() {
        return "Operacion: num1=" + num1 + ", num2=" + num2 + ", suma=" + suma + ", resta=" + resta;
    }

}
