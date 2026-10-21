package se.yrgo.oop.rep;

import java.io.*;
import java.nio.file.*;

public class FileTest {
    void main() throws IOException {

        Path path = Path.of("foo.txt");

        try (BufferedReader r = Files.newBufferedReader(path)) {
            System.out.println("funkar: " +  r.readLine());
        } catch (NoSuchFileException _) {
            Files.createFile(path);
        }

    }
}
