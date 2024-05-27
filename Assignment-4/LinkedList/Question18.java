
//listIterator(int index)
import java.util.LinkedList;
import java.util.ListIterator;

public class Question18 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        ListIterator<String> it = list.listIterator(1);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
