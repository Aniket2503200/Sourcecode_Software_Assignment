import java.util.ArrayList;

public class Question16 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        ArrayList<String> clonedList = (ArrayList<String>) list.clone();

        System.out.println("Original List: " + list);
        System.out.println("Cloned List: " + clonedList);
    }
}
