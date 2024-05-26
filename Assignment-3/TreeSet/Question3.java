import java.util.TreeSet;

public class Question3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.remove("Apple");
        System.out.println("TreeSet after removing 'Apple': " + treeSet);
    }
}
