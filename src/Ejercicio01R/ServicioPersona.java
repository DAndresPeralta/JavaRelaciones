package Ejercicio01R;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioPersona {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Persona> listaPersona = new ArrayList<>();

    public void crearPersona() {

        Persona p1 = new Persona("ANDRES", "PERALTA", 37738121, 28);
        Persona p2 = new Persona("MARTHA", "OROPEL", 16102625, 58);

        listaPersona.add(p1);
        listaPersona.add(p2);

    }

    public void imprimirLista() {

        for (Persona aux : listaPersona) {

            System.out.println(aux);

        }
    }

    public void asignarMascota(ServicioPerro p, String nombre) {

        System.out.println("Ingrese el apellido de la persona.");
        String apellido = Leer.next();

        for (Persona aux : listaPersona) {

            if (aux.getApellido().equals(apellido.toUpperCase())) {

                for (Perro aux2 : p.getListaPerro()) {

                    if (aux2.getNombre().equals(nombre)) {
                        aux.getMascota().add(aux2);

                    }

                }

            }

        }

    }

}
