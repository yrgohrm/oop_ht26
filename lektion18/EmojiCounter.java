import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class EmojiCounter {
    private static void main(String[] args) throws IOException {
        Path in = Path.of(args.length > 0 ? args[0] : "emojitext.txt");
        Path out = Path.of(args.length > 1 ? args[1] : "emojicount.txt");

        String data = Files.readString(in, StandardCharsets.UTF_8);

        // \X matches a full grapheme cluster, so multi-code-point emojis count as one
        Matcher m = Pattern.compile("\\X").matcher(data);
        Map<String, Integer> counter = new HashMap<>();
        while (m.find()) {
            counter.merge(m.group(), 1, Integer::sum);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(counter.entrySet());
        entries.sort(Map.Entry.<String, Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()));

        try (PrintWriter w = new PrintWriter(Files.newBufferedWriter(out, StandardCharsets.UTF_8))) {
            w.printf("%-12s | %-6s | %s%n", "Character", "Count", "Code points");
            w.println("-".repeat(13) + "+" + "-".repeat(8) + "+" + "-".repeat(20));
            for (var e : entries) {
                w.printf("%-12s | %6d | %s%n", display(e.getKey()), e.getValue(), codePoints(e.getKey()));
            }
        }
        System.out.println("Wrote " + entries.size() + " distinct characters to " + out);
    }

    private static String display(String s) {
        return switch (s) {
            case " " -> "<space>";
            case "\n", "\r\n" -> "<newline>";
            case "\r" -> "<CR>";
            case "\t" -> "<tab>";
            default -> s;
        };
    }

    private static String codePoints(String s) {
        StringJoiner j = new StringJoiner(" ");
        s.codePoints().forEach(cp -> j.add(String.format("U+%04X", cp)));
        return j.toString();
    }
}
