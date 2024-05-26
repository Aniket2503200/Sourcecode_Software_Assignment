import java.util.TreeSet;
import java.util.SortedSet;

public class Question15 {
    public static void main(String[] args) {
        // Creating a TreeSet and adding elements
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");
        System.out.println("Original TreeSet: " + treeSet);

        // Getting a subset from "Banana" (inclusive) to "Date" (exclusive)
        SortedSet<String> subSet = treeSet.subSet("Banana", "Date");

        System.out.println("Subset from 'Banana' (inclusive) to 'Date' (exclusive): " + subSet);
    }
}
