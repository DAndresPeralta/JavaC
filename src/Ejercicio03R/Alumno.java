package Ejercicio03R;

import java.util.ArrayList;

/**
 *
 * @author d.andresperalta
 */
public class Alumno {

    private String nombre;
    private ArrayList<Integer> nota = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }

}
