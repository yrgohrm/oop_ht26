import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in ett tal: ");
        int num = scanner.nextInt();

        if (num > 1000) {
            System.out.println("Ett stort tal!");
        } else if (num > 500) {
            System.out.println("Ett ganska stort tal.");
        } else {
            System.out.println("Ett helt vanligt tal :(");
        }

        if (num < 0) {
            System.out.println("Det var negativt också.");
        }

        scanner.close();
    }
}
