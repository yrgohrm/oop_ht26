import java.util.Scanner;

public class IfChain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        if (data > 22) {
            System.out.println("Data is too big");
        } else if (data < 3) {
            System.out.println("Data is too small");
        } else {
            System.out.println("Data is just right");
        }

    }
}
