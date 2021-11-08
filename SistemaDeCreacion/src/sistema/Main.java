package sistema;

public class Main {

    public static void main(String[] args) {

        SistemaCreacion sistema = new SistemaCreacion();

        sistema.agregarMaterial(MaterialTipo.LANA, 5);
        sistema.agregarMaterial(MaterialTipo.AGUA, 2);
        sistema.agregarMaterial(MaterialTipo.MADERA, 10);
        sistema.agregarMaterial(MaterialTipo.PIEDRA, 5);
        sistema.agregarMaterial(MaterialTipo.HARINA, 1);

        int fallos = 0;
        fallos += CreadorAyudante.crearProducto(sistema, ProductoTipo.SILLA);
        fallos += CreadorAyudante.crearProducto(sistema, ProductoTipo.REFUGIO);
        fallos += CreadorAyudante.crearProducto(sistema, ProductoTipo.GORRO);
        fallos += CreadorAyudante.crearProducto(sistema, ProductoTipo.SILLA);
        fallos += CreadorAyudante.crearProducto(sistema, ProductoTipo.PAN);

        System.out.println("Cantidad de veces sin materiales: " + fallos);
        System.out.println("Materiales sobrantes:\n" + sistema);
    }

}
