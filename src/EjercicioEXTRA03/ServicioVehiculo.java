package EjercicioEXTRA03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioVehiculo {

    List<Vehiculo> vehiculos = new ArrayList<>();

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public void crearVehiculo() {

        String resp;

        do {

            Vehiculo v = new Vehiculo();

            System.out.print("Marca: ");
            String marca = Leer.next();
            v.setMarca(marca);

            System.out.print("Modelo: ");
            String modelo = Leer.next();
            v.setModelo(modelo);

            System.out.print("Año: ");
            int anio = Leer.nextInt();
            v.setAnio(anio);

            System.out.print("Número de motor: ");
            long numMotor = Leer.nextLong();
            v.setNumMotor(numMotor);

            System.out.print("Número de chasis: ");
            long numChasis = Leer.nextLong();
            v.setNumChasis(numChasis);

            System.out.print("Color: ");
            String color = Leer.next();
            v.setColor(color);

            System.out.println("Tipo: ");
            System.out.println("S (Sedan) - C (Cabriolet) - P (Pick-Up) - M ()Monovolumen - O (otro).");
            char tipo = Leer.next().toUpperCase().charAt(0);
            v.setTipo(tipo);

            System.out.println("Desea agregar otro cliente?");
            System.out.println("S (SI) - N (NO).");
            resp = Leer.next().toUpperCase();

            vehiculos.add(v);

        } while (resp.equalsIgnoreCase("S"));

    }

}
