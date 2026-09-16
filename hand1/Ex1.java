import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mata in första talet: ");
        int num1 = scanner.nextInt();

        System.out.print("Mata in andra talet: ");
        int num2 = scanner.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        for (int i = min; i <= max; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
