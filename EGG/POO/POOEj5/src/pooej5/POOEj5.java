/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5;

import Entidad.Rectangulo;
import RectanguloService.Service;

/**
 *
 * @author santi
 */
public class POOEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Se instancia e importa la clase Servicio
        para despues crear a travez de esta
        la clase Rectangulo
        */
        Service b1 = new Service();
        Rectangulo  r1 = b1.CrearRec();
        
        //Se settea el atributo perimetro a travez de la funcion, en la clase Servicio
        r1.setPerimetro(b1.CrearPer());
        
        //Se settea el atributo superficie a travez de la funcion, en la clase Servicio
        r1.setSuperficie(b1.CrearSurp());
    
        System.out.println("  ");
        
        //Se llama a la funcion void DibujarAs a travez de la clase Servicio
        b1.DibujarAs();
        
        //Se imprime todos los valores de los atributos mediante el metodo toString en la clase Rectangulo
        System.out.println(r1.toString());
        
        
        
    }
    
}
