import java.util.Vector;

public class Question15 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        System.out.println("Before setting element: " + vector);

        // Set the element at index 1 to "Orange"
        vector.setElementAt("Orange", 1);

        System.out.println("After setting element: " + vector);
    }
}
