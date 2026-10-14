public class ExExAritm {
    private static int func(int i) {
        return 1234 / i;
    }

    void main() {
        try {
            func(0); 
        }
        catch (ArithmeticException ex) {
            System.out.println("arit fel");
            ex.printStackTrace();
        }
        catch (RuntimeException ex) {
            System.out.println("haha nu blev det fel");
        }
    }
}
