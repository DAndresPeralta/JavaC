package EjercicioEXTRA03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioLibro {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Libro> Libreria = new HashSet();

    public void menu() {

        System.out.println("1: Ingresar libro.\n"
                + "2: Prestamos.\n"
                + "3: Devolución.\n"
                + "4: Mostrar base de datos.\n"
                + "5: Salir.");

    }

    public int respuesta() {

        int respuesta = Leer.nextInt();

        return respuesta;

    }

    public Libro crearLibro() {

        Libro l = new Libro();

        System.out.println("Ingrese el título.");
        String titulo = Leer.next().toUpperCase();
        l.setTitulo(titulo);

        System.out.println("Ingrese el autor.");
        String autor = Leer.next().toUpperCase();
        l.setAutor(autor);

        System.out.println("Ingrese la cantidad de ejemplares.");
        int ejemplares = Leer.nextInt();
        l.setEjemplares(ejemplares);

        System.out.println("Ingrese la cantidad de ejemplares prestados.");
        int prestados = Leer.nextInt();
        l.setEjemplatesPrestados(prestados);

        return l;

    }

    public void ingresarLibro() {

        String respuesta;

        System.out.println("***Bienvenido a Gestión de Librerias.***");

        do {

            Libreria.add(crearLibro());

            System.out.println("Desea cargar otro libro?");
            System.out.println("S (SI) - N (NO)");
            respuesta = Leer.next().toUpperCase();

            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Libros ingresados correctamente.");
            }

        } while (respuesta.equalsIgnoreCase("S"));

    }

    public boolean metodoPrestamo() {

        boolean b = false;
        int contador = 1;

        System.out.println("Ingrese el nombre del libro.");
        String libro = Leer.next().toUpperCase();

        Iterator<Libro> it = Libreria.iterator();

        while (it.hasNext()) {

            Libro aux = it.next();

            if (aux.getTitulo().equals(libro)) {

                b = true;

                contador--;
                if (aux.getEjemplatesPrestados() != aux.getEjemplares()) {

                    aux.setEjemplatesPrestados(aux.getEjemplatesPrestados() + 1);
                    contador++;

                }

            }

        }

        if (contador == 0) {
            System.out.println("No quedan ejemplares disponibles.");
        }

        return b;

    }

    public void metodoDevolucion() {

        int contador = 0;

        System.out.println("Ingrese el nombre del libro.");
        String libro = Leer.next().toUpperCase();

        Iterator<Libro> it = Libreria.iterator();

        while (it.hasNext()) {

            Libro aux = it.next();

            if (aux.getTitulo().equals(libro)) {

                contador++;

                if (aux.getEjemplatesPrestados() != 0) {

                    aux.setEjemplatesPrestados(aux.getEjemplatesPrestados() - 1);

                }

            }

        }
        if (contador == 0) {
            System.out.println("El libro no se encuentra en la base de datos.");
        }

    }

    public void mostrarLibro() {

        for (Libro aux : Libreria) {

            System.out.println(aux.toString());

        }

    }

    public void ejecucion() {

        int respuesta;

        System.out.println("Bienvenido a Gestión de Librerias.");

        do {

            menu();

            switch (respuesta = respuesta()) {

                case 1:

                    ingresarLibro();
                    break;

                case 2:

                    boolean b = metodoPrestamo();
                    if (b == true) {
                        System.out.println("Gracias.");

                    } else {
                        System.out.println("El libro no se encuentra en la base de datos.");
                    }
                    break;

                case 3:

                    metodoDevolucion();
                    break;

                case 4:

                    mostrarLibro();
                    break;

                case 5:

                    System.out.println("Muchase gracias.");
                    break;

            }

        } while (respuesta != 5);

    }

}
