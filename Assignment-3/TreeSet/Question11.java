import java.util.TreeSet;

public class Question11 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        TreeSet<Integer> headSet = new TreeSet<>(treeSet.headSet(30));
        System.out.println("HeadSet up to 30 (exclusive): " + headSet);
    }
}
