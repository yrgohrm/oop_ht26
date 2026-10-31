import java.io.*;
import java.nio.file.*;
import java.util.*;

public class LetterCounter {
    void main() throws IOException {
        String data = Files.readString(Path.of("text.txt"));

        Map<Character, Integer> counter = new TreeMap<>();

        for (char ch : data.toCharArray()) {
            int count = counter.getOrDefault(ch, 0);
            counter.put(ch, count+1);
            // counter.merge(ch, 1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
