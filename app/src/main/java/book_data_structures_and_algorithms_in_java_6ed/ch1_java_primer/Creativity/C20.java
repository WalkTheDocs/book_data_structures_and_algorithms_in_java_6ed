package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Creativity;

import java.util.HashSet;

/**
 * Write a Java method that takes an array of float values and determines if all
 * the numbers are different from each other (that is, they are distinct).
 */
class C20 {
    public static void main(String[] args) {
        Float[] test = { 1F, 2F, 3F };
        HashSet<Float> set = new HashSet<Float>();
        boolean isUniqueFlag = true;

        for (Float f : test) {
            if (set.contains(f)) {
                isUniqueFlag = false;
                break;
            } else {
                set.add(f);
            }
        }

        System.out.println(String.format("The elements of the array %s unique", isUniqueFlag ? "are" : "are not"));
    }
}
