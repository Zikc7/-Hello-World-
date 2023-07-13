/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author santi
 */
public class Matemática {

    private double num1;
    private double num2;

    public Matemática() {
    }

    public Matemática(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Matem\u00e1tica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

    public double mayor() {

        return Math.max(num1, num2);
    }

    public int calcPotencia() {
        num1 = Math.round(num1);
        num2 = Math.round(num2);

        int base = (int) Math.max(num1, num2);
        int exponente = (int) Math.min(num1, num2);
        return (int) Math.pow(base, exponente);
    }

    public double calcRaiz() {
        double exponente = Math.min(num1, num2);
        exponente = Math.abs(exponente);

        return Math.sqrt(exponente);
    }

}
