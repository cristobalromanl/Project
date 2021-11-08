package sistema;

public class CreadorAyudante {

    private CreadorAyudante() {
    }

    public static int crearProducto(SistemaCreacion sistema, ProductoTipo tipo) {

        int fallos = 0;
        try {
            sistema.crearProducto(tipo);
        } catch (MaterialException e) {

            System.out.println("No se pudo construir: " + tipo + "\nMateriales faltantes:");
            for (MaterialFaltante item : e.getMateriales())
                System.out.println(item.getTipo() + " - " + item.getCantidad());

            for (MaterialFaltante item : e.getMateriales())
                sistema.agregarMaterial(item.getTipo(), item.getCantidad());

            sistema.crearProducto(tipo);
            fallos++;
        }

        return fallos;
    }

}
