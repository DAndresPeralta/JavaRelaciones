package Ejercicio02;

import Ejercicio02.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioJugador {
    
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Jugador> participante = new ArrayList<>();
    
    public void jugadores(int cantidadJugadores) {
        
        if (cantidadJugadores > 6) {
            cantidadJugadores = 6;
        }
        
        for (int i = 0; i < cantidadJugadores; i++) {
            Jugador j = new Jugador();
            System.out.println("Ingrese el nombre del jugador " + (i + 1));
            String nombre = Leer.next();
            j.setNombre(nombre);
            j.setId((int) (Math.random() * 100));
            participante.add(j);
        }
        
    }
    
    public void ejecucion() {
        
        System.out.println("Ingrese la cantidad de jugadores");
        int jugadores = Leer.nextInt();
        
        jugadores(jugadores);
        
    }
    
}
