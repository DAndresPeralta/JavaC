package EjercicioEXTRA02;

import java.util.ArrayList;

/**
 *
 * @author d.andresperalta
 */
public class CantanteFamoso {

    private String nombre;
    private ArrayList<Integer> discoConMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, ArrayList<Integer> discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiscoConMasVentas(ArrayList<Integer> discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre=" + nombre + ", discoConMasVentas=" + discoConMasVentas + '}';
    }

}
