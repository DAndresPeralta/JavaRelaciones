package Ejercicio03;

import java.util.ArrayList;

/**
 *
 * @author d.andresperalta
 */
public class ServicioCarta {

    ArrayList<Carta> mazo = new ArrayList<>();

    public void crearMaso() {

        int cont = 0;

        for (int i = 0; i < 12; i++) {

            if (i == 7) {

                i = 9;

            }

            mazo.add(new Carta((i+1), Palo.BASTO));
            mazo.add(new Carta((i+1), Palo.COPA));
            mazo.add(new Carta((i+1), Palo.ESPADA));
            mazo.add(new Carta((i+1), Palo.ORO));

        }

    }
    
    public void mostrar(){
        
        for (Carta aux : mazo) {
            
            System.out.println(aux);
            
        }
        
        
    }

}
