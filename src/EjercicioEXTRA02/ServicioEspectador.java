package EjercicioEXTRA02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioEspectador {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Espectador> espectador = new ArrayList<>();

    public void crearPersonas() {

        Espectador p1 = new Espectador("Andres Peralta", 28, 3500);
        Espectador p2 = new Espectador("Martha Oropel", 58, 2000);
        Espectador p3 = new Espectador("Julian Perez", 35, 250);

        espectador.add(p1);
        p1.setEspectador(espectador);
        espectador.add(p2);
        p1.setEspectador(espectador);
        espectador.add(p3);
        p1.setEspectador(espectador);

    }

}
