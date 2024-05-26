
import java.util.LinkedHashSet;

public class Question6 {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Apple");
        System.out.println(linkedHashSet);

        linkedHashSet.clear();
        System.out.println("After clearing, LinkedHashSet: " + linkedHashSet);

    }
}
