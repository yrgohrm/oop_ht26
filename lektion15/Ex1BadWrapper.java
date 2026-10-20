public class Ex1BadWrapper {
    private static final int sumBoxed(int upTo) {
        Integer sum = 0;
        for (Integer i = 0; i < upTo; i += 1) {
            sum += i;
        }
        return sum;
    }

    private static final int sumUnBoxed(int upTo) {
        int sum = 0;
        for (int i = 0; i < upTo; i += 1) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // this is a very quick and dirty way to measure
        // does not work very well in many circumstances        

        int numIterations = 200_000;
        long startTime;
        long endTime;
   
        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            int sum = sumBoxed(i % 2837);

            // this is just to make sure we use sum in our test
            if (sum == Integer.MAX_VALUE) {
                System.out.println(sum);
            }
        }
        endTime = System.nanoTime();
        long boxedTime = endTime - startTime;
        System.out.printf("Time taken for unboxing:  %12d milliseconds%n", boxedTime / 1_000_000);

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            int sum = sumUnBoxed(i % 2837);

            // this is just to make sure we use sum in our test
            if (sum == Integer.MAX_VALUE) {
                System.out.println(sum);
            }
        }
        endTime = System.nanoTime();
        long unboxedTime = endTime - startTime;
        System.out.printf("Time taken for no boxing: %12d milliseconds%n", unboxedTime / 1_000_000);

        System.out.printf("Boxed vs unboxed: %.0f times more%n", (double) boxedTime / unboxedTime);
    }
}