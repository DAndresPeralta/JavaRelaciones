package EjercicioEXTRA02R;

/**
 *
 * @author d.andresperalta
 */
public class ServicioCine {

    private Asiento[][] asientos = new Asiento[8][6];

    public void rellenarButaca() {

        Cine c = new Cine();

        int fila = 8;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {

                asientos[i][j] = new Asiento((char) ('A' + j), fila);
                c.setAsientos(asientos);

            }
            fila--;
        }

    }

    public boolean hayLugar() {

        boolean hayLugar = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {

                if (!asientos[i][j].ocupado()) {
                    hayLugar = true;
                    break;
                }

            }
        }
        return hayLugar;

    }
    
  

}
