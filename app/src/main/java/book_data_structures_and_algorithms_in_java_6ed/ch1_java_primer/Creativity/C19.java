package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Creativity;

import java.util.Scanner;

/**
 * Write a Java program that can take a positive integer greater than 2 as input
 * and write out the number of times one must repeatedly divide this number by 2
 * before getting a value less than 2.
 */
class C19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int input = scanner.nextInt();
        validate(input);

        int closed = closedSolution(input);
        int recursive = recursiveSolution(input, 0);
        assert closed == recursive : String.format("closed: %d, recursive %d", closed, recursive);
        System.out.println(String.format("Must divide by 2 %d times to get a value less than 2", closed));

        scanner.close();
    }

    public static int closedSolution(int x) {
        if (x < 2) {
            return 1;
        } else {
            return Integer.toBinaryString(x).length() - 1;
        }
    }

    public static int recursiveSolution(int x, int n) {
        if (x < 2) {
            return n;
        } else {
            return recursiveSolution(x / 2, n + 1);
        }
    }

    private static void validate(int x) {
        assert x >= 0 : "Input a positive integer";
    }
}