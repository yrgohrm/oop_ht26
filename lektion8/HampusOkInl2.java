public class HampusOkInl2 {
    private HampusOkInl2() {}

    /**
     * Calculate the sum of all even numbers in the interval [from, to].
     * 
     * @param from the start value (inclusive)
     * @param to   the end value (inclusive)
     * @return sum of all even numbers in the interval, or -1 if any error occurs
     */
    public static long evenSum(int from, int to) {
        if (from > to) {
            return -1;
        }

        // adjust to the first even number >= from
        long start = (from % 2 == 0) ? from : from + 1L;
        long sum = 0;

        // since start is even we can loop every other number
        for (long i = start; i <= to; i += 2) {
            sum += i;
        }

        return sum;
    }
}
