/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej8;

import Entidad.Persona;
import ServiceP.Service;

/**
 *
 * @author santi
 */
public class POOEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de varibles
        int porDebajoPeso = 0;
        int enPeso = 0;
        int porArribaPeso = 0;
        int mayor = 0;
        int menor = 0;
        Service s1 = new Service();

        //Señalizaacion al usurio de como analizar los datos
        System.out.println("Recuerde que si el valor es 1 esta por debajo de su peso ideal");
        System.out.println("Si el valor es 0 esta en su peso ideal");
        System.out.println("Si el valor es -1 esta por arriba de su peso ideal");
        System.out.println("Aparecera false si es menor de edad y true si es mayor de edad");
        System.out.println(" ");
        
        //Persona 1
        Persona p1 = s1.CrearPersona();
        System.out.println(s1.CalcularIMC(p1.getAltura(), p1.getPeso()));
        System.out.println(s1.EsMayorDeEdad(p1.getAge()));
        
        //Sumar persona en peso  y edad
        if (s1.CalcularIMC(p1.getAltura(), p1.getPeso()) == 1) {
            porDebajoPeso++;
        } else if (s1.CalcularIMC(p1.getAltura(), p1.getPeso()) == 0) {
            enPeso++;
        } else if (s1.CalcularIMC(p1.getAltura(), p1.getPeso()) == -1) {
            porArribaPeso++;
        }
        if (s1.EsMayorDeEdad(p1.getAge()) == true) {
            mayor++;
        } else {
            menor++;
        }
        
        //Persona 2
        Persona p2 = s1.CrearPersona();
        System.out.println(s1.CalcularIMC(p2.getAltura(), p2.getPeso()));
        System.out.println(s1.EsMayorDeEdad(p2.getAge()));
        
        //Sumar persona en peso  y edad;
        if (s1.CalcularIMC(p2.getAltura(), p2.getPeso()) == 1) {
            porDebajoPeso++;
        } else if (s1.CalcularIMC(p2.getAltura(), p2.getPeso()) == 0) {
            enPeso++;
        } else if (s1.CalcularIMC(p2.getAltura(), p2.getPeso()) == -1) {
            porArribaPeso++;
        }
        if (s1.EsMayorDeEdad(p2.getAge()) == true) {
            mayor++;
        } else {
            menor++;
        }
        
        //Persona 3
        Persona p3 = s1.CrearPersona();
        System.out.println(s1.CalcularIMC(p3.getAltura(), p3.getPeso()));
        System.out.println(s1.EsMayorDeEdad(p3.getAge()));
        
        //Sumar persona en peso  y edad;;
        if (s1.CalcularIMC(p3.getAltura(), p3.getPeso()) == 1) {
            porDebajoPeso++;
        } else if (s1.CalcularIMC(p3.getAltura(), p3.getPeso()) == 0) {
            enPeso++;
        } else if (s1.CalcularIMC(p3.getAltura(), p3.getPeso()) == -1) {
            porArribaPeso++;
        }
        if (s1.EsMayorDeEdad(p3.getAge()) == true) {
            mayor++;
        } else {
            menor++;
        }
        
        //Persona 4
        Persona p4 = s1.CrearPersona();
        System.out.println(s1.CalcularIMC(p4.getAltura(), p4.getPeso()));
        System.out.println(s1.EsMayorDeEdad(p4.getAge()));
        
        //Sumar persona en peso  y edad;
        if (s1.CalcularIMC(p4.getAltura(), p4.getPeso()) == 1) {
            porDebajoPeso++;
        } else if (s1.CalcularIMC(p4.getAltura(), p4.getPeso()) == 0) {
            enPeso++;
        } else if (s1.CalcularIMC(p4.getAltura(), p4.getPeso()) == -1) {
            porArribaPeso++;
        }
        if (s1.EsMayorDeEdad(p4.getAge()) == true) {
            mayor++;
        } else {
            menor++;
        }
        
        
        //Declaraacion de las variables que se ocupaan de los porcentajes
        double porcentajeDebajoPeso = (porDebajoPeso / 4.0) * 100;
        double porcentajePesoIdeal = (enPeso / 4.0) * 100;
        double porcentajeEncimaPeso = (porArribaPeso / 4.0) * 100;
        double porcentajeMayoresEdad = (mayor / 4.0) * 100;
        double porcentajeMenoresEdad = (menor / 4.0) * 100;
        
        //resultados  en genereal
        System.out.println("Resultados:");
        System.out.println("Por debajo de peso: " + porDebajoPeso + " personas (" + porcentajeDebajoPeso + "%)");
        System.out.println("En peso ideal: " + enPeso + " personas (" + porcentajePesoIdeal + "%)");
        System.out.println("Por encima de peso: " + porArribaPeso + " personas (" + porcentajeEncimaPeso + "%)");
        System.out.println("Mayores de edad: " + mayor + " personas (" + porcentajeMayoresEdad + "%)");
        System.out.println("Menores de edad: " + menor + " personas (" + porcentajeMenoresEdad + "%)");

    }
    //System.out.println(p1.toString());

}
