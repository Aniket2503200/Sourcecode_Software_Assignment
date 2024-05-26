import java.util.TreeSet;

public class Question2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        boolean containsApple = treeSet.contains("Apple");
        System.out.println("TreeSet contains 'Apple': " + containsApple);
    }
}
