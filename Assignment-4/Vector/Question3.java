import java.util.Vector;

public class Question3 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(10);
        vector.add("Apple");
        System.out.println("Capacity: " + vector.capacity());
    }
}
