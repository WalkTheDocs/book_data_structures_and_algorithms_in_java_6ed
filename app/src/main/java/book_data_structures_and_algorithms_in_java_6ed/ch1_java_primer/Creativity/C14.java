package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Creativity;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * # C-14
 * 
 * Write a pseudocode description of a method that reverses an array of n
 * integers, so that the numbers are listed in the opposite order than they were
 * before, and compare this method to an equivalent Java method for doing the
 * same thing.
 * 
 * ## My solution
 * 
 * @see myReverse
 * 
 * ## Java's solution
 * 
 * @see ArrayUtils.reverse
 * 
 * Apache commons uses the same method that I used with a few extra
 * features and some
 * minor syntax differences.
 */

public class C14 {

   public static void main(String[] args) {
      int[] even = { 0, 1, 2, 3 };
      int[] odd = { 0, 1, 2, 3, 4 };

      int[] evenMyReversed = myReverse(Arrays.copyOf(even, even.length));
      int[] oddMyReversed = myReverse(Arrays.copyOf(odd, odd.length));

      // Investigate the java source here.
      int[] evenJavaReversed = Arrays.copyOf(even, even.length);
      int[] oddJavaReversed = Arrays.copyOf(odd, odd.length);
      ArrayUtils.reverse(evenJavaReversed);
      ArrayUtils.reverse(oddJavaReversed);

      assert Arrays.equals(evenMyReversed, evenJavaReversed) : "Even results are not equal!";
      assert Arrays.equals(oddMyReversed, oddJavaReversed) : "Odd results are not equal";
   }

   /**
    * Reverse an array
    * O(n) in time O(n) in space.
    */
   private static int[] myReverse(int[] arr) {
      int front = 0;
      int back = arr.length - 1;
      int temp;

      while (front < back) {
         temp = arr[front];
         arr[front] = arr[back];
         arr[back] = temp;

         front += 1;
         back -= 1;
      }

      return arr;
   }
}