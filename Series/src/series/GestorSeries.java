package series;

import java.util.ArrayList;
import java.util.Collections;

public class GestorSeries {

    private final ArrayList<Serie> series;

    public GestorSeries() {
        series = new ArrayList<>();
    }

    public void addSerie(String nombre, int temporada) {
        series.add(new Serie(nombre, temporada));
        Collections.sort(series);
    }

    @Override
    public String toString() {
        String texto = "";

        for (Serie item : series)
            texto += item.getNombre() + " - " + item.getTemporada() + "\n";

        return texto;
    }
}
