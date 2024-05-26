import java.util.TreeSet;

public class Question8 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        String lastElement = treeSet.last();
        System.out.println("Last element in TreeSet: " + lastElement);
    }
}
