import java.util.Vector;

public class Question11 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Get the element at index 1
        String element = vector.get(1);
        System.out.println("Element at index 1: " + element);
    }
}
