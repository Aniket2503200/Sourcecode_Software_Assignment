
import java.util.LinkedList;
import java.util.Arrays;

public class Question15 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
