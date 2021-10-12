package EjercicioEXTRA01;

import java.util.ArrayList;

/**
 *
 * @author d.andresperalta
 */
public class Persona {

    private String nombre;
    private String apellido;
    private long dni;
    private int edad;
    private ArrayList<Persona> personas = new ArrayList<>();

    public Persona() {
    }

    public Persona(String nombre, String apellido, long dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + '}';
    }

}
