import java.util.Vector;

public class Question5 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");

        System.out.println("Initial Vector: " + vector + ", Initial Size: " + vector.size());

        vector.setSize(5);

        System.out.println("Vector after setSize(5): " + vector + ", Size after setSize(5): " + vector.size());

        vector.setSize(2);

        System.out.println("Vector after setSize(2): " + vector + ", Size after setSize(2): " + vector.size());
    }
}
