
import java.util.ArrayList;

public class Question11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Orange");
        list.set(0, "Banana");
        System.out.println(list);
    }
}
