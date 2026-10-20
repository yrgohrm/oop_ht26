import java.util.*;

public class WrapperEx {
    void main() {
        List<Integer> foo = new ArrayList<>();

        int value = 56;
        foo.add(value);
        foo.add(123);

        System.out.println(foo);

        int data = foo.get(0);
        System.out.println(data);

        
    }
}
