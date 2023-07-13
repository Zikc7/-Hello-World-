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
public class Persona {
    
    private String name;
    private int age;
    private String sex;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String name, int age, String sex, double peso, double altura) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.peso = peso;
        this.altura = altura;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", age=" + age + ", sex=" + sex + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
    
    
    
}
