package book_data_structures_and_algorithms_in_java_6ed.ch2_object_oriented_design.Creativity;

/**
 * Most modern Java compilers have optimizers that can detect simple cases when
 * it is logically impossible for certain statements in a program to ever be
 * executed. In such cases, the compiler warns the programmer about the useless
 * code. Write a short Java method that contains code for which it is provably
 * impossible for that code to ever be executed, yet the Java compiler does
 * not detect this fact.
 */
public class C17 {
    public static void main(String[] args) {
        // sqrt(4) == 2 --> sqrt(5) > 2 --> the if statement is unreachable
        double x = Math.sqrt(5);
        if (x < 2) {
            System.out.println("test");
        }
    }
}
