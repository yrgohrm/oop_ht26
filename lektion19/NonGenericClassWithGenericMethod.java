import java.util.*;

public class NonGenericClassWithGenericMethod {
    public static <T> boolean allSame(List<T> values, Comparator<T> comp) {
        if (values.isEmpty()) {
            return true;
        }

        T first = values.get(0);
        for (T val : values) {
            if (comp.compare(first, val) != 0) {
                return false;
            }
        }

        return true;
    }

    void main() {
        List<String> l1 = List.of("Hej", "Hej", "Hej");
        List<Integer> l2 = List.of(1, 2, 3, 4);

        allSame(l1, Comparator.naturalOrder());
        allSame(l2, Comparator.naturalOrder());
    }
}
