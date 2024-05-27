import java.util.ArrayList;

public class Question10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.remove(0);
        System.out.println(list);
    }
}
