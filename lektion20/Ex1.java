import java.util.*;
import java.util.function.*;

public class Ex1 {
    public static void main(String[] args) {
        List<String> names = List.of("Hampus", "   ", "Nahid", "Anders", "Eva");

        names.stream()
                .filter(Predicate.not(String::isBlank))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        var newNames = names.stream()
                .filter(Predicate.not(String::isBlank))
                .map(String::toUpperCase)
                .toList();

        System.out.println(newNames);
    }
}
