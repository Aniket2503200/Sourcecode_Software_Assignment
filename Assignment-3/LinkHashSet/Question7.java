
import java.util.LinkedHashSet;

public class Question7 {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Apple");
        System.out.println(linkedHashSet);

        boolean isEmpty = linkedHashSet.isEmpty();
        System.out.println("Is LinkedHashSet empty?: " + isEmpty);

    }
}
