package Ejercicio05;

import java.util.Objects;

/**
 *
 * @author d.andresperalta
 */
public class Pais implements Comparable<Pais> {

    private String pais;

    public Pais() {
    }

    public Pais(String pais) {
        this.pais = pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "País: " + pais;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Pais p) {
        return this.pais.compareTo(p.getPais());
    }

}
