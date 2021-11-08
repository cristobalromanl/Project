package series;

public class Series {

    public static void main(String[] args) {

        GestorSeries gestor = new GestorSeries();

        gestor.addSerie("Game of Thrones", 4);
        gestor.addSerie("Stranger Things", 2);
        gestor.addSerie("Breaking Bad", 3);
        gestor.addSerie("Dark", 2);
        gestor.addSerie("Stranger Things", 1);
        gestor.addSerie("Game of Thrones", 2);
        gestor.addSerie("Breaking Bad", 2);
        gestor.addSerie("Game of Thrones", 3);
        gestor.addSerie("Stranger Things", 3);
        gestor.addSerie("Dark", 1);
        gestor.addSerie("Breaking Bad", 1);
        gestor.addSerie("Game of Thrones", 1);
        gestor.addSerie("Dr. House", 1);

        System.out.println(gestor);

    }

}
