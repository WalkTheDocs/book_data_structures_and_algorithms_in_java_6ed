/**
 * Write a short Java method that takes an integer n and returns the sum of all
 * positive integers less than or equal to n.
 */
public class Ex5 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println(sumUpTo(num));
    }

    static int sumUpTo(int n) {
        return n * (n + 1) / 2;
    }
}
