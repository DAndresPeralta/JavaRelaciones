package EjercicioEXTRA01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioPersona {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Persona> persona = new ArrayList<>();

    public void crearPersona() {

        String resp;

        do {

            Persona p = new Persona();

            System.out.println("Ingrese su nombre");
            String nombre = Leer.next().toUpperCase();
            p.setNombre(nombre);

            System.out.println("Ingrese su apellido.");
            String apellido = Leer.next().toUpperCase();
            p.setApellido(apellido);

            System.out.println("Ingrese su DNI.");
            long dni = Leer.nextLong();
            p.setDni(dni);

            System.out.println("Ingrese su edad.");
            int edad = Leer.nextInt();
            p.setEdad(edad);

            persona.add(p);
            p.setPersonas(persona);

            System.out.println("Desea ingresar otro perro?.");
            System.out.println("S (SI) - N (NO)");
            resp = Leer.next().toUpperCase();

        } while (resp.equalsIgnoreCase("S"));

    }

    public void mostrarLista() {

        System.out.println();
        System.out.println("***LISTA DE HUMANOS ADOPTIVOS***");
        System.out.println();

        for (Persona aux : persona) {

            System.out.println(aux);

        }

    }

}
