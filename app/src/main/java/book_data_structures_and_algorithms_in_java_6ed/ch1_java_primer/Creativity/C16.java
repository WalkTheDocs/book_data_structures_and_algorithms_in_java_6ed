package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Creativity;

import java.util.Scanner;

/**
 * Write a short program that takes as input three integers, a, b, and c, from
 * the Java console and determines if they can be used in a correct arithmetic
 * formula (in the given order), like “a + b = c,” “a = b − c,” or “a ∗ b = c.”
 */
public class C16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        System.out.println(String.format("%d + %d = %d: %b", a, b, c, a + b == c));
        System.out.println(String.format("%d - %d = %d: %b", a, b, c, a - b == c));
        System.out.println(String.format("%d * %d = %d: %b", a, b, c, a * b == c));
        System.out.println(String.format("%d / %d = %d: %b", a, b, c, a / b == c));
        System.out.println(String.format("%d = %d * %d: %b", a, b, c, a == b * c));
        System.out.println(String.format("%d = %d / %d: %b", a, b, c, a == b / c));
    }
}
