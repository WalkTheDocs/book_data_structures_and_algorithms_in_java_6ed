package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Creativity;

import java.util.HashSet;

/**
 * Write a short Java program that outputs all possible strings formed by using
 * the characters 'c', 'a', 't', 'd', 'o', and 'g' exactly once.
 */
public class C22 {
    static HashSet<String> results = new HashSet<String>();

    /**
     * There are 6 characters leading to 6! combinations which is 720;
     */
    public static void main(String[] args) {
        String test = "catdog";
        permutations(test);
        assert results.size() == factorial(test.length()) : "The number of permutations is wrong.";
    }

    static void permutations(String string) {
        results = new HashSet<String>();
        permutations("", string);
    }

    private static void permutations(String permutation, String remaining) {
        if (remaining.length() == 0)
            results.add(permutation);
        else {
            for (int i = 0; i < remaining.length(); i++) {
                permutations(permutation + remaining.charAt(i), spliceOut(remaining, i));
            }
        }
    }

    private static String spliceOut(String s, int index) {
        return s.substring(0, index) + s.substring(index + 1, s.length());
    }

    private static double factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}