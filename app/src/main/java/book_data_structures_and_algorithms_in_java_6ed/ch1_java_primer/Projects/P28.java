package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Projects;

import java.util.Random;

/**
 * A common punishment for school children is to write out a sentence multiple
 * times. Write a Java stand-alone program that will write out the following
 * sen-tence one hundred times: “I will never spam my friends again.” Your
 * program should number each of the sentences and it should make eight
 * different random-looking typos.
 */
public class P28 {
    public static void main(String[] args) {
        String sentence = "I will never spam my friends again";
        String[] typos = {
                "I will ever spam my friends again",
                "I will never spam my friends again",
                "I wiIl never spam my friends again",
                "I uuill never spam my friends again",
                "I will never span my friends again",
                "I will never spam mi friends again",
                "I will never spam my frends again",
                "I'll never spam my friends again",
        };

        Random random = new Random();
        double typoProbability = 0.05;

        for (int i = 0; i < 100; i++) {
            String s = sentence;
            boolean hasTypo = random.nextDouble() < typoProbability;
            if (hasTypo)
                s = typos[random.nextInt(typos.length)];
            System.out.println(String.format("%d. %s", i + 1, s));
        }
    }
}