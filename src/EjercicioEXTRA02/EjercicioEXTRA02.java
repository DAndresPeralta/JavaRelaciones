package EjercicioEXTRA02;

/**
 *
 * @author d.andresperalta
 */
public class EjercicioEXTRA02 {

    public static void main(String[] args) {

        ServicioPelicula p1 = new ServicioPelicula();
        ServicioEspectador e1 = new ServicioEspectador();
        ServicioCine c1 = new ServicioCine();

        Pelicula P = p1.crearPelicula();

        c1.mostrarCartelera(P);
        
        c1.salaDisponibilidad();
        
        System.out.println();
        
        c1.asignarAsiento(e1);

    }

}
