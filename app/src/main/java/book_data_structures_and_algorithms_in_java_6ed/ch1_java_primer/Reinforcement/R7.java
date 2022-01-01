package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Reinforcement;

/**
 * Write a short Java method that takes an integer n and returns the sum of the
 * squares of all positive integers less than or equal to n.
 */
class R7 {
    public static void main(String[] args) {
        confirm(20);
    }

    public static int sumSquaresUpToRecursive(int n) {
        if (n == 1)
            return 1;
        return n * n + sumSquaresUpToRecursive(n - 1);
    }

    public static int sumSquaresUpToClosed(int n) {
        return (2 * n + 1) * (n + 1) * n / 6;
    }

    public static void confirm(int upTo) {
        for (int i = 1; i < upTo; i++) {
            int recursive = sumSquaresUpToRecursive(i);
            int closed = sumSquaresUpToClosed(i);
            assert recursive == closed
                    : String.format("Sums not equal for n=%d. recursive=%d closed=%d", i, recursive, closed);
        }
        System.out.println("All Good");
    }
}
