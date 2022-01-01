package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Reinforcement;

/**
 * Write a short Java method, isMultiple, that takes two long values, n and m,
 * and returns true if and only if n is a multiple of m, that is, n = mi for
 * some integer i.
 */
class R3 {
    public static void main(String[] args) {
        System.out.println(Boolean.toString(isMultiple(15L, 5L)));
        System.out.println(Boolean.toString(isMultiple(15L, 3L)));
        System.out.println(Boolean.toString(isMultiple(15L, 2L)));
        System.out.println(Boolean.toString(isMultiple(15L, 1L)));
    }

    private static boolean isMultiple(Long n, Long m) {
        return n % m == 0;
    }
}
