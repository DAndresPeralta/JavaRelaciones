package Prueba.enumeraciones;

/**
 *
 * @author d.andresperalta
 */
public enum Raza {

    BEAGLE(001, "Beagle"), PITBULL(002, "Pitbull"), BORDER_COLLIE(003, "Border Collie");

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
