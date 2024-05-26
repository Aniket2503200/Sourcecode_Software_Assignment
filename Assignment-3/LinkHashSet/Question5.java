
import java.util.LinkedHashSet;

public class Question5 {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Apple");
        System.out.println(linkedHashSet);

        int size = linkedHashSet.size();
        System.out.println("Size of LinkedHashSet: " + size);

    }
}
