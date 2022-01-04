package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Creativity;

/**
 * Write a short Java method that takes an array of int values and determines if
 * there is a pair of distinct elements of the array whose product is even.
 * 
 * even * even -> even
 * even * odd -> even
 * odd * odd -> odd
 * 
 * If the array has two or more elements and one of them is even, then
 * there exist two distinct elements whose product will also be even.
 */
public class C17 {
    public static void main(String[] args) {
        boolean hasEvenDistinctProduct = false;
        boolean hasEvenElement = false;
        int evenNumber = 0;
        int[] test = { 1, 2, 3, 4 };
        for (int i : test) {
            if (!hasEvenElement && i % 2 == 0) {
                hasEvenElement = true;
                evenNumber = i;
            } else if (hasEvenElement && i % 2 == 0 && i != evenNumber) {
                hasEvenDistinctProduct = true;
            }

        } 
        System.out.println(hasEvenDistinctProduct ? "yes" : "no");
    }
}
