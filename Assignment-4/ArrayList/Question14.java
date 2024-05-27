import java.util.ArrayList;
import java.util.Arrays;

public class Question14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
