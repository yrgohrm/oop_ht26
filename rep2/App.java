import java.util.*;

public class App {
    void foo(int size) {
        int[] arr = new int[size];
        // ...
    }

    void main() {
        foo(10);
        foo(20);

        List<String> foo = new ArrayList<>(List.of("hej", "hopp", "alla"));
        foo.add("!!!!!");
        System.out.println(foo);
    }
}
