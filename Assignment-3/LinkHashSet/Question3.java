import java.util.LinkedHashSet;

public class Question3 {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Apple");

        System.out.println("LinkedHashSet: " + linkedHashSet);

        linkedHashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + linkedHashSet);

    }
}
