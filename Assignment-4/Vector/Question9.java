import java.util.Vector;

public class Question9 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Get the first element of the vector
        String firstElement = vector.firstElement();
        System.out.println("First Element: " + firstElement);
    }
}
