package EjercicioEXTRA01;

/**
 *
 * @author d.andresperalta
 */
public class EjercicioEXTRA01 {

    public static void main(String[] args) {

        ServicioPersona Sh = new ServicioPersona();
        ServicioPerro Sp = new ServicioPerro();

        Sh.crearPersona();
        Sh.mostrarLista();

        Sp.crearPerro();
        Sp.mostrarListaDisponible();

        Sp.adopcion(Sh);
        Sp.mostrarListaAdopcion();

    }

}
