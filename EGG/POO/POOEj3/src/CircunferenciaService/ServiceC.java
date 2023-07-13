/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircunferenciaService;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class ServiceC {

    int radio;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Circunferencia CrearCircunferencia() {

        System.out.println("¿Cual es el radio de la circunferencia?");
        radio = leer.nextInt();
        int area;

        area = (int) (3.14 * radio * radio);

        int perimetro = (int) (2 * 3.14 * radio);

        return new Circunferencia(radio, area, perimetro);
    }

}
