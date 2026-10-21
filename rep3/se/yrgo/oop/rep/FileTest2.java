package se.yrgo.oop.rep;

import java.io.*;
import java.nio.file.*;

public class FileTest2 {
    void main() throws IOException {

        Path path = Path.of("foo2.txt");
        try (BufferedWriter w = Files.newBufferedWriter(path)) {
            w.write("Hello, world" + Math.random());
        }
    }
}
