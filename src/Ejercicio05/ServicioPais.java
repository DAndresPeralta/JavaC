package Ejercicio05;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author d.andresperalta
 */
public class ServicioPais {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private TreeSet<Pais> country = new TreeSet();

    private Pais crearPais() {

        System.out.println("Ingrese un país.");
        String pais = Leer.next().toUpperCase();

        Pais p = new Pais(pais);

        return p;

    }

    private void ingresarPais() {

        String respuesta;

        do {

            country.add(crearPais());

            System.out.println("Desea ingresar otro país?.");
            System.out.println("Presione S (SI) - N (NO).");

            respuesta = Leer.next().toUpperCase();

        } while (respuesta.equalsIgnoreCase("S"));

    }

    private void mostrarPais() {

        for (Pais aux : country) {

            System.out.println(aux);

        }

    }

    private void eliminarPais() {

        String eliminar;
        int contador = 0;

        System.out.println("Ingrese un pais para eliminarlo de la base de datos.");
        eliminar = Leer.next().toUpperCase();

        Iterator<Pais> it = country.iterator();

        while (it.hasNext()) {

            Pais aux = it.next();

            if (aux.getPais().equals(eliminar)) {

                contador++;

                it.remove();

            }

        }

        if (contador != 0) {

            System.out.println("País eliminado con éxito.");

        } else {
            System.out.println("EL país no se encuentra en la base de datos.");
        }

    }

    public void ejecucion() {

        ingresarPais();

        mostrarPais();

        eliminarPais();
        
        mostrarPais();

    }

}
