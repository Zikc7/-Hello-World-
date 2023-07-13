/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private Date fechaNacimiento;

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona crearPersona() {
        int dia, mes, anio;
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cual es su nombre?");
        nombre = leer.next();
        System.out.println("Cual es su fecha de nacimiento en formato dd/mm/yy");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();
        fechaNacimiento = new Date(anio - 1900, mes - 1, dia);

        return new Persona(nombre, fechaNacimiento);
    }

    public int Edad() {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();

        return edad;

    }

    public String menorque() {
        System.out.println("Cual es la edaad con la que desea comparar: ");

        int edadNew = leer.nextInt();
        
        int comp = Math.min(edadNew, Edad());
        if (comp == Edad())
            return "true";
        else{
        
        return "false";
        }

    }

    
    public String mostrarPersona() {
        return "Persona{" +  "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
}
