package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Projects;

import java.util.Scanner;

/**
 * Write a short Java program that takes all the lines input to standard input
 * and writes them to standard output in reverse order. That is, each line is output
 * in the correct order, but the ordering of the lines is reversed.
 */
public class P26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("'''");

        String input = scanner.next();
        String lines[] = input.split("\\r?\\n");

        for (int i = lines.length - 1; i >= 0; i--) {
            System.out.println(lines[i]);
        }

        scanner.close();
    }
}
