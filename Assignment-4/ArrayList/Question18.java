import java.util.ArrayList;

public class Question18 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10); // Initial capacity 10
        list.add("Apple");
        list.add("Banana");

        // Trimming to the current size
        list.trimToSize();

        System.out.println("List after trimming to size: " + list.size());
    }
}
