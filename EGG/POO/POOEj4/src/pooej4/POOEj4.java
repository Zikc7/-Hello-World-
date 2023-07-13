/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4;

import Entidad.Operacion;

/**
 *
 * @author santi
 */
public class POOEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion o1 = new Operacion();
        
        o1.Crearoperacion();
        o1.Sumar();
        o1.Restar();
        o1.Div();
        o1.Multi();
        
        
    }
    
}
