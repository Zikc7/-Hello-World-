/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Movil {

    private String marca;
    private String modelo;
    private int precio;
    private int ram;
    private int alm;
    private int codigo[] = new int[7];
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Movil() {
    }

    public Movil(String marca, String modelo, int precio, int ram, int alm, int codigo[]) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.ram = ram;
        this.alm = alm;
        this.codigo = codigo;
    }

    public int getAlm() {
        return alm;
    }

    public void setAlm(int alm) {
        this.alm = alm;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", ram=" + ram + ", alm=" + alm + ", codigo=" + codigo + ", leer=" + leer + '}';
    }

    public Movil cargarcel() {
        System.out.println("Ingrese el modelo: ");
        modelo = leer.next();
        System.out.println("Ingrese la marca: ");
        marca = leer.next();
        System.out.println("Ingrese el precio: ");
        precio = leer.nextInt();
        System.out.println("Ingrese la ram: ");
        ram = leer.nextInt();
        System.out.println("Ingrese el almacenamiento: ");
        alm = leer.nextInt();
        cargarCodigo();
        return new Movil(marca, modelo, precio, ram, alm,codigo);
    }
    
    public void cargarCodigo(){
    
        System.out.println("Ingrese los números  del codigo: ");
        
        for (int i = 0; i < codigo.length; i++) {
            codigo[i] = leer.nextInt();
            
        }    
    }

}
