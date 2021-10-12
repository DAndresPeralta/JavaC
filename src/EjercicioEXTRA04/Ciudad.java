package EjercicioEXTRA04;

import java.util.Objects;

/**
 *
 * @author d.andresperalta
 */
public class Ciudad {

    private Integer codigo;
    private String ciudad;

    public Ciudad() {
    }

    public Ciudad(Integer codigo, String ciudad) {
        this.codigo = codigo;
        this.ciudad = ciudad;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "codigo=" + codigo + ", ciudad=" + ciudad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.codigo);
        hash = 79 * hash + Objects.hashCode(this.ciudad);
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
        final Ciudad other = (Ciudad) obj;
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

}
