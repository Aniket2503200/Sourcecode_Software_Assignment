import java.util.TreeSet;

public class Question5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
    }
}
