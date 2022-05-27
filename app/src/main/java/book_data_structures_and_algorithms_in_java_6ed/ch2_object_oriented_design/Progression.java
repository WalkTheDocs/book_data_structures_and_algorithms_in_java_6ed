package book_data_structures_and_algorithms_in_java_6ed.ch2_object_oriented_design;

public class Progression {

    protected long current;

    public Progression() {
        this(0);
    }

    public Progression(long start) {
        current = start;
    }

    public long nextValue() {
        long answer = current;
        advance();
        return answer;
    }

    protected void advance() {
        current++;
    }

    public void printProgression(int n) {
        System.out.print(nextValue());
        for (int j = 1; j < n; j++)
            System.out.print(" " + nextValue());
        System.out.println();
    }
}