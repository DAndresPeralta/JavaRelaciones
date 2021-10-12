package EjercicioEXTRA02;

/**
 *
 * @author d.andresperalta
 */
public class Cine {

    private String pelicula;
    private int precioEntrada;
    private String[][] matriz;
    private Espectador clientes;

    public Cine() {
    }

    public Cine(String pelicula, int precioEntrada, String[][] matriz, Espectador clientes) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.matriz = matriz;
        this.clientes = clientes;
    }

    public void setClientes(Espectador clientes) {
        this.clientes = clientes;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String getPelicula() {
        return pelicula;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public Espectador getClientes() {
        return clientes;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + ", matriz=" + matriz + ", clientes=" + clientes + '}';
    }

}
