import java.util.ArrayList;

public class Question9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.remove("Apple");
        System.out.println(list);
    }
}
