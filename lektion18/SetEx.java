import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        Set<String> data = new TreeSet<>();
        data.add("Hejsan");
        data.add("Hoppsan");
        data.add("Hejsan");
        data.add("Nisse");
        data.add("Apa");

        for (String value : data) {
            System.out.println(value);
        }

        boolean isNisseThere = data.contains("Nisse");
        System.out.println(isNisseThere);

        Set<Integer> data2 = new TreeSet<>(Comparator.reverseOrder());

        data2.add(9);
        data2.add(8);
        data2.add(1);
        data2.add(2);

        for (Integer integer : data2) {
            System.out.println(integer);
        }
    }
}
