/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12;

import java.util.Date;

/**
 *
 * @author santi
 */
public class POOEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia,mes,anio;
        dia = 05;
        mes = 03;
        anio = 2005;
        
        Date fecha = new Date(anio -1900,mes -1 ,dia);
        Date fechaActual = new Date();
        System.out.println(fecha);
        System.out.println(fechaActual);
        int anios =   fechaActual.getYear() - fecha.getYear();
        System.out.println("La diferencia de años es " + anios);
        
    }
    
}
