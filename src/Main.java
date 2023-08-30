import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Videogames> videogamesArray = new ArrayList<Videogames>();

        Videogames videogames1 = new Videogames(5677, "Call of Duty", "Playstation 2", 4, "Acción");
        Videogames videogames2 = new Videogames(5655, "Medal of Honor", "Nintendo 64", 2, "Acción");
        Videogames videogames3 = new Videogames(5211, "Battlefield", "PC", 1, "Guerra");
        Videogames videogames4 = new Videogames(5699, "Need for Speed", "Playstation 2", 2, "Deportes");
        Videogames videogames5 = new Videogames(5933, "Assassin's Creed", "PC", 1, "Aventura");

        videogamesArray.add(videogames1);
        videogamesArray.add(videogames2);
        videogamesArray.add(videogames3);
        videogamesArray.add(videogames4);
        videogamesArray.add(videogames5);


        // for each
        for (Videogames videogames : videogamesArray) {
            System.out.println("Título: " + videogames.getTitulo());
            System.out.println("Consola: " + videogames.getConsola());
            System.out.println("Cantidad de jugadores: " + videogames.getCantidadJugadores());
        }

        System.out.println("------------------");

        videogames1.setTitulo("CS GO");
        videogames1.setCantidadJugadores(10);
        videogames3.setTitulo("Pokemon");
        videogames3.setCantidadJugadores(5);

        for (Videogames videogames : videogamesArray) {
            System.out.println("Título: " + videogames.getTitulo());
            System.out.println("Consola: " + videogames.getConsola());
            System.out.println("Cantidad de jugadores: " + videogames.getCantidadJugadores());
        }

        System.out.println("------------------");

        for (Videogames videogames : videogamesArray) {
            if (videogames.getConsola().equalsIgnoreCase("Nintendo 64")) {
                System.out.println("Título: " + videogames.getTitulo());
                System.out.println("Consola: " + videogames.getConsola());
                System.out.println("Cantidad de jugadores: " + videogames.getCantidadJugadores());
            }
        }
    }
}