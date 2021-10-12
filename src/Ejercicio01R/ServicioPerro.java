package Ejercicio01R;

import java.util.ArrayList;

/**
 *
 * @author d.andresperalta
 */
public class ServicioPerro {

    private ArrayList<Perro> listaPerro = new ArrayList<>();

    public void crearPerro() {

        Perro m1 = new Perro("CHARLY", Raza.CALLEJERO, 2, Tamaño.PEQUEÑO);
        Perro m2 = new Perro("FRIDA", Raza.CALLEJERO, 1, Tamaño.PEQUEÑO);

        listaPerro.add(m1);
        listaPerro.add(m2);

    }

    public ArrayList<Perro> getListaPerro() {
        return listaPerro;
    }

    public void setListaPerro(ArrayList<Perro> listaPerro) {
        this.listaPerro = listaPerro;
    }

    public void imprimirLista() {

        for (Perro aux : listaPerro) {

            System.out.println(aux);

        }

    }

}
