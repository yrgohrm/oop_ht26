public class StringLoop {
    void mainBad() {
        String res = "";

        for (int i = 0; i < 10; ++i) {
            res += i + ", "; 
        }

        System.out.println(res);
    }

    void main() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; ++i) {
            builder.append(i);
            builder.append(", ");
        }

        System.out.println(builder.toString());
    }
}
