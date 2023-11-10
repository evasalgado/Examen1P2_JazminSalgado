/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_jazminsalgado;

/**
 *
 * @author evaja
 */
public class libro_ficcion extends libro {

    private String Tipo;

    public libro_ficcion() {
        super();
    }

    public libro_ficcion(String Tipo, String titulo, String autor, double precio, int edicion) {
        super(titulo, autor, precio, edicion);
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        try {
            if (Tipo == "novela" || Tipo == "scifi" || Tipo == "misterio" || Tipo == "adventura") {
                this.Tipo = Tipo;
            }
        } catch (Exception e) {
            System.out.println("Tipo no aceptado");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo=" + Tipo + '}';
    }

}
