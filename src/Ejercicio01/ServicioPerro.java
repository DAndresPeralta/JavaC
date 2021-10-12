package Ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author d.andresperalta
 */
public class ServicioPerro {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Perro> raza = new ArrayList(); //raza es un ArrayList de tipo Perro

    private Perro crearPerro() {

        Perro p = new Perro();

        String genetica;

        genetica = JOptionPane.showInputDialog("Ingrese la raza de su perro.");

        p.setGenetica(genetica);

        raza.add(p);

        return p;

    }

    private void pedirDatos(int cantidad) {

        for (int i = 0; i < cantidad; i++) {

            crearPerro();

        }

    }

    private void mostrarDatos() {
//
//        System.out.println(raza.toString());
    
        for (Perro perro : raza) {
            
            System.out.println(perro);
            
        }
    

    }

    public void ejecucion() {

        String respuesta;

        System.out.println("***Bienvenido al Registro Nacional de Razas.***");
        System.out.println("A continuación ingrese los datos de su perro.");

        do {

            pedirDatos(1);

            respuesta = JOptionPane.showInputDialog("Ingrese (s) para ingresar otro dato. Ingrese (n) para salir.");
            respuesta = respuesta.toLowerCase();

            if (respuesta.equals("n")) {

                mostrarDatos();

            }

        } while (!"n".equals(respuesta));

    }

}
