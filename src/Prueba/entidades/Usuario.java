package Prueba.entidades;

import Prueba.enumeraciones.Raza;
import Prueba.enumeraciones.SexoHumano;

/**
 *
 * @author d.andresperalta
 */
public class Usuario {

    public String nombre;
    public String apellido;
    public SexoHumano sexo;
    public Raza raza;
    
    public Mascota mascota;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, SexoHumano sexo, Raza raza) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public SexoHumano getSexo() {
        return sexo;
    }

    public Raza getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Prueba{" + "nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", raza=" + raza + '}';
    }

}
