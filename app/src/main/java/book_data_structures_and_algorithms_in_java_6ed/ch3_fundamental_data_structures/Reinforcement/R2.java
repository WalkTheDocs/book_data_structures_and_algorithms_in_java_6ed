package book_data_structures_and_algorithms_in_java_6ed.ch3_fundamental_data_structures.Reinforcement;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * Write a Java method that repeatedly selects and removes a random entry from
 * an array until the array holds no more entries.
 */
public class R2 {
    public static void main(String args[]) {
        int[] initialArr = { 1, 2, 3 };
        int[] arr = initialArr;

        while (arr.length != 0) {
            System.out.println(Arrays.toString(arr));
            arr = spliceRandom(arr);
        }
    }

    static int[] spliceRandom(int[] arr) {
        int randIndex = ThreadLocalRandom.current().nextInt(0, arr.length);
        return IntStream.range(0, arr.length).filter(i -> i != randIndex).map(i -> arr[i]).toArray();
    }
}
