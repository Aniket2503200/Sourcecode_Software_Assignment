import java.util.ArrayList;
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.addAll(1, Arrays.asList("Banana", "Cherry"));
        System.out.println(list);
    }
}
