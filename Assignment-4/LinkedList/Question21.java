
//Object clone()
import java.util.LinkedList;

public class Question21 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");

        @SuppressWarnings("unchecked")
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();

        System.out.println("Original List: " + list);
        System.out.println("Cloned List: " + clonedList);

    }
}
