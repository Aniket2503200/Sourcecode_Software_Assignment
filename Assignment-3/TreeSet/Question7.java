import java.util.TreeSet;

public class Question7 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        String firstElement = treeSet.first();
        System.out.println("First element in TreeSet: " + firstElement);
    }
}
