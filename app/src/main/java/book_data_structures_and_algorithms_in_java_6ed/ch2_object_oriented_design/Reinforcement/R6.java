package book_data_structures_and_algorithms_in_java_6ed.ch2_object_oriented_design.Reinforcement;

import book_data_structures_and_algorithms_in_java_6ed.ch2_object_oriented_design.FibonacciProgression;

public class R6 {

    /**
     * Give a short fragment of Java code that uses the progression classes from
     * Section 2.2.3 to find the eighth value of a Fibonacci progression that starts
     * with 2 and 2 as its first two values.
     */
    public static void main(String[] args) {
        FibonacciProgression fbp = new FibonacciProgression(2, 2);
        long value = 0L;
        for (int i = 0; i < 8; i++) {
            value = fbp.nextValue();
        }
        System.out.println(value);
    }
}
