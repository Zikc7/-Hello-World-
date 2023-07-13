/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3;

import CircunferenciaService.ServiceC;
import Entidad.Circunferencia;

/**
 *
 * @author santi
 */
public class POOEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ServiceC cr = new ServiceC();
        ServiceC cr3 = new ServiceC();

        System.out.println(" Bienvenido al creador de circunferencias");

        Circunferencia c2 = cr3.CrearCircunferencia();
        Circunferencia c1 = cr.CrearCircunferencia();
        System.out.println(c1.toString());
        System.out.println(cr3.toString());
    }

}
