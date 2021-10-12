package EjercicioEXTRA02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioCantante {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<CantanteFamoso> cantante = new ArrayList();

    private final int CANTIDAD_ARTISTA = 1;

    public void mostrarMenu() {

        System.out.println();
        System.out.println("***MENU***");
        System.out.println("----------");
        System.out.println("1: Ingresar Artista.\n"
                + "2: Mostrar Base de Datos.\n"
                + "3: Eliminar Artista.\n"
                + "4: Salir.");

    }

    public int respuesta() {

        int respuesta = Leer.nextInt();
        return respuesta;

    }

    public CantanteFamoso crearCantante() {

        ArrayList<Integer> disco = new ArrayList();

        CantanteFamoso c = new CantanteFamoso();

        System.out.println("Ingrese el nombre del artista.");
        String artista = Leer.next().toUpperCase();
        c.setNombre(artista);

        System.out.println("Cuantos discos quiere registrar?.");
        Integer cantDiscos = Leer.nextInt();

        for (int i = 0; i < cantDiscos; i++) {

            System.out.println("Ingrese la cantidad de discos vendidos del disco N° " + (i + 1));
            Integer cd = Leer.nextInt();
            disco.add(cd);
            c.setDiscoConMasVentas(disco);

        }

        return c;

    }

    public void ingresarCantante() {

        String respuesta;

        for (int i = 0; i < CANTIDAD_ARTISTA; i++) {

            cantante.add(crearCantante());

        }

        do {

            System.out.println("Desea agregar otro artista?.");
            System.out.println("S (SI) - N (NO)");
            respuesta = Leer.next().toUpperCase();

            if (respuesta.equals("S")) {

                cantante.add(crearCantante());

            } else {
                System.out.println();
                System.out.println("Muchas Gracias.");
            }

        } while (respuesta.equalsIgnoreCase("S"));

    }

    public void mostrarArtista() {

        Iterator<CantanteFamoso> it = cantante.iterator();

        while (it.hasNext()) {

            CantanteFamoso aux = it.next();

            Integer mayorVenta = aux.getDiscoConMasVentas().get(0);

            for (int i = 0; i < aux.getDiscoConMasVentas().size(); i++) {

                if (aux.getDiscoConMasVentas().get(i) > mayorVenta) {
                    mayorVenta = aux.getDiscoConMasVentas().get(i);

                }

            }

            System.out.println("Artista: " + aux.getNombre() + "\n"
                    + "Disco más vendido: " + mayorVenta);

        }

    }

    public void eliminarCantante() {

        System.out.println("Ingrese un artista a eliminar.");
        String eliminar = Leer.next().toUpperCase();

        Iterator<CantanteFamoso> it = cantante.iterator();

        while (it.hasNext()) {

            CantanteFamoso aux = it.next();

            if (aux.getNombre().equals(eliminar)) {

                it.remove();

            }

        }

    }

    public void ejecucion() {

        int respuesta;

        System.out.println("***Bienvenido a Sony Records.***");

        do {

            mostrarMenu();

            switch (respuesta = respuesta()) {

                case 1:

                    ingresarCantante();
                    break;

                case 2:

                    mostrarArtista();
                    break;

                case 3:

                    eliminarCantante();
                    break;

                case 4:

                    System.out.println("Muchas Gracias.");
                    System.out.println("---------------");
                    System.out.println("Sony Records.");
                    break;

            }

        } while (respuesta != 4);

    }

}
