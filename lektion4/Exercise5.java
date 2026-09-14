import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in längden i mm:");
        int length = scanner.nextInt();

        System.out.println("Skriv in bredden i mm:");
        int width = scanner.nextInt();

        System.out.println("Skriv in tjockleken i mm:");
        int thickness = scanner.nextInt();

        boolean isLengthBad = length > 600 || length < 140;
        boolean isThicknessMaxBad = thickness > 100;
        boolean isTotalBad = length + width + thickness > 900;
        boolean isWidthMinBad = width < 90;

        boolean isBad = isLengthBad ||
                isThicknessMaxBad ||
                isTotalBad ||
                isWidthMinBad;

        if (isBad) {
            System.out.println("Brevet är INTE ok.");
        } else {
            System.out.println("Brevet är ok");
        }
    }
}
