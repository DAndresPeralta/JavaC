package Ejercicio03R;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioAlumno {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alumno> alumno = new ArrayList();
    private final int cantidadNotas = 3;

    public Alumno crearAlumno() {

        Alumno a = new Alumno();

        System.out.println("Ingrese el nombre del alumno.");
        String nombre = Leer.next().toUpperCase();

        a.setNombre(nombre);

        ArrayList<Integer> nota = new ArrayList();

        System.out.println("Ingrese las notas del alumno " + a.getNombre());

        for (int i = 0; i < cantidadNotas; i++) {

            System.out.println("Nota N°: " + (i + 1));
            Integer n = Leer.nextInt();

            nota.add(n);
            a.setNota(nota);

        }

        return a;

    }

    public void ingresarAlumnos() {

        String respuesta;

        do {

            alumno.add(crearAlumno());

            System.out.println("Desea agregar otro alumno?.");
            System.out.println("Ingrese s (SI) - n (NO)");
            respuesta = Leer.next().toLowerCase();

            if (respuesta.equals("s")) {

                System.out.println("Alumnos agregados. Muchas gracias.");

            }

        } while (respuesta.equalsIgnoreCase("s"));

    }

    public void notaFinal() {

        String name;
        double suma = 0;
        double promedio = 0;

        System.out.println("Ingrese un alumno para conocer su nota final.");
        name = Leer.next().toUpperCase();

        Iterator<Alumno> it = alumno.iterator();

        while (it.hasNext()) {

            Alumno aux = it.next();

            if (aux.getNombre().equals(name)) {

                for (int i = 0; i < cantidadNotas; i++) {

                    suma += aux.getNota().get(i);

                }
                promedio = (suma / cantidadNotas);
                System.out.println("La nota final del alumno: " + aux.getNombre() + " es " + promedio);

            }

        }

    }

    public void ejecucion() {

        ingresarAlumnos();

        notaFinal();

    }

}
