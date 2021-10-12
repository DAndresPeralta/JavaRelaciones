package EjercicioEXTRA01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioPerro {

    ArrayList<Perro> perritos = new ArrayList<>();

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPerro() {

        String resp;

        do {

            Perro p1 = new Perro();

            System.out.println("Ingrese el nombre del perro.");
            String nombre = Leer.next().toUpperCase();
            p1.setNombre(nombre);

            System.out.println("Ingrese la raza del perro.");
            String raza = Leer.next().toUpperCase();
            p1.setRaza(raza);

            System.out.println("Ingrese la edad del perro (meses).");
            int edad = Leer.nextInt();
            p1.setEdad(edad);

            perritos.add(p1);

            System.out.println("Desea ingresar otra persona?.");
            System.out.println("S (SI) - N (NO)");
            resp = Leer.next().toUpperCase();

        } while (resp.equalsIgnoreCase("S"));

    }

    public void mostrarListaDisponible() {

        System.out.println();
        System.out.println("***LISTA PERROS EN ADOPCION***");
        System.out.println();

        for (Perro aux : perritos) {

            System.out.println(aux);

        }

    }

    public void mostrarListaAdopcion() {

        System.out.println();
        System.out.println("***LISTA DE FAMILIAS FORMADAS.***");
        System.out.println();

        for (Perro aux : perritos) {

            System.out.println(aux);

        }

    }

    public void adopcion(ServicioPersona p) {

        String resp;
        int cont = 0;

        do {

            System.out.println("Ingrese el apellido de la persona");
            String apellido = Leer.next().toUpperCase();

            for (Persona auxh : p.persona) {

                if (auxh.getApellido().equals(apellido)) {

                    System.out.println("Ingrese el nombre del perro a adoptar.");
                    String nombre = Leer.next().toUpperCase();

                    for (Perro auxp : perritos) {

                        if (auxp.getNombre().equals(nombre)) {

                            if (auxp.isAdoptado() == false) {

                                cont++;
                                auxp.getPersona().add(auxh);
                                auxp.setAdoptado(true);

                            } else if (auxp.isAdoptado() == true) {
                                System.out.println("El perrito ya tiene humano.");
                            }

                        }

                    }

                }

            }

            System.out.println("Desea generar otra adopción?.");
            System.out.println("S (SI) - N (NO)");
            resp = Leer.next().toUpperCase();

            System.out.println(cont);
            System.out.println(perritos.size());

        } while (resp.equalsIgnoreCase("S") && (cont != perritos.size()));

        if (cont == perritos.size()) {
            System.out.println("No quedan perritos en adopción.");
        }

    }

}
