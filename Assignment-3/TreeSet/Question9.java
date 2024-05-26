import java.util.TreeSet;

public class Question9 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        @SuppressWarnings("unchecked")
        TreeSet<String> clonedSet = (TreeSet<String>) treeSet.clone();
        System.out.println("Original TreeSet: " + treeSet);
        System.out.println("Cloned TreeSet: " + clonedSet);
    }
}
