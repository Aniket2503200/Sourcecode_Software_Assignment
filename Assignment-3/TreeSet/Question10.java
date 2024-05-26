import java.util.Iterator;
import java.util.TreeSet;

public class Question10 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        Iterator iterator = treeSet.iterator();
        System.out.print("TreeSet elements: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
