package Ejercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioPerro {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<String> marca = new ArrayList();

    private Perro crearPerro() {

        Perro p = new Perro();

        System.out.println("Ingrese la raza del perro.");
        String gen = Leer.next().toLowerCase();

        p.setRaza(gen);

        marca.add(gen);

        return p;

    }

    private void pedirDatos(int cantidad) {

        for (int i = 0; i < cantidad; i++) {

            crearPerro();

        }

    }

    private void mostrarDatos() {

        System.out.println();
        System.out.println("***Razas registradas***");
        System.out.println();

        for (String aux : marca) {

            System.out.println(aux);

        }

    }

    private void eliminarPerro() {

        String perroEliminar;
        int contador = 0;
        Iterator<String> it = marca.iterator();

        System.out.println("Ingrese una raza a eliminar");
        perroEliminar = Leer.next().toLowerCase();
        
        

        while (it.hasNext()) {
            String aux = it.next();

            if (aux.equals(perroEliminar)) {
                contador++;
                it.remove();

            }

        }

        if (contador == 0) {

            System.out.println("La raza no se encuentra en la lista.");

        } else {

            System.out.println("Raza eliminada.");
        }

    }

    public void ejecucion() {

        String respuesta;
        String respuesta2;

        System.out.println("***Bienvenido al Registro Nacional de Razas.***");
        System.out.println("A continuación ingrese los datos de su perro.");

        do {

            pedirDatos(1);

            System.out.println("Ingrese (s) para ingresar otro dato. Ingrese (n) para salir.");
            respuesta = Leer.next().toLowerCase();

        } while (!"n".equals(respuesta));

        System.out.println("Desea eliminar una raza del sistema?. Ingres: s (SI) - n (NO)");
        respuesta2 = Leer.next().toLowerCase();

        if (respuesta2.equals("s")) {

            eliminarPerro();

        } else {

            System.out.println("Muchas gracias.");
        }

        mostrarDatos();

    }

}
