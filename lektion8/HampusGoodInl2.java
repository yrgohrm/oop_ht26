public class HampusGoodInl2 {
    private HampusGoodInl2() {}

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

        // adjust to the last even number <= to
        long end = (to % 2 == 0) ? to : to - 1L;

        // no even numbers in the interval
        if (start > end) {
            return 0;
        }

        // use Gauss' old formula to calculate the sum
        long count = (end - start) / 2 + 1;        
        return count * (start + end) / 2;
    }
}
