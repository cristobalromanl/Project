package sistema;

public class MaterialFaltante {

    private final MaterialTipo tipo;
    private final int cantidad;

    public MaterialFaltante(MaterialTipo tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public MaterialTipo getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

}
