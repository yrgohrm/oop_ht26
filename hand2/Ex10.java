import java.util.*;

public class Ex10 {
    public static void reverse(int[] arr) {
        int[] arr2 = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, ++j) {
            arr2[j] = arr[i];
        }

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = arr2[i];
        }        
    }

    public static void reversePro(int[] arr) {

        for (int end = arr.length - 1, start = 0; end >= arr.length / 2; end--, ++start) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }

    }

    void main() {

        int[] arr = {1, 2, 3, 4, 5, 6};
        reversePro(arr);

        System.out.println(Arrays.toString(arr));
    }
}
