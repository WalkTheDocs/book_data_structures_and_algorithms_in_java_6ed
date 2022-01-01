package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Reinforcement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a short Java method that counts the number of vowels in a given
 * character string.
 */
public class R8 {
    public static void main(String[] args) {
        String test = "This is a string for testing";
        Pattern VOWELS = Pattern.compile("[aeiou]");
        Matcher vowelsMatcher = VOWELS.matcher(test);

        int vowelCount = 0;
        while (vowelsMatcher.find()) vowelCount++;

        System.out.println(String.format("Your string had %d vowels (y is not a vowel)", vowelCount));
    }
}
