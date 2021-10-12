package Ejercicio01R;

/**
 *
 * @author d.andresperalta
 */
public enum Raza {
    BEAGLE(001, "beagle"), CANICHE(002, "caniche"), CALLEJERO(003, "callejero");

    private Integer codigo;
    private String valor;

    private Raza(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }

}
