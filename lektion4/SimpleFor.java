public class SimpleFor {
    public static void main(String[] args) {
        // for (int i = 0; i <= 5; i++) {
        // System.out.println(i);
        // }

        // for (int i = 1; i <= 256; i = i * 2) {
        // System.out.println("Ett tal " + i);
        // }

        for (int i = (int) (Math.random() * 6),
                j = (int) (Math.random() * 6); i != 5
                        || j != 5; i = (int) (Math.random() * 6), j = (int) (Math.random() * 6)) {
            System.out.printf("%d %d\n", i, j);
        }

    }
}
