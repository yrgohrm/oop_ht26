public class Ex4 {
    private static void foo() {
        if (Math.random() < 7) {
            // throw new IllegalArgumentException();
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        try {
            foo();
        } catch (IllegalArgumentException ex) {
            System.err.println("Oops, det gick illa: " + ex.getMessage());
        } catch (RuntimeException ex) {
            System.err.println("Runtime exception");
        }
    }
}
