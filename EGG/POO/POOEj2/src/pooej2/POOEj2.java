/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2;

import Entidad.Libro;
import LibroService.Service;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class POOEj2 {

    /**
     * @param args the command line arguments
     */
    
    // El ejercicio esta resuelto con un service, la parte comentada del main seria sin el service.
    public static void main(String[] args) {
        //Libro b1 = new Libro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Service sm = new Service();
        System.out.println(" Bienvenido al almacenador de libros");
        System.out.println(" Cargue los siguientes datos");
        Libro b1 = sm.CrearLibro();

        /*
        System.out.println(" ISBN : "); 
        b1.setIsbn(leer.nextInt());
        
        System.out.println(" Título: " );
        b1.setTitulo(leer.next());
        
        System.out.println(" Autor: " );
        b1.setAutor(leer.next());
        
        System.out.println(" Número de páginas: " );
        b1.setNumpag(leer.nextInt());

         */
        System.out.println("Los datos cargado son: " + b1.toString());

    }

}
