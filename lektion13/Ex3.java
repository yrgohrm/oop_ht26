import java.io.*;
import java.nio.file.*;

public class Ex3 {
    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("xxxxx.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.err.println("Det gick fel med filen: " + ex.getMessage() + " " + ex.getClass());
        }
    }
}
