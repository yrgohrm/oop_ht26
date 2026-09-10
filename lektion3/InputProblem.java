import java.util.Scanner;

public class InputProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int data = scanner.nextInt();
        scanner.nextLine();
        
        String str = scanner.nextLine();

        System.out.println("data: " + data);
        System.out.println("str: " + str);

        scanner.close();
    }
}
