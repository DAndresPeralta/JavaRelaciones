package Ejercicio02Bis;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio02Bis {

    public static void main(String[] args) {

        Juego j = new Juego();

        Revolver r = new Revolver();

        j.ronda(r);
        j.mostrarJugadores();

    }

}
