package Ejercicio02ConServecio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author UltraBytes
 */
public class ServicioJuego {
    
    public void crearJuego(ServicioRevolver r, ServicioJugador j) {
        
        Revolver r1 = r.llenarRevolver();

//        Jugador j1 = j.llenarJugador();
        j.llenarJugador();
        
        System.out.println(r1.getPosicionActual());
        System.out.println(r1.getPosicionAgua());
        
        do {
            
            for (Jugador aux : j.jugadores) {
                
                if (r.mojar(r1) == true) {
                    
                    aux.setMojado(true);
                    break;
                    
                } else if (r.mojar(r1) == false) {
                    
                    aux.setMojado(false);
                    r.siguienteChorro(r1);
                    
                }
                System.out.println(r1.getPosicionActual());
                System.out.println(r1.getPosicionAgua());
                
            }
            
        } while (r.mojar(r1) == false);
        
    }
    
    public void mostrarJugadores(ServicioJugador j) {
        
        for (Jugador aux : j.jugadores) {
            
            System.out.println(aux);
            
        }
        
    }
    
}
