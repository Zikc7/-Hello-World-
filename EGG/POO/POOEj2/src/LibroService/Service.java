/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroService;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Service {

    public Libro CrearLibro() {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println(" IBSN: ");
        int isbn =  leer.nextInt();
        
        System.out.println(" Titulo: ");
        String titulo = leer.next();
        
        System.out.println(" Autor: ");
        String autor = leer.next();
        
        System.out.println(" Numero de paginas: ");
        int numpag = leer.nextInt();
        
        return new Libro(titulo, autor, isbn, numpag);
    }
}
