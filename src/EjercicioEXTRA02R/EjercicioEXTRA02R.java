package EjercicioEXTRA02R;

/**
 *
 * @author d.andresperalta
 */
public class EjercicioEXTRA02R {

    public static void main(String[] args) {

        ServicioCine c1 = new ServicioCine();
        ServicioPelicula p1 = new ServicioPelicula();
        Asiento a1 = new Asiento();
        Pelicula pelicula1 = new Pelicula();

        c1.rellenarButaca();
        p1.crearPelicula();
        p1.tieneEdad(a1, pelicula1);
    }

}
