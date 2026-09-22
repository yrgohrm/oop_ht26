import java.util.Scanner;

public class Ex4Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv in en mening: ");
        String line = scanner.nextLine();

        System.out.print("Skriv in en bokstav: ");
        String character = scanner.nextLine();

        char charToFind = character.charAt(0);

        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            if (currentChar == charToFind) {
                count++;
            }
        }

        System.out.println("Bokstaven fanns " + count + " gånger");
    }
}
