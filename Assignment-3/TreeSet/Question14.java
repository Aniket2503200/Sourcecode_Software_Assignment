import java.util.TreeSet;

public class Question14 {
    public static void main(String[] args) {
        // Creating a TreeSet with natural ordering (no comparator)
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");

        if (treeSet.comparator() == null) {
            System.out.println("TreeSet uses natural ordering.");
        } else {
            System.out.println("TreeSet uses a custom comparator.");
        }
    }
}
