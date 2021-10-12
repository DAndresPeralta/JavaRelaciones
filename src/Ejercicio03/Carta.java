package Ejercicio03;

/**
 *
 * @author d.andresperalta
 */
public class Carta {

    private int numero;
    private Palo palo;

    public Carta() {
    }

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }

}
