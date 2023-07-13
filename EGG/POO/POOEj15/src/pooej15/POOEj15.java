/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej15;

import Entidad.Movil;

/**
 *
 * @author santi
 */
public class POOEj15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Movil m1 = new Movil();
        
        m1.cargarcel();
        
        System.out.println(m1.toString());
        
    }
    
}
