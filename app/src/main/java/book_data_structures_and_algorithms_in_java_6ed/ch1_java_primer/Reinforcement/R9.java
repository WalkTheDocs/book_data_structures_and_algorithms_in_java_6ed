package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Reinforcement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a short Java method that uses a StringBuilder instance to remove all
 * the punctuation from a string s storing a sentence, for example, transforming the
 * string "Let’s try, Mike!" to "Lets try Mike".
 * 
 * A helpful StackOverflow answers that leads to the Java docs for POSIX
 * character classes
 * https://stackoverflow.com/questions/6612870/posix-character-equivalents-in-java-regular-expressions
 * https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html
 */
public class R9 {
    public static void main(String[] args) {
        String test = "Let's try, Mike!";
        StringBuilder result = new StringBuilder(test.length());

        Pattern PUCTUATION = Pattern.compile("\\p{Punct}");
        Matcher matcher = PUCTUATION.matcher(test);

        int index = 0;
        while (matcher.find()) {
            result.append(test.substring(index, matcher.start()));
            index = matcher.start() + 1;
        }
        result.append(test.substring(index, test.length()));

        System.out.println(result.toString());
    }
}
