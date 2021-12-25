/**
 * Write a short Java method, isEven, that takes an int i and returns true if
 * and only if i is even. Your method cannot use the multiplication, modulus, or
 * division operators, however.
 */
class Ex4 {
    public static void main(String[] args) {
        int test = Integer.parseInt(args[0]);
        System.out.println(Boolean.toString(isEven(test)));
    }

    static boolean isEven(int num) {
        String bs = Integer.toBinaryString(num);
        char last = bs.charAt(bs.length() - 1);
        return last == '0';
    }
}
