import java.util.LinkedList;

public class Question11 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.remove(0);
        System.out.println(list);
    }
}
