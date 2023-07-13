/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11;

import static java.lang.Math.random;
import java.util.Arrays;

/**
 *
 * @author santi
 */
public class POOEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double A[] = new double[50];
        double B[] = new double[20];

        for (int i = 0; i < A.length; i++) {

            A[i] = random() * 20;

        }
        Arrays.sort(A);

        System.arraycopy(A, 0, B, 0, 10);

        Arrays.fill(B, 10, 20, 0.5);
        System.out.println("ARREGLO A");
        mostrarArreglo(A);
        System.out.println("ARREGLO B");
        mostrarArreglo(B);
    }

    public static void mostrarArreglo(double[] arreglo) {
        for (double valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

}
