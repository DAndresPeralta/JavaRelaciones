package Ejercicio02Bis;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Juego {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Revolver revolver;

    public Juego() {
    }

    public Juego(Revolver revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

    public void llenarJuego(Revolver r) {

        System.out.println("Ingrese la cantidad de jugadores.");
        int cantJugadores = Leer.nextInt();

        if (cantJugadores > 6) {
            cantJugadores = 6;
        }

        for (int i = 0; i < cantJugadores; i++) {
            Jugador j = new Jugador();
            System.out.println("Ingrese el nombre del jugador N°: " + (i + 1));
            String nombres = Leer.next();
            j.setNombre(nombres);
            j.setId(i + 1);
            j.setMojado(false);
            jugadores.add(j);
        }

    }

    public void ronda(Revolver r) {

        r.llenarRevolver();

        llenarJuego(r);

        Jugador j = new Jugador();

        do {

            for (Jugador aux : jugadores) {

                System.out.println(r.getPosicionActual());
                System.out.println(r.getPosicionAgua());

                if (aux.disparo(r) == false) {

                } else if (aux.disparo(r) == true) {
                    break;

                }

            }

        } while (j.disparo(r) == false);

    }

    public void mostrarJugadores() {

        for (Jugador aux : jugadores) {

            System.out.println(aux);

        }

    }

}
