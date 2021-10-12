package EjercicioEXTRA02;

/**
 *
 * @author d.andresperalta
 */
public class ServicioCine {

    private String[][] sala = new String[8][6];

    public void mostrarCartelera(Pelicula p) {

        System.out.println("***VILLAGE CINES***");
        System.out.println("--------------------");
        System.out.println("***CARTELERA***");
        System.out.println();
        System.out.println(p.toString());

    }

    public void salaDisponibilidad() {

        Cine c = new Cine();

        int val = 8;

        for (int i = 0; i < 8; i++) {
            val--;

            for (int j = 0; j < 6; j++) {

                if (j == 0) {

                    sala[i][j] = ((val + 1) + "A" + " |" + " ");

                }
                if (j == 1) {

                    sala[i][j] = ((val + 1) + "B" + " |" + " ");

                }
                if (j == 2) {

                    sala[i][j] = ((val + 1) + "C" + " |" + " ");

                }
                if (j == 3) {

                    sala[i][j] = ((val + 1) + "D" + " |" + " ");

                }
                if (j == 4) {

                    sala[i][j] = ((val + 1) + "E" + " |" + " ");

                }
                if (j == 5) {

                    sala[i][j] = ((val + 1) + "F" + " |" + " ");

                }
                if (j == 6) {

                    sala[i][j] = ((val + 1) + "G" + " |" + " ");

                }
                if (j == 7) {

                    sala[i][j] = ((val + 1) + "H" + " |" + " ");

                }

            }

        }
        
        char[][] sala1 = new char[8][6];
        
        int fila = 8;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                
                sala1[i][j] = ((char) ('A'+j));
                
            }
            fila--;
        }
        
     
        
       
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                
                System.out.print(sala1[i][j]);
                
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        c.setMatriz(sala);

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 6; j++) {

                System.out.print(" " + sala[i][j] + " ");

            }
            System.out.println();
        }

    }

    public void asignarAsiento(ServicioEspectador e) {

        int fila;
        int columna;
        fila = (int) (Math.random() * 8);
        columna = (int) (Math.random() * 8);
        System.out.println(fila);
        System.out.println(columna);

        for (Espectador aux : e.espectador) {

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 6; j++) {

                    

                    sala[fila][columna] = "X";

                }
            }

        }

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 6; j++) {

                System.out.print(" " + sala[i][j] + " ");

            }
            System.out.println();
        }

    }

}
