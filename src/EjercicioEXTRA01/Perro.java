package EjercicioEXTRA01;

import java.util.ArrayList;

/**
 *
 * @author d.andresperalta
 */
public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private boolean adoptado;
    private ArrayList<Persona> persona = new ArrayList<>();

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.adoptado = adoptado;
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

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    public void setPersona(ArrayList<Persona> persona) {
        this.persona = persona;
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

    public boolean isAdoptado() {
        return adoptado;
    }

    public ArrayList<Persona> getPersona() {
        return persona;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", adoptado=" + adoptado + ", persona=" + persona + '}';
    }

}
