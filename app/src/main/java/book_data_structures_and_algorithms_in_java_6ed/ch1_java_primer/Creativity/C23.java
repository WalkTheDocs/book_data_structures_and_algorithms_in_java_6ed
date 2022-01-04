package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Creativity;

import java.util.Arrays;

/**
 * Write a short Java program that takes two arrays a and b of length n storing
 * int values, and returns the dot product of a and b. That is, it returns an
 * array c of length n such that c[i] = a[i] · b[i], for i = 0, . . . , n − 1.
 */
public class C23 {
    public static void main(String args[]) {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};
        int[] c = dotProduct(a, b);

        System.out.println(Arrays.toString(c));
    }

    public static int[] dotProduct(int[] a, int[] b) {
        assert a.length == b.length : "Arrays must have the same length";
        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
        }

        return c;
    }
}
