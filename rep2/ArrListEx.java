import java.util.*;

public class ArrListEx {
    void main() {
        Scanner scanner = new Scanner(System.in);

        List<String> words = new ArrayList<>();

        while (true) {
            System.out.println("Mata in ett ord, tomt = avsluta");
            String word = scanner.nextLine();
            if (word.isBlank()) {
                break;
            }

            words.add(word);
        }

        for (String word : words.reversed()) {
            System.out.println(word);
        }
    }

    // void main() {
    //     Scanner scanner = new Scanner(System.in);

    //     String[] words = new String[????];

    //     while (true) {
    //         System.out.println("Mata in ett ord, tomt = avsluta");
    //         String word = scanner.nextLine();
    //         if (word.isBlank()) {
    //             break;
    //         }

    //         words.add(word);
    //     }

    //     for (String word : words.reversed()) {
    //         System.out.println(word);
    //     }
    // }
}
