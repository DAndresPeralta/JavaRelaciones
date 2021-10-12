package EjercicioEXTRA02R;

/**
 *
 * @author d.andresperalta
 */
public class Cine {

    private Asiento asientos[][];
    private double precio;
    private Pelicula pelicula;

    public Cine() {
    }

    public Cine(int filas, int columnas, double precio, Pelicula pelicula) {

        asientos = new Asiento[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;

    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
 

    @Override
    public String toString() {
        return "Cine{" + "asientos=" + asientos + ", precio=" + precio + ", pelicula=" + pelicula + '}';
    }

}
