package Ejercicio02ConServecio;

/**
 *
 * @author UltraBytes
 */
public class Ejercicio02C {
    
    public static void main(String[] args) {
        
        ServicioJugador Sj = new ServicioJugador();
        
        ServicioRevolver Sr = new ServicioRevolver();
        
        ServicioJuego Sg = new ServicioJuego();
        
        Sg.crearJuego(Sr, Sj);
        
        Sg.mostrarJugadores(Sj);
        
    }
    
}
