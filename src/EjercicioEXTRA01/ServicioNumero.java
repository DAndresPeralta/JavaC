package EjercicioEXTRA01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioNumero {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Numero> num = new ArrayList();

    private void crearNumero() {

        Integer n1;

        do {

            Numero n = new Numero();

            System.out.println("Ingrese un número entero.");
            n1 = Leer.nextInt();

            if (n1 != -99) {
                n.setNum(n1);
                num.add(n);

            }

        } while (n1 != -99);

    }

    private void mostrarSize() {

        System.out.println("El tamaño de la lista es: " + num.size());

    }

    private Integer suma() {

        Integer suma = 0;

        for (Numero aux : num) {

            suma += aux.getNum();

        }

        System.out.println("La suma de los elementos es: " + suma);

        return suma;

    }

    private void media(Integer suma) {

        Integer media = 0;

        System.out.println("La media de los elementos es: " + (suma / num.size()));

    }

    public void ejecucion() {

        crearNumero();

        mostrarSize();

        Integer suma = suma();

        media(suma);

    }

}
