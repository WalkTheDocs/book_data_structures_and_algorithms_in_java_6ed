package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Reinforcement;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a short Java method, inputAllBaseTypes, that inputs a different value
 * of each base type from the standard input device and prints it back to the
 * standard output device.
 */
public class R1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (Arrays.stream(args).anyMatch("summary"::equals)) {
            printSummary();
            return;
        }
        inputAllBaseTypes();
    }

    static void inputAllBaseTypes() {
        ask("boolean");
        boolean _boolean = scanner.nextBoolean();
        answer(_boolean);

        ask("char");
        char _char = scanner.next().charAt(0);
        answer(_char);

        ask("byte");
        byte _byte = scanner.nextByte();
        answer(_byte);

        ask("short");
        short _short = scanner.nextShort();
        answer(_short);

        ask("int");
        int _int = scanner.nextInt();
        answer(_int);

        ask("long");
        long _long = scanner.nextLong();
        answer(_long);

        ask("float");
        float _float = scanner.nextFloat();
        answer(_float);

        ask("double");
        double _double = scanner.nextDouble();
        answer(_double);
    }

    static void printSummary() {
        final String[][] table = new String[][] {
                { "boolean", "true or false" },
                { "char", "16-bit unicode character" },
                { "byte", "8-bit signed two's complement integer" },
                { "short", "16-bit signed two's complement integer" },
                { "int", "32-bit signed two's complement integer" },
                { "long", "64-bit signed two's complement integer" },
                { "float", "32-bit floating-point" },
                { "double", "64-bit floating-point" }
        };

        for (Object[] row : table) {
            System.out.format("%-15s%-15s%n", row);
        }

    }

    private static void ask(String type) {
        System.out.print("Enter a " + type + ": ");
    }

    private static <T> void answer(T variable) {
        System.out.println("You entered: " + variable);
    }
}
