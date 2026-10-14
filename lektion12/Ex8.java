import java.io.*;
import java.nio.file.*;

public class Ex8 {
    private static void readStuff() throws IOException {
        Files.readString(Path.of("foo.txt"));
    }

    void main() {
        try {
            readStuff();
        } catch (IOException e) {
            System.err.println("Det gick snett... " + e.getMessage());
        }
    }
}
