package book_data_structures_and_algorithms_in_java_6ed.ch2_object_oriented_design.Reinforcement;

public class R14 {
    static public void main(String[] args) {
        int[] array = new int[5];
        try {
            array[5] = 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Don't try buffer overflow attacks in Java!");
        }
    }
}
