import java.util.ArrayList;

public class Question17 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        // Ensure capacity of at least 10
        list.ensureCapacity(10);

        // Adding more elements to see if it holds capacity
        list.add("Cherry");
        list.add("Date");

        System.out.println("List after ensuring capacity: " + list);
    }
}
