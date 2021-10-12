package EjercicioEXTRA04;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioCiudad {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<Integer, String> Ciudad = new HashMap<>();
    private final int CIUDADES = 10;

    private void menu() {

        System.out.println("***MENU***");
        System.out.println("1: Ingresar Ciudad.");
        System.out.println("2: Mostrar Datos.");
        System.out.println("3: Buscar Ciudad.");
        System.out.println("4: Eliminar Ciudad.");
        System.out.println("5: Salir.");

    }

    private int respuesta() {

        int respuesta = Leer.nextInt();

        return respuesta;

    }

    private void crearCP() {

        Integer codigo;
        String ciudad;
        String respuesta;

        do {

            Ciudad c = new Ciudad();

            System.out.println("Ingrese el codigo postal.");
            codigo = Leer.nextInt();
            c.setCodigo(codigo);

            System.out.println("Ingrese el nombre de la ciudad correspondiente.");
            ciudad = Leer.next().toUpperCase();
            c.setCiudad(ciudad);

            Ciudad.put(codigo, ciudad);

            System.out.println("Desea ingresar otra ciudad?");
            System.out.println("S (SI) - N (NO)");
            respuesta = Leer.next().toUpperCase();

        } while (respuesta.equalsIgnoreCase("S"));

    }

    private void mostrarDatos() {

        for (Map.Entry<Integer, String> aux : Ciudad.entrySet()) {

            Integer key = aux.getKey();
            String value = aux.getValue();

            System.out.println("Código Postal: " + key + "\n"
                    + "Ciudad: " + value);
            System.out.println();

        }

    }

    private void buscarCiudad() {

        Integer codigo;
        int contador = 0;

        System.out.println("Ingrese el código postal.");
        codigo = Leer.nextInt();

        for (Map.Entry<Integer, String> aux : Ciudad.entrySet()) {
            Integer key = aux.getKey();
            String value = aux.getValue();

            if (Objects.equals(key, codigo)) {
                contador++;

                System.out.println("Código Postal: " + key + "\n"
                        + "Ciudad: " + value);

            }

        }
        if (contador == 0) {
            System.out.println("Código inexistente.");
        }

    }

    private void eliminarCiudad() {

        Integer codigo;
        int contador = 0;

        System.out.println("Ingrese el código postal.");
        codigo = Leer.nextInt();

        for (Map.Entry<Integer, String> aux : Ciudad.entrySet()) {

            Integer key = aux.getKey();
            String value = aux.getValue();

            if (key.equals(codigo)) {
                contador++;
                Ciudad.remove(key, value);

            }

        }

        if (contador == 0) {
            System.out.println("Código inexistente.");
        } else {
            System.out.println("Código eliminado correctamente.");
        }

    }

    public void ejecucion() {

        int respuesta;

        do {

            menu();

            switch (respuesta = respuesta()) {

                case 1:

                    crearCP();
                    break;

                case 2:

                    mostrarDatos();
                    break;

                case 3:

                    buscarCiudad();
                    break;

                case 4:

                    eliminarCiudad();
                    break;

                case 5:

                    System.out.println("Muchas Gracias.");
                    break;

                default:

                    System.out.println("Opción incorrecta.");
                    break;

            }

        } while (respuesta != 5);

    }

}
