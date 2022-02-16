package book_data_structures_and_algorithms_in_java_6ed.ch2_object_oriented_design.Reinforcement;

import book_data_structures_and_algorithms_in_java_6ed.ch2_object_oriented_design.ArithmeticProgression;

/**
 * If we choose an increment of 128, how many calls to the nextValue method from
 * the ArithmeticProgression class of Section 2.2.3 can we make before we cause
 * a long-integer overflow?
 * 
 * 1. 128 = 2^7
 * 2. long is 8 bytes = 64 bits => Long.MAX_VALUE = 2^63 - 1
 * 3. We need to hit 2^63 to overflow the long.
 * 4. 2^63 / 2^7 = 2^56 iterations
 * 
 * What kind of time scale is that?
 */
public class R7 {

    public static void main(String[] args) {
        ArithmeticProgression ap = new ArithmeticProgression(128);

        long value = 0;
        long count = 0;
        long steps = 500000000L;

        long iterationStartTime = 0L;
        long iterationEndTime = 0L;
        double totalTime = 0L;

        while (count < steps) {
            iterationStartTime = System.nanoTime();
            value = ap.nextValue();
            count++;
            iterationEndTime = System.nanoTime();

            totalTime += iterationEndTime - iterationStartTime;
        }

        double averageLoopTime = totalTime / count;

        System.out.println(String.format("Long.MAX_VALUE: %d", Long.MAX_VALUE));
        System.out.println(String.format("Maximum number of steps exceeded. (steps: %d, value: %d)", steps, value));
        System.out.println(String.format("Total time (s): %f", nanosecondsToSeconds(totalTime)));
        System.out.println(String.format("Average loop time (ns): %f", averageLoopTime));
        System.out.println(String.format("Years to reach overflow: %f", nanosecondsToYears(Long.MAX_VALUE / 128 * averageLoopTime)));
    }

    private static double nanosecondsToSeconds(double nanoseconds) {
        return nanoseconds * Math.pow(10, -9);
    }

    private static double nanosecondsToDays(double nanoseconds) {
        return secondsToDays(nanosecondsToSeconds(nanoseconds));
    }

    private static double nanosecondsToYears(double nanoseconds) {
        return nanosecondsToDays(nanoseconds) / 364.25;
    }

    private static double secondsToDays(double seconds) {
        return seconds / 60 / 60 / 24;
    }

}
