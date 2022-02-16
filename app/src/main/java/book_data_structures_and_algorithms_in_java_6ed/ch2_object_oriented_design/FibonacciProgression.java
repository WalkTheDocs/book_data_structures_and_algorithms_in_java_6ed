package book_data_structures_and_algorithms_in_java_6ed.ch2_object_oriented_design;

public class FibonacciProgression extends Progression {
    
    protected long prev;

    public FibonacciProgression() {
        this(0, 1);
    }

    public FibonacciProgression(long prev, long current) {
        super(current);
        this.prev = current - prev;
    }

    @Override
    protected void advance() {
        long temp = prev;
        prev = current;
        current += temp;
    }
}
