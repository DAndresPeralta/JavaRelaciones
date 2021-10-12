package Prueba.entidades;

import Prueba.enumeraciones.Raza;

/**
 *
 * @author d.andresperalta
 */
public class Mascota {

    public String nombre;
    public String apodo;
    public Raza raza;

    public Mascota() {
    }

    public Mascota(String nombre, String apodo, Raza raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public Raza getRaza() {
        return raza;
    }

}
