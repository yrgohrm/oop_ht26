import java.util.stream.*;

public class ExGatherer2 {
    void main() {
        var words = Stream.of("hejsan", "på", "dig",
                "din", "glada", "buse");

        var result = words.gather(
                Gatherer.of((_, element, downstream) -> {
                    if (element.length() <= 3) {
                        downstream.push(element.length());
                    }
                    return true;
                })).toList();

        System.out.println(result);

    }
}
