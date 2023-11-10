/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_jazminsalgado;

/**
 *
 * @author evaja
 */
public class libro_referencia extends libro {

    private String Tipo;

    public libro_referencia() {
        super();
    }

    public libro_referencia(String Tipo, String titulo, String autor, double precio, int edicion) {
        super(titulo, autor, precio, edicion);
        this.Tipo = Tipo;
    }


    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        try {
            if (Tipo == "diccionario" || Tipo == "enciclopedia"
                || Tipo == "manual" || Tipo == "tecnico" || Tipo == "tesauro") {
            this.Tipo = Tipo;
        }
        } catch (Exception e) {
            System.out.println("Lo ingresado no es valido");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo=" + Tipo;
    }

}
