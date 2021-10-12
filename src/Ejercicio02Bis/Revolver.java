package Ejercicio02Bis;

/**
 *
 * @author d.andresperalta
 */
public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    public void llenarRevolver() {

        do {

            posicionActual = (int) (Math.random() * 7);
            posicionAgua = (int) (Math.random() * 7);

        } while (posicionActual > posicionAgua);

        System.out.println(posicionActual);
        System.out.println(posicionAgua);

    }

    public boolean mojar() {

        return (posicionActual == posicionAgua);

    }

    public void siguienteChorro() {

        posicionActual++;

    }

}
