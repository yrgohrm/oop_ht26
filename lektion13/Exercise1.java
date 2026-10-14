import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

public class Exercise1 {
    void main() {
        Path theFile = Path.of("hello.txt");

        try (BufferedWriter w = Files.newBufferedWriter(theFile, CREATE, APPEND)) {
            w.write("Hello World\n");
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
