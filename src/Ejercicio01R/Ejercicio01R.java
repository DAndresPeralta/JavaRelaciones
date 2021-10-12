package Ejercicio01R;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio01R {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in).useDelimiter("\n");

        ServicioPerro Sm1 = new ServicioPerro();
        ServicioPersona Sp1 = new ServicioPersona();

        Sm1.crearPerro();
        Sp1.crearPersona();

        Sm1.imprimirLista();
        Sp1.imprimirLista();

        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el nombre del perro");
            String nombre = Leer.next().toUpperCase();
            Sp1.asignarMascota(Sm1, nombre);
        }

        Sp1.imprimirLista();

    }

}
