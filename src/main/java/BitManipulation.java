public class BitManipulation {

    public static int reverseBits(int n) {
        // Work directly with the bits in the int
        // Use bitshift operators in order: shift m left, copy rightmost of n to rightmost of m, shift m to the right
        int m = 0; // temp building space
        for (int i = 0; i < 32; i++) { // 32 bits in an int
            m <<= 1; // shift m left by one
            m |= (n & 1); // this is effectively a bit copy. it isolates the rightmost digit (n & 1), then preserves that bit into m m |= (...)
            n >>= 1; // shift n right by one
        }
        return m; // our result
    }

    public static int hammingWeight(int n) {
        // count and remove bits - This is the optimal solution
        int count = 0; // our result
        while (n != 0) { // base case as we whittle down the int
            // (n - 1) subtract 1 from n this ensures we are not working with the entire 32 bit int if we don't need to
            n &= (n - 1); // n &= (n - 1) n equals n bitwise and (n - 1) - clever isolation and removal of the LSB
            count++; // add to our result
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(43261596)); // 964176192

        System.out.println(hammingWeight(13)); // 13 = 1101 = 3

    }
}
