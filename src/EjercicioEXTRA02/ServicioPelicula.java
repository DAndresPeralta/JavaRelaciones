package EjercicioEXTRA02;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioPelicula {

    private final Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {

        Pelicula p1 = new Pelicula("La noche mas larga", 1.30, 18, "Ridley Scott", 500);

        return p1;

    }

}
