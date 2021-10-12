package Ejercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioBaraja {

    private int sigCarta = 0;

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Carta> mano = new ArrayList<>();

    public void barajar(ServicioCarta c) {

        Collections.shuffle(c.mazo);

    }

    public void siguienteCarta(ServicioCarta c) {

        if (sigCarta == c.mazo.size()) {
            System.out.println("No quedan cartas en la baraja.");

        } else {

            mano.add(c.mazo.get(sigCarta));
            c.mazo.remove(sigCarta);
            sigCarta++;

        }

    }

    public void darCartas(ServicioCarta c) {

        int cantCartas;

        do {
            System.out.println("Cuantas cartas quiere?.");
            cantCartas = Leer.nextInt();

            if (cantCartas > c.mazo.size()) {
                System.out.println("Supera la cantidad de cartas de la baraja. Intente nuevamente");
            }

        } while (cantCartas > c.mazo.size());

        for (int i = 0; i < cantCartas; i++) {

            if (cantCartas > c.mazo.size()) {

                System.out.println("No hay cartas suficientes.");
                break;
            }

            Carta val = c.mazo.get(i);
            mano.add(val);
            c.mazo.remove(val);

        }

    }

    public void cartasDisponibles(ServicioCarta c) {

        System.out.println(c.mazo.size());

        for (Carta aux : c.mazo) {

            System.out.println(aux);

        }

    }

    public void mostrarMano() {

        System.out.println("Su mano es: ");

        for (Carta aux : mano) {

            if (mano.isEmpty()) {

                System.out.println("No ha sacado ninguna carta.");
            } else {
                System.out.println(aux);
            }

        }

    }

    public void mostrarBaraja(ServicioCarta c) {

        if (c.mazo.isEmpty()) {

            for (Carta aux : mano) {

                System.out.println(aux);

            }

        }

    }

    public void ejecucion(ServicioCarta c) {

        c.crearMaso();

        c.mostrar();

        int resp;

        do {

            System.out.println("Ingrese la opcion deseada.");
            resp = Leer.nextInt();

            switch (resp) {

                case 1:

                    barajar(c);
                    break;

                case 2:

                    siguienteCarta(c);
                    break;

                case 3:

                    darCartas(c);
                    break;

                case 4:

                    cartasDisponibles(c);
                    break;

                case 5:

                    mostrarMano();
                    break;

                case 6:

                    mostrarBaraja(c);
                    break;

                case 7:

                    System.out.println("Salir.");
                    break;

            }

        } while (resp != 7);

    }

}
