package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Projects;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a Java program that can simulate a simple calculator, using the Java
 * console as the exclusive input and output device. That is, each input to the
 * calculator, be it a number, like 12.34 or 1034, or an operator, like + or =,
 * can be done on a separate line. After each such input, you should output to
 * the Java console what would be displayed on your calculator.
 */
public class P27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double result = null;

        Double number = null;
        String operator = null;
        String input;
        do {
            input = scanner.nextLine().trim();
            if (isNumber(input)) {
                if (result == null) {
                    result = Double.parseDouble(input);
                } else if (operator != null && number == null) {
                    number = Double.parseDouble(input);
                } else {
                    scanner.close();
                    throw new Error("Two numbers in a row!");
                }
            } else if (isOperator(input)) {
                if (operator == null) {
                    operator = input;
                } else {
                    scanner.close();
                    throw new Error("Two operators in a row!");
                }
            }

            if (number != null && operator != null) {
                result = calculate(result, operator, number);
                number = null;
                operator = null;
            }
        } while (!input.equals("="));
        System.out.print(result);
        scanner.close();
    }

    private static boolean isOperator(String input) {
        Pattern pattern = Pattern.compile("[/\\+\\-\\*\\^]");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    private static boolean isNumber(String input) {
        Pattern pattern = Pattern.compile("[0-9\\.]");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    private static double calculate(double result, String operator, double number) {
        switch (operator) {
            case "^":
                return Math.pow(result, number);
            case "*":
                return result * number;
            case "/":
                return result / number;
            case "+":
                return result + number;
            case "-":
                return result - number;
            default:
                throw new Error("invalid operation");
        }
    }
}
