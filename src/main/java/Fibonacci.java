public class Fibonacci {

    /**
     * Calculates the nth number in the Fibonacci sequence.
     *
     * @param nthNumber the position of the desired number in the Fibonacci sequence.
     *                  Must be a positive integer.
     * @return the nth number in the Fibonacci sequence.
     */
    public static int fibonacci(int nthNumber) {
        // a base case, these are the first position in the sequence and doesn't fit the algorithm implementation
        if (nthNumber == 0) {
            return nthNumber;
        }

        // using three variables we can slide the window up our array performing the calculation summing previous
        // and current with the answer being placed in next. Then slide the window up.
        int previous = 0;
        int current = 1;
        for (int i = 2; i<=nthNumber; i++) { // our counter i (n), which will start at 2 since 0,1 have been handled
            int next = previous + current; // our sum for this nth(i) iteration
            previous = current; // previous slides up to current
            current = next; // current slides up to next and repeat
        }
        return current;
    }

    public static void main(String[] args) {
        int result = fibonacci(1);
        System.out.println(result);
    }
}
