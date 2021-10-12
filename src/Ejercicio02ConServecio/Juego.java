package Ejercicio02ConServecio;

import java.util.ArrayList;

/**
 *
 * @author UltraBytes
 */
public class Juego {

    private Revolver revoler;
    private ArrayList<Jugador> jugadores = new ArrayList<>();

    public Juego() {
    }

    public Juego(Revolver revoler) {
        this.revoler = revoler;
    }

    public void setRevoler(Revolver revoler) {
        this.revoler = revoler;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevoler() {
        return revoler;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "revoler=" + revoler + ", jugadores=" + jugadores + '}';
    }

}
