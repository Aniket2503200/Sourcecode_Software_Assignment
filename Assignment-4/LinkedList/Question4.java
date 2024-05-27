
// addAll(int index, Collection<? extends E> c)
import java.util.LinkedList;
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.addAll(1, Arrays.asList("Banana", "Cherry"));
        System.out.println(list);
    }
}
