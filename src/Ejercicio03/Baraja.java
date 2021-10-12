package Ejercicio03;

import java.util.ArrayList;

/**
 *
 * @author d.andresperalta
 */
public class Baraja {

    private ArrayList<Carta> carta = new ArrayList<>();

    public Baraja() {
    }

    public void setCarta(ArrayList<Carta> carta) {
        this.carta = carta;
    }

    public ArrayList<Carta> getCarta() {
        return carta;
    }

    @Override
    public String toString() {
        return "Baraja{" + "carta=" + carta + '}';
    }

}
