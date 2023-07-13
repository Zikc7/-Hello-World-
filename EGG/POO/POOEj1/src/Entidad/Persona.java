/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author santi
 */
public class Persona  {
    
    private String nombre = "santiago";
    private String apellido;
    private int edad;
    private  int state;

    public Persona() {
     
    }

    public Persona(String apellido, int edad) {
        this.apellido = apellido;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setState(int state) {
        this.state = state;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getState() {
        return state;
    }
    
    
    public int Estado(int suma) {

        if (state <= 5) {
            System.out.println(" Espero que tu día mejore!");

        } else {

            System.out.println(" Me alegro que tengas un buen día");

        }
        state +=  suma;
        
        return suma;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", state=" + state + '}';
    }
    
    
    
    
    
    

    
    
    
}
