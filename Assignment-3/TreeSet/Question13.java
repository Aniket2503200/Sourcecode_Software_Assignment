import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;

public class Question13 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        System.out.println("TreeSet before addAll: " + treeSet);

        // Creating a collection to be added
        Collection<String> collection = new ArrayList<>();
        collection.add("Cherry");
        collection.add("Date");

        // Adding all elements from the collection to the TreeSet
        treeSet.addAll(collection);

        System.out.println("TreeSet after addAll: " + treeSet);
    }
}
