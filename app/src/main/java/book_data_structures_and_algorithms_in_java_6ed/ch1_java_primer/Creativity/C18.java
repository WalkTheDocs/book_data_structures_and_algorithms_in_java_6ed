package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Creativity;

import java.util.Arrays;

class C18 {
    public static void main(String[] args) {
        Vector a = new Vector(new double[]{1, 2, 3});
        System.out.println(String.format("Euclidean norm = %.4f", Vector.norm(a)));
        System.out.println(String.format("p = 4 -> norm = %.4f", Vector.norm(a, 4)));
    }
    
}

class Vector {
    double[] data;
    int length;

    Vector(double[] data) {
        this.data = data;
        this.length = data.length;
    }

    public static double norm(Vector v) {
        return norm(v, 2);
    }

    public static double norm(Vector v, int power) {
        double squared = Arrays.stream(v.data).reduce((left, right) -> left + Math.pow(right, power)).getAsDouble();
        return Math.pow(squared, 1.0 / power);
    }
}
