import java.util.*;

public class Merge {
    void main() {

        var names = List.of("Stefan", "Martin", "Martin", "Emma");
        Map<String, Integer> nameCount = new HashMap<>();

        for (String name : names) {
            nameCount.merge(name, 1, Integer::sum);
        }

        for (var entry : nameCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
