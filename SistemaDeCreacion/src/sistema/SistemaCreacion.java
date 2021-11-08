package sistema;

import java.util.ArrayList;

public class SistemaCreacion {

    private int madera;
    private int piedra;
    private int cuerda;
    private int lana;
    private int agua;
    private int harina;

    public void agregarMaterial(MaterialTipo tipo, int cantidad) {

        switch (tipo) {
            case AGUA:
                agua += cantidad;
                break;
            case CUERDA:
                cuerda += cantidad;
                break;
            case HARINA:
                harina += cantidad;
                break;
            case LANA:
                lana += cantidad;
                break;
            case MADERA:
                madera += cantidad;
                break;
            case PIEDRA:
                piedra += cantidad;
                break;
        }
    }

    public void crearProducto(ProductoTipo tipo) throws MaterialException {

        ArrayList<MaterialFaltante> materiales = new ArrayList<>();

        switch (tipo) {
            case SILLA:
                if (madera < 2)
                    materiales.add(new MaterialFaltante(MaterialTipo.MADERA, 2 - madera));

                if (piedra < 1)
                    materiales.add(new MaterialFaltante(MaterialTipo.PIEDRA, 1));

                if (materiales.isEmpty()) {
                    madera -= 2;
                    piedra--;
                }
                break;
            case GORRO:
                if (lana < 2)
                    materiales.add(new MaterialFaltante(MaterialTipo.LANA, 2 - lana));

                if (cuerda < 1)
                    materiales.add(new MaterialFaltante(MaterialTipo.CUERDA, 1));

                if (materiales.isEmpty()) {
                    lana -= 2;
                    cuerda--;
                }
                break;
            case HACHA:
                if (madera < 1)
                    materiales.add(new MaterialFaltante(MaterialTipo.MADERA, 1));

                if (piedra < 1)
                    materiales.add(new MaterialFaltante(MaterialTipo.PIEDRA, 1));

                if (materiales.isEmpty()) {
                    madera--;
                    piedra--;
                }
                break;
            case MESA:
                if (madera < 4)
                    materiales.add(new MaterialFaltante(MaterialTipo.MADERA, 4 - madera));

                if (piedra < 1)
                    materiales.add(new MaterialFaltante(MaterialTipo.PIEDRA, 1));

                if (materiales.isEmpty()) {
                    madera -= 4;
                    piedra--;
                }
                break;
            case PAN:
                if (agua < 1)
                    materiales.add(new MaterialFaltante(MaterialTipo.AGUA, 1));

                if (harina < 1)
                    materiales.add(new MaterialFaltante(MaterialTipo.HARINA, 1));

                if (materiales.isEmpty()) {
                    agua--;
                    harina--;
                }
                break;
            case REFUGIO:
                if (piedra < 10)
                    materiales.add(new MaterialFaltante(MaterialTipo.PIEDRA, 10 - piedra));

                if (madera < 5)
                    materiales.add(new MaterialFaltante(MaterialTipo.MADERA, 5 - madera));

                if (cuerda < 2)
                    materiales.add(new MaterialFaltante(MaterialTipo.CUERDA, 2 - cuerda));

                if (agua < 1)
                    materiales.add(new MaterialFaltante(MaterialTipo.AGUA, 1));

                if (materiales.isEmpty()) {
                    piedra -= 10;
                    madera -= 5;
                    cuerda -= 2;
                    agua--;
                }

                break;
        }

        if (!materiales.isEmpty())
            throw new MaterialException(materiales);
    }

    @Override
    public String toString() {
        return "Madera:" + madera
                + "\nPiedra:" + piedra
                + "\nCuerda:" + cuerda
                + "\nLana:" + lana
                + "\nAgua:" + agua
                + "\nHarina:" + harina;
    }

}
