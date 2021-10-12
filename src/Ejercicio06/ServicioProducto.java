package Ejercicio06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioProducto {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private HashMap<String, Double> stock = new HashMap();

    private void mostrarMenu() {

        System.out.println("***Bienvenido a Gestíon de Productos.***");
        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.println("Seleccione la opción deseada.");
        System.out.println("1: Ingresar Productos.\n"
                + "2: Modificar Precio.\n"
                + "3: Eliminar Producto.\n"
                + "4: Mostrar Lista.\n"
                + "5: Salir.");

    }

    private int seleccionarOpcion() {

        int respuesta;

        System.out.print("Respuesta: ");
        respuesta = Leer.nextInt();

        return respuesta;

    }

    private Producto crearProducto() {

        String respuesta;

        Producto p = new Producto();

        do {

            System.out.println("Ingrese un producto.");
            String producto = Leer.next().toUpperCase();
            p.setProducto(producto);

            System.out.println("Ingrese el precio de " + producto);
            Double precio = Leer.nextDouble();
            p.setPrecio(precio);

            stock.put(producto, precio);

            System.out.println("Desea agregar otro producto?.");
            System.out.println("S (SI) - N (NO).");
            respuesta = Leer.next().toUpperCase();

        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("Productos ingresados correctamente.");
        System.out.println();

        return p;

    }

    private void modificarPrecio() {

        String producto;
        int contador = 0;

        System.out.println("Ingrese un producto para modificar su precio.");
        producto = Leer.next().toUpperCase();

        for (Map.Entry<String, Double> aux : stock.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();

            if (key.equals(producto)) {

                contador++;

                System.out.println("Ingrese el precio modificado de " + key);
                Double newPrecio = Leer.nextDouble();

                stock.replace(key, newPrecio);

            }

        }
        if (contador > 0) {
            System.out.println("Precio modificado.");
        } else {
            System.out.println("Producto inexistente.");
        }

    }

    private void mostrarStock() {

        System.out.println();
        System.out.println("***STOCK***");

        for (Map.Entry<String, Double> aux : stock.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();

            System.out.println("Producto: " + key + " - " + "Precio: " + value);

        }

    }

    private void eliminarProducto() {

        String productoEliminar;
        int contador = 0;

        System.out.println();

        System.out.println("Ingrese el producto a eliminar.");
        productoEliminar = Leer.next().toUpperCase();

        for (Map.Entry<String, Double> aux : stock.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();

            if (key.equals(productoEliminar)) {

                contador++;
                stock.remove(key);

            }

        }
        if (contador > 0) {
            System.out.println("Producto Eliminado correctamente.");
        } else {
            System.out.println("Producto inexistente.");
        }

    }

    public void ejecucion() {

        int respuesta;

        do {

            mostrarMenu();

            switch (respuesta = seleccionarOpcion()) {

                case 1:

                    crearProducto();
                    break;

                case 2:

                    modificarPrecio();
                    break;

                case 3:

                    eliminarProducto();
                    break;

                case 4:

                    mostrarStock();
                    break;

                case 5:

                    System.out.println("Muchas Gracias.");
                    break;

                default:

                    System.out.println("Opcion incorrecta. Intente nuevamente.");

            }

        } while (respuesta != 5);

    }

}
