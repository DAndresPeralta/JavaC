package EjercicioEXTRA03;

/**
 *
 * @author d.andresperalta
 */
public class Libro {

    private String titulo;
    private String autor;
    private int ejemplares;
    private int ejemplatesPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ejemplares, int ejemplatesPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplatesPrestados = ejemplatesPrestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setEjemplatesPrestados(int ejemplatesPrestados) {
        this.ejemplatesPrestados = ejemplatesPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getEjemplatesPrestados() {
        return ejemplatesPrestados;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\n"
                + "Autor: " + autor + "\n"
                + "Ejemplares: " + ejemplares + "\n"
                + "Ejemplares Prestados: " + ejemplatesPrestados;
    }

}
