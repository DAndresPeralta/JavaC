package Ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author d.andresperalta
 */
public class Perro {

    private String raza;

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return raza;
    }
    

}
