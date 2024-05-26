import java.util.TreeSet;

public class Question6 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Apple");
        treeSet.add("Banana");
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("Is TreeSet empty ? : " + isEmpty);

    }
}
