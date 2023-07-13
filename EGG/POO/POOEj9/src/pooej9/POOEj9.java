/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej9;

import Entidad.Cadena;
import Service.ServiceCA;

/**
 *
 * @author santi
 */
public class POOEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        ServiceCA s1  = new ServiceCA();
        Cadena c1     = s1.CrearCadena();
        s1.MostrarVocales();
        s1.InvertirPalabra();
        s1.ContabilizarV();
        s1.CompararLong();
        s1.unirFrases();
        s1.reemplazar();
        s1.Contiene();
        System.out.println(c1.toString());
        
        
    }
    
}
