package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Reinforcement;

import lombok.Data;

/**
 * Write a Java class, Flower, that has three instance variables of type String,
 * int, and float, which respectively represent the name of the flower, its
 * number of petals, and price. Your class must include a constructor method
 * that initializes each variable to an appropriate value, and your class should
 * include methods for setting the value of each type, and getting the value of
 * each type.
 */
public class R10 {
    public static void main(String[] args) {
        Flower flower = new Flower("Tulip", 10, 20.99F);
        printFlowerInfo(flower);

        flower.setName("Rose");
        flower.setNumPetals(100);
        flower.setPrice(49.99F);
        printFlowerInfo(flower);
    }

    private static void printFlowerInfo(Flower flower) {
        System.out.println(String.format("Name: %s, Number of Petals: %d, Price: %f", flower.getName(), flower.getNumPetals(), flower.getPrice()));
    }
}

@Data
class Flower {
    private String name;
    private int numPetals;
    private float price;

    public Flower(String name, int numPetals, float price) {
        this.name = name;
        this.numPetals = numPetals;
        this.price = price;
    }
}
