import java.util.random.*;

public class PairEx {
    record Pair(Object o1, Object o2) {}

    void main() {
        Pair p1 = new Pair(12, "Hej");
        Pair p2 = new Pair("Hej", RandomGenerator.getDefault());

        doStuff(p1);
        doStuff(p2);
    }

    public static void doStuff(Pair p) {
        // do stuff

        
    }
}
