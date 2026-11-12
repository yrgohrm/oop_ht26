import java.util.*;
import java.util.stream.*;

public class ExGatherer {
    void main() {

        var words = List.of("hej", "på", "dig",
                "vem", "är", "du", "jag", "är", "glad");

        var trippleLines = words.stream()
                .gather(Gatherers.windowFixed(3))
                .map(ln -> String.join(" ", ln))
                .toList();

        System.out.println(trippleLines);

    }
}
