import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Greet> greetList = List.of(
                new Greet("Anna Bauer", 11, true),
                new Greet("Vittorio De-Marzi", 34, false),
                new Greet("Zana Prka", 18, true),
                new Greet("Bob Baumeister", 55, false),
                new Greet("Hugo Maier", 10, false),
                new Greet("Beate Strohmeier", 7, true)
        );

        // Vornamen aller volljährigen Personen in einer Liste
        List<String> firstnamesOfAdults = greetList
                .stream()
                .filter(greet -> greet.getAlter() >= 18)
                .map(greet -> greet.getFirstname())
                .collect(Collectors.toList());
        System.out.println(firstnamesOfAdults);
        // Grußformel für alle weiblichen Personen in die Konsole ausgeben
        greetList
            .stream()
            .filter(Greet::isFemale)
            .forEach(System.out::println);
        // Grußformel der Ältesten Person in einer String-Variable speichern
        String greetingOldest = greetList
                .stream()
                .max(Comparator.comparing((greet) -> greet.getAlter()))
                .get()
                .greetMe();
        System.out.println(greetingOldest);
        // Durchschnittsalter in einem Double
        double avgAge = greetList
                .stream()
                .mapToInt(g -> g.getAlter())
                .average()
                .getAsDouble();
        System.out.println(avgAge);
        // Liste der Nachnamen aller Personen
        List<String> lastnames = greetList.stream().map(greet -> greet.getLastname()).collect(Collectors.toList());
        System.out.println(lastnames);
    }
}
