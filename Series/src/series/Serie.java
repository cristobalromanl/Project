package series;

public class Serie implements Comparable<Serie> {

    private String nombre;
    private int temporada;

    public Serie(String nombre, int temporada) {
        this.nombre = nombre;
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public int compareTo(Serie t) {

        int valor = nombre.compareTo(t.nombre);

        if (valor == 0)
            return temporada - t.temporada;
        else
            return valor;

    }

}
