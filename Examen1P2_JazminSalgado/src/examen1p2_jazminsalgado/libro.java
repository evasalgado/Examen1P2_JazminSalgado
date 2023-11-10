/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_jazminsalgado;

/**
 *
 * @author evaja
 */
public class libro {
    protected String titulo;
    protected String autor;
    protected double precio;
    protected String edicion;

    public libro() {
    }

    public libro(String titulo, String autor, double precio, String edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.edicion = edicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + "\nautor=" + autor + "\nprecio=" + precio + "\nedicion=" + edicion ;
    }
    
    
}
