import java.io.*;
import java.nio.file.*;

public class JavaChecker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Must give a file to check");
            return;
        }

        String fileName = args[0];

        if (!fileName.endsWith(".class")) {
            System.err.println("Not a java file");
            return;
        }

        Path filePath = Path.of(fileName);
        try (InputStream is = Files.newInputStream(filePath)) {
            byte[] data = new byte[4];
            int read = is.read(data);

            if (read == 4 &&
                data[0] == (byte)0xCA && 
                data[1] == (byte)0xFE && 
                data[2] == (byte)0xBA && 
                data[3] == (byte)0xBE) {
                System.out.println("Ja! En klassfil!");
            }
            else {
                System.err.println("inte en klassfil");
            }

        } catch (IOException ex) {
            System.err.println("Något gick fel: " + ex.getMessage());
        }
    }
}
