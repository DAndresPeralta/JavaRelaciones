package Ejercicio02;

/**
 *
 * @author d.andresperalta
 */
public class ServicioRevolver {

    public Revolver llenarRevolver() {

        int val1 = (int) (Math.random() * 7);
        int val2 = (int) (Math.random() * 7);

        Revolver r = new Revolver();

        r.setPosicionActual(val1);
        r.setPosicionAgua(val2);
        
        return r;

    }

    public void siguienteChorro(Revolver r) {
      

        r.setPosicionActual(r.getPosicionActual() + 1);

    }

    public boolean mojar(Revolver r) {

        return (r.getPosicionActual() == r.getPosicionAgua());

    }

    public void mostrar(Revolver r) {

        System.out.println(r.getPosicionActual());
        System.out.println(r.getPosicionAgua());
    }
    
    public void ejecucion(){
        
        Revolver r = llenarRevolver();
        
        
        
        
    }

}
