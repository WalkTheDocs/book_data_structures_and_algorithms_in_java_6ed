package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Projects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * The birthday paradox says that the probability that two people in a room will
 * have the same birthday is more than half, provided n, the number of people in
 * the room, is more than 23. This property is not really a paradox, but many
 * people find it surprising. Design a Java program that can test this paradox
 * by a series of experiments on randomly generated birthdays, which test this
 * paradox for n = 5, 10, 15, 20, . . ., 100.
 */
public class P29 {

    /**
     * We don't need dates to test this theory. Random numbers will work fine.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int iterations = 10000;
        int n = 23;
        simulate(iterations, n);
    }

    private static void simulate(int iterations, int n) {
        List<Boolean> results = new ArrayList<Boolean>();
        for (int i = 0; i < iterations; i++) {
            results.add(simulate(n));
        }
        long sameBirthdaysresults = results.stream().filter(x -> x).count();
        System.out.println(String.format("%d / %d", sameBirthdaysresults, iterations));
    }

    private static boolean simulate(int n) {
        HashSet<Integer> birthdays = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int birthday = ThreadLocalRandom.current().nextInt(366);
            if (birthdays.contains(birthday)) {
                return true;
            } else {
                birthdays.add(birthday);
            }
        }
        return false;
    }
}
