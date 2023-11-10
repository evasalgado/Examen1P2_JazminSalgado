/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_jazminsalgado;

/**
 *
 * @author evaja
 */
public class tipo extends libro{
    private String genero;
    private String Tipo;

    public tipo() {
        super();
    }

    public tipo(String genero, String Tipo, String titulo, String autor, double precio, String edicion) {
        super(titulo, autor, precio, edicion);
        this.genero = genero;
        this.Tipo = Tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return super.toString()+ "genero=" + genero + ", Tipo=" + Tipo + '}';
    }

    

    
    
}
