import java.util.*;

public class ReadData {
    void main() {
        Scanner scanner = new Scanner(System.in);

        int num = getNum(scanner);

        System.out.println(num);
    }

    private int getNum(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Skriv in ett tal:");
                return scanner.nextInt();
            } catch (InputMismatchException ex) {
                scanner.next();
                System.out.println("Snälla, skriv ett tal...");
            }
        }
    }
}
