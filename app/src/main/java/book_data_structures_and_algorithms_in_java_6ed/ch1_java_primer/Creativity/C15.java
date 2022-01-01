package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Creativity;

import java.util.Arrays;

/**
 * Write a pseudocode description of a method for finding the smallest and
 * largest numbers in an array of integers and compare that to a Java method
 * that would do the same thing.
 */
class C15 {

    public static void main(String args[]) {
        int[] test = { 1, 2, 3, 4, 5 };

        // Java's implementation
        int maxFromStream = Arrays.stream(test).max().getAsInt();
        int minFromStream = Arrays.stream(test).min().getAsInt();

        int maxFromMe = test[0];
        int minFromMe = test[0];
        for (int i : test) {
            if (i < minFromMe)
                minFromMe = i;
            if (i > maxFromMe)
                maxFromMe = i;
        }

        assert maxFromStream == maxFromMe;
        assert minFromStream == minFromMe; 
        System.out.println("All good.");
    }
}
