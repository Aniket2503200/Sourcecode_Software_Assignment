import java.util.LinkedList;
import java.util.Arrays;

public class Question17 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Mango");
        String[] array = list.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
    }
}
