package Ejercicio01;

/**
 *
 * @author d.andresperalta
 */
public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tama\u00f1o=" + tamaño + '}';
    }

}
