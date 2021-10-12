package EjercicioEXTRA03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioCliente {

    List<Cliente> clientes = new ArrayList<>();

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public void crearCliente() {

        String resp;

        do {

            Cliente c = new Cliente();

            System.out.print("Nombre: ");
            String nombre = Leer.next();
            c.setNombre(nombre);

            System.out.print("Apellido: ");
            String apellido = Leer.next();
            c.setApellido(apellido);

            System.out.print("DNI: ");
            long dni = Leer.nextLong();
            c.setDni(dni);

            System.out.print("Mail: ");
            String mail = Leer.next();
            c.setMail(mail);

            System.out.print("Domicilio: ");
            String domicilio = Leer.next();
            c.setDomicilio(domicilio);

            System.out.print("Telefono: ");
            long tel = Leer.nextLong();
            c.setTel(tel);

            System.out.println("Desea agregar otro cliente?");
            System.out.println("S (SI) - N (NO).");
            resp = Leer.next().toUpperCase();

            clientes.add(c);

        } while (resp.equalsIgnoreCase("S"));

    }

}
