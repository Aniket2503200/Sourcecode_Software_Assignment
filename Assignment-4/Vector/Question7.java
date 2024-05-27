import java.util.Vector;
import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(Arrays.asList("Apple", "Banana", "Cherry"));
        Vector<String> checkCollection = new Vector<>(Arrays.asList("Banana", "Cherry"));

        boolean containsAll = vector.containsAll(checkCollection);

        System.out.println("Vector contains all elements of checkCollection: " + containsAll);
    }
}
