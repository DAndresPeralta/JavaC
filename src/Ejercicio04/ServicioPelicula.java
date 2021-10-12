package Ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioPelicula {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Pelicula> pelicula = new ArrayList();

    public Pelicula crearPelicula() {

        System.out.println("Ingrese el titulo de la película.");
        String titulo = Leer.next();

        System.out.println("Ingrese el director de la película.");
        String director = Leer.next();

        System.out.println("Ingrese la duración de la película (Hs).");
        Double duracion = Leer.nextDouble();

        Pelicula p = new Pelicula(titulo, director, duracion);

        return p;

    }

    public void ingresarPelicula() {

        String respuesta;

        do {

            pelicula.add(crearPelicula());

            System.out.println("Desea agregar otra película.");
            System.out.println("Ingrese s (SI) - n (NO)");

            respuesta = Leer.next().toLowerCase();

        } while (respuesta.equalsIgnoreCase("s"));

    }

    public void mostrarPelicula() {

        System.out.println();
        System.out.println("***Películas en la base de datos***");
        System.out.println("-----------------------------------------");
        System.out.println();

        for (int i = 0; i < pelicula.size(); i++) {

            System.out.println(pelicula.get(i)); //Muestro el ArrayList desde el método toString de Pelicula Class.
            System.out.println();
        }

    }

    public void mostrarPelicula1() {

        System.out.println();
        System.out.println("Películas mayor a 1 hora de duración.");
        System.out.println("-------------------------------------------");
        System.out.println();

        for (Pelicula aux : pelicula) {

            if (aux.getDuracion() >= 1) {

                System.out.println(aux);
                System.out.println();

            }

        }

    }

    public void ordenarDesc() {

        System.out.println();
        System.out.println("Orden descendente.");
        System.out.println();

        Collections.sort(pelicula, Comparadores.ordenarDesc);

        for (Pelicula aux : pelicula) {

            System.out.println(aux.getTitulo());

        }

    }

    public void ordenarAsce() {

        System.out.println();
        System.out.println("Orden ascendente.");
        System.out.println();

        Collections.sort(pelicula, Comparadores.ordenarAsce);

        for (Pelicula aux : pelicula) {

            System.out.println(aux.getTitulo());

        }

    }

    public void ordenarTitulo() {

        System.out.println();
        System.out.println("Orden según título.");
        System.out.println();

        Collections.sort(pelicula, Comparadores.ordenarTitulo);

        for (Pelicula aux : pelicula) {

            System.out.println(aux.getTitulo());

        }

    }

    public void ordenarTituloDirector() {

        System.out.println();
        System.out.println("Orden según título y director.");
        System.out.println();

        Collections.sort(pelicula, Comparadores.ordenarTitulo);
        Collections.sort(pelicula, Comparadores.ordenarDirector);

        for (Pelicula aux : pelicula) {

            System.out.println(aux.getTitulo() + aux.getDirector());

        }

    }

    public void ejecucion() {

        ingresarPelicula();

        mostrarPelicula();

        mostrarPelicula1();

        ordenarDesc();

        ordenarAsce();

        ordenarTitulo();

        ordenarTituloDirector();

    }

}
