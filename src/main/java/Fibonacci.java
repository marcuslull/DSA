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

    public static int tribonacci(int nthNumber) {
        // Same formula as fib just introduce the prevPrev into the next equation
        // Time: n
        // Space: 1

        // edge cases
        if (nthNumber == 0) return nthNumber; // or could return 0
        if (nthNumber <= 2) return 1;

        // Memory technique for fib/trib:
        // these vars up to and including the for loop i will be increasing fib numbers (0, 1, 1, 2, ...)
        int prevPrev = 0;
        int prev = 1;
        int curr = 1;
        for (int i = 2; i < nthNumber; i++) { // loop once per up to n
            int next = prevPrev + prev + curr; // figure out next
            prevPrev = prev; // then move the rest up one spot
            prev = curr;
            curr = next;
        }
        return curr; // our answer
    }

    public static void main(String[] args) {
        int resultFib = fibonacci(10);
        System.out.println(resultFib);

        int resultTrib = tribonacci(25);
        System.out.println(resultTrib);
    }
}
