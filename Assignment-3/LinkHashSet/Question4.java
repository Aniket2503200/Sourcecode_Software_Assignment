import java.util.Iterator;
import java.util.LinkedHashSet;

public class Question4 {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Apple");

        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
