package Ejercicio01R;

/**
 *
 * @author d.andresperalta
 */
public class Perro {

    private String nombre;
    private Raza raza;
    private int edad;
    private Tamaño tamaño;

    public Perro() {
    }

    public Perro(String nombre, Raza raza, int edad, Tamaño tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTamaño(Tamaño tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tama\u00f1o=" + tamaño + '}';
    }

}
