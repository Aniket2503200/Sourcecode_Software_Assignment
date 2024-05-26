import java.util.LinkedHashSet;

public class Question8 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> originalSet = new LinkedHashSet<>();

        originalSet.add(1);
        originalSet.add(2);
        originalSet.add(3);
        originalSet.add(4);

        System.out.println("Original LinkedHashSet: " + originalSet);

        // Cloning the LinkedHashSet
        @SuppressWarnings("unchecked")
        LinkedHashSet<Integer> clonedSet = (LinkedHashSet<Integer>) originalSet.clone();

        // Displaying the cloned LinkedHashSet
        System.out.println("Cloned LinkedHashSet: " + clonedSet);

        // Modifying the original set to show they are independent
        originalSet.add(5);
        originalSet.remove(1);

        // Displaying both sets after modification
        System.out.println("Modified Original LinkedHashSet: " + originalSet);
        System.out.println("Cloned LinkedHashSet after original modification: " + clonedSet);
    }
}
