package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer;

/**
 * Write a short Java method that takes an integer n and returns the sum of all
 * the odd positive integers less than or equal to n.
 */
public class R6 {

    public static void main(String[] args) {
        confirm(100);
    }

    private static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    /**
     * This is solved easily enough with recursion but is there a closed form.
     * solution?
     */
    static int sumOddUpTo(int n) {
        if (n == 0)
            return 0;

        if (isOdd(n))
            return n + sumOddUpTo(n - 1);
        else
            return sumOddUpTo(n - 1);
    }

    // The corresponding even sum method.
    static int sumEvenUpTo(int n) {
        if (n == 0)
            return 0;

        if (isOdd(n))
            return sumEvenUpTo(n - 1);
        else
            return n + sumEvenUpTo(n - 1);
    }

    /**
     * Investigate odd and even sums.
     */
    static void investigate(int upTo) {
        System.out.println("n, odd, even, odd - even, odd + even");
        for (int i = 1; i < upTo; i++) {
            int odd = sumOddUpTo(i);
            int even = sumEvenUpTo(i);
            System.out.println(String.format("%d, %d, %d, %d, %d", i, odd, even, odd - even, odd + even));
        }
    }

    /**
     * Closed form solution for the sum of even numbers up to n.
     */
    static int sumEvenUpToClosed(int n) {
        if (isOdd(n)) return (n - 1) * (n + 1) / 4;
        else return n * (n + 2) / 4;
    }

    /**
     * Closed form solution for the sum of odd numbers up to n.
     */
    static int sumOddUpToClosed(int n) {
        if (isOdd(n)) return (n + 1) * (n + 1) / 4;
        else return n * n / 4;
    }

    /**
     * Confirm that the closed form solutions and the recursive solutions are equivalent.
     */
    static void confirm(int upTo) {
        for (int i = 1; i < upTo; i++) {
            int odd = sumOddUpTo(i);
            int even = sumEvenUpTo(i);
            int oddClosed = sumOddUpToClosed(i);
            int evenClosed = sumEvenUpToClosed(i);
            assert odd == oddClosed : "odd closed formula gives incorrect result";
            assert even == evenClosed : "even closed formula gives incorrect result";
        }
        System.out.println("All correct");
    }
}