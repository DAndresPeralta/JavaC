package Ejercicio03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Servicio {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Alumno> alumno = new ArrayList();

    private final int cantidadNotas = 3;

    public void crearAlumno() {

        String respuesta;

        do {

            Alumno a1 = new Alumno();

            System.out.println("Ingrese el nombre del alumno.");
            String nombre = Leer.next().toLowerCase();

            a1.setNombre(nombre);

            System.out.println("Ingrese las notas de " + a1.getNombre());

            for (int i = 0; i < cantidadNotas; i++) {

                System.out.println("Nota N°: " + (i + 1));
                Integer nota = Leer.nextInt();
                a1.getNotas().add(nota);

            }
            alumno.add(a1);

            System.out.println("Desea agregar otro alumno?");
            System.out.println("Ingrese s (SI) - n (NO).");
            respuesta = Leer.next().toLowerCase();

        } while (respuesta.equalsIgnoreCase("s"));

    }

    public void notaFinal() {

        String name;

        System.out.println("Ingrese el nombre de un alumno para saber su nota final.");
        name = Leer.next();

        Iterator<Alumno> it = alumno.iterator();

        while (it.hasNext()) {

            double promedio = 0;

            Alumno aux = it.next();

            if (aux.getNombre().equals(name)) {

                for (int i = 0; i < cantidadNotas; i++) {

                    promedio = promedio + aux.getNotas().get(i);
                }
                double promedioFinal = (promedio / cantidadNotas);
                System.out.println("El promedio es: " + promedioFinal);
            }

        }

    }

    public void ejecucion() {

        crearAlumno();

        notaFinal();

    }

}
