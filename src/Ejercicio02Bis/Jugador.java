package Ejercicio02Bis;

/**
 *
 * @author d.andresperalta
 */
public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    public boolean disparo(Revolver r) {

        boolean resp;
        

        if (r.mojar() == true) {
            resp = true;
            mojado = true;

        } else {
            resp = false;
            mojado = false;
            r.siguienteChorro();
        }

        return resp;

    }

}
