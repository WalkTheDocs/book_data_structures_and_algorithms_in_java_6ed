package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer;

/**
 * Write a short Java method that takes an integer n and returns the sum of all
 * positive integers less than or equal to n.
 */
public class R5 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println(sumUpTo(num));
    }

    static int sumUpTo(int n) {
        return n * (n + 1) / 2;
    }
}
