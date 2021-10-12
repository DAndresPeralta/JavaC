package Ejercicio04;

import java.util.Comparator;

/**
 *
 * @author d.andresperalta
 */
public class Comparadores {

    public static Comparator<Pelicula> ordenarAsce = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getDuracion().compareTo(t1.getDuracion());

        }

    };

    public static Comparator<Pelicula> ordenarDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t1.getDuracion().compareTo(t.getDuracion());

        }

    };

    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getTitulo().compareTo(t1.getTitulo());

        }

    };

    public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getDirector().compareTo(t1.getDirector());

        }

    };

}
