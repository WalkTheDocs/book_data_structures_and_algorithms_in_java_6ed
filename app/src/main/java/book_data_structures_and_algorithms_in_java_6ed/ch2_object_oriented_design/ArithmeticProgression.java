package book_data_structures_and_algorithms_in_java_6ed.ch2_object_oriented_design;


public class ArithmeticProgression extends Progression {

    protected long increment;

    public ArithmeticProgression() {
        this(1, 0);
    }

    public ArithmeticProgression(long stepsize) {
        this(stepsize, 0);
    }

    public ArithmeticProgression(long stepsize, long start) {
        super(start);
        increment = stepsize;
    }

    @Override
    protected void advance() {
        current += increment;
    }
}
