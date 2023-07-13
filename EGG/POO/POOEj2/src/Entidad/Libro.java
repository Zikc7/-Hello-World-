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
public class Libro {
    private String titulo;
    private String autor;
    private int isbn;
    private int numpag;

    public Libro() {
    }

    public Libro(String titulo, String autor, int isbn, int numpag) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numpag = numpag;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getNumpag() {
        return numpag;
    }

    @Override
    public String toString() {
        return "Los atributos del libro son: " + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", numpag=" + numpag;
    }
    
    
    
      
    
    
    
    
    
    
    
}
