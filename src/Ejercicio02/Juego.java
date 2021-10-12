package Ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author d.andresperalta
 */
public class Juego {

    private Jugador jugador;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(Jugador jugador, Revolver revolver) {
        this.jugador = jugador;
        this.revolver = revolver;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador=" + jugador + ", revolver=" + revolver + '}';
    }

}
