package Ejercicio01;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        Perro p1 = new Perro("Frida", "Callejero", 1, "Pequeño");

        Perro p2 = new Perro("Charly", "Cocker", 2, "Mediano");

        Persona h1 = new Persona("Andres", "Peralta", 28, 37738121, p2);

        Persona h2 = new Persona("Martha", "Oropel", 58, 16102625, p1);

        System.out.println(h1.toString());

        System.out.println(h2.toString());

    }

}
