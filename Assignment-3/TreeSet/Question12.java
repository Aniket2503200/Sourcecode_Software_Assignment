import java.util.TreeSet;

public class Question12 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        TreeSet<Integer> tailSet = new TreeSet<>(treeSet.tailSet(30));
        System.out.println("TailSet from 30 (inclusive): " + tailSet);
    }
}
