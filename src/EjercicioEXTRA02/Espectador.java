package EjercicioEXTRA02;

import java.util.ArrayList;

/**
 *
 * @author d.andresperalta
 */
public class Espectador {

    private String nombre;
    private int edad;
    private double dinero;
    private ArrayList<Espectador> espectador = new ArrayList<>();

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void setEspectador(ArrayList<Espectador> espectador) {
        this.espectador = espectador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getDinero() {
        return dinero;
    }

    public ArrayList<Espectador> getEspectador() {
        return espectador;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", espectador=" + espectador + '}';
    }

}
