package Entidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author santi
 */
public class Rectangulo {
    // Definicion de atributos

    private int base;
    private int altura;
    private int perimetro;
    private int superficie;

    /*
    Constructores y getters and setters de los atributos
     */
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    //metodo toString para mostrar resultados
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", perimetro=" + perimetro + ", superficie=" + superficie + '}';
    }

}
