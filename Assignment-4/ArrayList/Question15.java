import java.util.ArrayList;
import java.util.Arrays;

public class Question15 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        String[] array = list.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
    }
}
