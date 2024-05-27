import java.util.Vector;

public class Question10 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Get the last element of the vector
        String lastElement = vector.lastElement();
        System.out.println("Last Element: " + lastElement);
    }
}
