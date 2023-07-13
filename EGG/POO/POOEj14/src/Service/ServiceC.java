package Service;

import Entidad.Curso;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author santi
 */
public class ServiceC {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    String nombreCurso;
    double cantHorasPorDia;
    int cantDiasPorSemana;
    String turno;
    int precioPorHora;
    String alumnos[] = new String[5];

    public void cargarAlumnos() {

        System.out.println("Ingrese los nombres de los alumnos: ");
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = leer.next();
        }

    }

    public Curso crearCurso() {
        System.out.println("Ingrese el nombre: ");
        nombreCurso = leer.next();
        System.out.println("Ingrese la  cantidad de horas por día: ");
        cantHorasPorDia = leer.nextDouble();
        System.out.println("Ingrese la cantidad de horas por semana: ");
        cantDiasPorSemana = leer.nextInt();
        System.out.println("Ingrese el turno");
        turno = leer.next();
        System.out.println("Ingrese el precio por hora: ");
        precioPorHora = leer.nextInt();
        cargarAlumnos();
        return new Curso(nombreCurso, cantHorasPorDia, cantDiasPorSemana, turno, precioPorHora,alumnos);
    }
    
    public double calcularGanancia(){
    
    int ganancia = (int) (cantHorasPorDia * cantDiasPorSemana * 5 * precioPorHora);
    
    
    return ganancia;
    }

}
