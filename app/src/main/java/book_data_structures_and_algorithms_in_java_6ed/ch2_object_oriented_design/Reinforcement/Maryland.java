package book_data_structures_and_algorithms_in_java_6ed.ch2_object_oriented_design.Reinforcement;

/**
 * R10 What is the output from calling the main( ) method of the Maryland class?
 * 
 * Read it.
 * Ship it.
 * Buy it.
 * Read it.
 * Box it.
 * Read it.
 */
public class Maryland extends State {
    public void printMe() {
        System.out.println("Read it.");
    }

    public static void main(String[] args) {
        Region east = new State();
        State md = new Maryland();
        Object obj = new Place();
        Place usa = new Region();
        md.printMe();
        east.printMe();
        ((Place) obj).printMe();
        obj = md;
        ((Maryland) obj).printMe();
        obj = usa;
        ((Place) obj).printMe();
        usa = md;
        ((Place) usa).printMe();
    }
}

class State extends Region {
    public void printMe() {
        System.out.println("Ship it.");
    }
}

class Region extends Place {
    public void printMe() {
        System.out.println("Box it.");
    }
}

class Place extends Object {
    public void printMe() {
        System.out.println("Buy it.");
    }
}
