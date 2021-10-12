package EjercicioEXTRA02R;

/**
 *
 * @author d.andresperalta
 */
public class ServicioPelicula {

    public Pelicula crearPelicula() {

        Pelicula p = new Pelicula("La noche más oscura", 2.30, 18, "Ridley Scott", 650);

        return p;

    }

    public boolean tieneEdad(Espectador e, Pelicula p) {

        return e.getEdad() >= p.getEdadMinima();

    }

    public boolean hayDinero(Espectador e, Pelicula p) {

        return e.getDinero() >= p.getPrecio();

    }

}
