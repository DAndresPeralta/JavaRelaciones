package Ejercicio02ConServecio;

/**
 *
 * @author UltraBytes
 */
public class ServicioRevolver {

    public Revolver llenarRevolver() {

        int val1;
        int val2;

        Revolver r = new Revolver();

        do {

//            val1 = (int) (Math.random() * 7);
//
//            val2 = (int) (Math.random() * 7);
            val1 = 3;

            val2 = 4;

            r.setPosicionActual(val1);

            r.setPosicionAgua(val2);

        } while (r.getPosicionActual() > r.getPosicionAgua());

        System.out.println(r.getPosicionActual());
        System.out.println(r.getPosicionAgua());

        return r;

    }

    public boolean mojar(Revolver r) {

        boolean resp = false;

        if (r.getPosicionActual() == r.getPosicionAgua()) {
            resp = true;

        } else if (r.getPosicionActual() != r.getPosicionAgua()) {
            resp = false;
        }

        return resp;
    }

    public void siguienteChorro(Revolver r) {

        r.setPosicionActual(r.getPosicionActual() + 1);

    }

    public void ToString(Revolver r) {

        System.out.println("Posición Actual: " + r.getPosicionActual());
        System.out.println("Posición Agua: " + r.getPosicionAgua());

    }

//    public void ejecucion() {
//        
//        Revolver r = llenarRevolver();
//        
//        mojar(r);
//        
//        siguienteChorro(r);
//        
//    }
}
