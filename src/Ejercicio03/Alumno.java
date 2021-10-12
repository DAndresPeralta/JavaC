package Ejercicio03;

import java.util.ArrayList;

/**
 *
 * @author d.andresperalta
 */
public class Alumno {

    private String nombre;
    private ArrayList<Integer> notas = new ArrayList();

    public Alumno() {
    }

    public Alumno(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return nombre + notas;
    }
    
    

}
