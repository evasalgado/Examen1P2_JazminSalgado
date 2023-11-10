/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_jazminsalgado;

/**
 *
 * @author evaja
 */
public class libro_noficcion extends libro {

    private String Tipo;

    public libro_noficcion() {
        super();
    }

    public libro_noficcion(String Tipo, String titulo, String autor, double precio, int edicion) {
        super(titulo, autor, precio, edicion);
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        try {
            if (Tipo == "ensayo" || Tipo == "biografia"
                    || Tipo == "autobiografia" || Tipo == "revista cientifica") {
                this.Tipo = Tipo;
            }
        } catch (Exception e) {
            System.out.println("Tipo no aceptado");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo=" + Tipo;
    }

}
