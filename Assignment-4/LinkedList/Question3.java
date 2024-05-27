
// addAll(Collection<? extends E> c)
import java.util.LinkedList;
import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println(list);
    }
}
