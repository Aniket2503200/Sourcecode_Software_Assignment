import java.util.Vector;
import java.util.Arrays;

public class Question14 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.removeAll(Arrays.asList("Apple", "Banana"));
        System.out.println(vector);
    }
}
