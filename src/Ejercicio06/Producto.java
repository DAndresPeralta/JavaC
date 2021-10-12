package Ejercicio06;

import java.util.Objects;

/**
 *
 * @author d.andresperalta
 */
public class Producto {

    private String producto;
    private Double precio;

    public Producto() {
    }

    public Producto(String producto, Double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "producto=" + producto + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.producto);
        hash = 97 * hash + Objects.hashCode(this.precio);
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
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        return true;
    }

}
