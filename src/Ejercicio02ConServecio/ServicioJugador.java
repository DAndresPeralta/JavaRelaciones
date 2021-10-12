package Ejercicio02ConServecio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author UltraBytes
 */
public class ServicioJugador {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Jugador> jugadores = new ArrayList<>();

    public void crearJugador(int cont) {

        Jugador j = new Jugador();

        System.out.println("Ingrese el nombre del jugador N°: " + (cont));
        String nombre = Leer.next();
        j.setNombre(nombre);

        j.setId(cont);

        jugadores.add(j);

    }

    public void llenarJugador() {

        int cont = 0;

//        Jugador j = new Jugador();
        System.out.println("Ingrese la cantidad de jugadores.");
        int cantJugadores = Leer.nextInt();

        if (cantJugadores > 6) {

            cantJugadores = 6;

        }

        for (int i = 0; i < cantJugadores; i++) {
            cont++;

            crearJugador(cont);

        }

//        return j;
    }

//    public void ejecucion() {
//
//        Jugador j = new Jugador();
//
//        crearJugador();
//
//    }
}
