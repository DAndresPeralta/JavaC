package Ejercicio01;

/**
 *
 * @author d.andresperalta
 */
public class Perro {

    private String genetica;

    public Perro() {
    }

    public Perro(String genetica) {
        this.genetica = genetica;
    }

    public void setGenetica(String genetica) {
        this.genetica = genetica;
    }

    public String getGenetica() {
        return genetica;
    }

    @Override
    public String toString() {
        return genetica;
    }

}
