package EjercicioEXTRA03;

/**
 *
 * @author d.andresperalta
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private long numMotor;
    private long numChasis;
    private String color;
    private char tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, long numMotor, long numChasis, String color, char tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numMotor = numMotor;
        this.numChasis = numChasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public long getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(long numMotor) {
        this.numMotor = numMotor;
    }

    public long getNumChasis() {
        return numChasis;
    }

    public void setNumChasis(long numChasis) {
        this.numChasis = numChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numMotor=" + numMotor + ", numChasis=" + numChasis + ", color=" + color + ", tipo=" + tipo + '}';
    }

}
