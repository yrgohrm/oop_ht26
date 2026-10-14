import java.io.*;
import java.nio.file.*;

public class ExOpenOptions {
    void main() throws IOException {
        Path theFile = Path.of("yy.txt");
        try (BufferedWriter w = Files.newBufferedWriter(theFile, StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            w.write("blablabla");
        }
    }
}
