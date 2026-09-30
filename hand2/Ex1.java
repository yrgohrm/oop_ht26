import java.util.*;

public class Ex1 {
    /**
     * Find the maximum value in the array.
     * 
     * @param array the array of all numbers to search in
     * @return the highest number in the array
     */
    public static int maximum(int[] array) {
        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static int maximum(List<Integer> list) {
        int max = list.getFirst();

        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    void main() {
        int[] test1 = {1, 5, 99};
        int res1 = maximum(test1);

        if (res1 != 99) {
            System.out.println("Vår kod är fel!");
        }

        int[] test2 = { Integer.MIN_VALUE, Integer.MAX_VALUE };
        int res2 = maximum(test2);

        if (res2 != Integer.MAX_VALUE) {
            System.out.println("Vår kod är fel! Svaret blev: " + res2);
        }

        List<Integer> test3 = List.of(1, 2, 3, 99, 12, 981, 1, -23);
        int res3 = maximum(test3);

        if (res3 != 981) {
            System.out.println("Vår kod är fel!");
        }

    }
}
