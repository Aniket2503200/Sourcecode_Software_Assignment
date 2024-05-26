import java.util.LinkedHashSet;

public class Question2 {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Apple");

        System.out.println("LinkedHashSet: " + linkedHashSet);

        boolean containsApple = linkedHashSet.contains("Apple");
        System.out.println("Contains 'Apple': " + containsApple);

    }
}
