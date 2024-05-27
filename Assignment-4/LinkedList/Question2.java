
// add(int index, E element)
import java.util.LinkedList;

public class Question2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Mango");
        list.add(0, "Banana");
        System.out.println(list);
    }
}
