/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10;

import Entidad.Matemática;
import java.util.Random;

/**
 *
 * @author santi
 */
public class POOEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matemática m1 = new Matemática();
        Random random = new Random();
        double num1 = random.nextDouble()* 20;
        m1.setNum1(num1);
        double num2 = random.nextDouble()* 20;
        m1.setNum2(num2);
        
        System.out.println(m1.mayor());
        System.out.println(m1.calcPotencia());
        System.out.println(m1.calcRaiz());
        System.out.println(m1.toString());

    }

}
