/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej14;

import Entidad.Curso;
import Service.ServiceC;

/**
 *
 * @author santi
 */
public class POOEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiceC s1 = new ServiceC();
        Curso c1 = s1.crearCurso();
        System.out.println("La ganancia es de: " + s1.calcularGanancia());
        System.out.println(c1.toString());
    }
    
}
