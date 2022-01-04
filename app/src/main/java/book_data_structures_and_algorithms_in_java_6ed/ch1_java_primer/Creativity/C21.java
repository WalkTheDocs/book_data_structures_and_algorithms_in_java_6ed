package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Creativity;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Write a Java method that takes an array containing the set of all integers in
 * the range 1 to 52 and shuffles it into random order. Your method should
 * output each possible order with equal probability.
 */
public class C21 {
    public static void main(String[] args) {
        int[] test = IntStream.range(1, 53).toArray();
        for (int i = 0; i < test.length; i++) {
            swap(test, randIndex(0, test.length), randIndex(0, test.length));
        }
        System.out.println(Arrays.toString(test));
    }

    private static int randIndex(int from, int toExclusive) {
        Random random = new Random();
        return random.nextInt(from, toExclusive);
    }

    private static void swap(int[] arr, int indexA, int indexB) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
}
