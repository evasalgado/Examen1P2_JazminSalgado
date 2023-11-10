/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_jazminsalgado;

/**
 *
 * @author evaja
 */
public class libro_texto extends libro{
    private String curso, facultad;

    public libro_texto() {
        super();
    }

    public libro_texto(String curso, String facultad, String titulo, String autor, double precio, String edicion) {
        super(titulo, autor, precio, edicion);
        this.curso = curso;
        this.facultad = facultad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return super.toString()+"curso=" + curso + "\nfacultad=" + facultad ;
    }
    
    
}
