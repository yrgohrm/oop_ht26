import java.io.*;
import java.nio.file.*;

public class ExPath {
    void main() throws IOException {
        Path path = Path.of("c:\\Projekt\\oop_ht26\\lektion13\\foo\\bar\\fil.txt");
        String contents = Files.readString(path);
        System.out.println(contents);
    }
}
