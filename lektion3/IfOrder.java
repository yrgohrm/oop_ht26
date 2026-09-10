import java.util.Scanner;

public class IfOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hur mycket vill du lasta? (kg)");
        int weight = scanner.nextInt();

        // completely in the wrong order!!!!
        if (weight < 5000) {
            System.out.println("Kör det i lastbilen");
        }
        else if (weight < 1000) {
            System.out.println("Kör det i skåpbilen.");
        }
        else if (weight < 100) {
            System.out.println("Kör det i bilen.");
        }
        else if (weight < 10) {
            System.out.println("Bär det själv.");
        }
        else {
            System.out.println("Boka en specialtransport.");
        }
    }
}
