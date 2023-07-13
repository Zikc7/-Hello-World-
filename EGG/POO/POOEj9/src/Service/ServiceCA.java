/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class ServiceCA {

    String nuevaFrase;
    String frase;
    int lenght;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena CrearCadena() {

        System.out.println("Ingrese una o mas frases, separadas por un espacio: ");
        frase = leer.next();
        lenght = frase.length();
        return new Cadena(frase, lenght);
    }

    public void MostrarVocales() {
        int cantV = 0;

        for (int i = 0; i < lenght; i++) {
            char vocal = Character.toLowerCase(frase.charAt(i));

            switch (vocal) {

                case 'a':

                case 'e':

                case 'i':

                case 'o':

                case 'u':
                    cantV++;
                    break;

            }

        }
        System.out.println("La cantidad de vocales es: " + cantV);

    }

    public void InvertirPalabra() {
        for (int i = lenght - 1; i >= 0; i--) {
            char vocal = Character.toLowerCase(frase.charAt(i));
            System.out.print(vocal);
        }
        System.out.println(" ");
    }

    public void ContabilizarV() {

        System.out.println("Ingrese la letra que quiere contabilizar");
        char letra = leer.next().toLowerCase().charAt(0);
        int cantV = 0;

        for (int i = 0; i < lenght; i++) {
            char comp = Character.toLowerCase(frase.charAt(i));
            if (comp == letra) {
                cantV++;

            }

        }
        System.out.println("La letra " + letra + " aparece " + cantV + " veces.");
    }

    public void CompararLong() {

        System.out.println("Ingrese la nueva frase que desea comparar");
        nuevaFrase = leer.next();

        int comp = lenght - nuevaFrase.length();

        if (comp > 0) {

            System.out.println("La frase ingresada poseé menor longitud que la anterior");
        } else if (comp < 0) {
            System.out.println("La frase ingresada poseé mayor longitud que la anterior");
        } else if (comp == 0) {
            System.out.println("Las frases soniguales");
        }

    }

    public void unirFrases(){
        System.out.println("La unión de las frases es: ");
        System.out.println(frase + nuevaFrase);
    }
    
    public void reemplazar(){
        System.out.println("Con cual letra desea reemplazar todas las letras A: ");
        char letra = leer.next().toLowerCase().charAt(0);
        frase = frase.replace('a', letra);
        
        System.out.println("La frase resultante es: " + frase);
    
    
    }
    
    public void Contiene(){
        System.out.println(" Ingrese la letra para ver si esta o no");
        String letra = leer.next();
        
        boolean comprobante = frase.contains(letra);
 
        System.out.println("la frase contiene la letra " + letra + " " + comprobante);
    }

}
