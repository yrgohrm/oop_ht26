import java.util.*;

public class FuncInterfaceEx {
    void main() {
        var names = List.of("Kalle", "Pelle", "Anna", "Lena", "Niklas", "Bosse");

        names.stream()
                .sorted(new NameSorter())
                .forEach(System.out::println);

        System.out.println();

        names.stream()
                .sorted((o1, o2) -> {
                    if (o1.equals("Kalle")) {
                        return -1;
                    } else if (o2.equals("Kalle")) {
                        return 1;
                    } else {
                        return o1.compareTo(o2);
                    }
                })
                .forEach(System.out::println);
    }
}
