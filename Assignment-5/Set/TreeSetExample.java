import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) throws Exception {
        TreeSet<Character> charSet = new TreeSet<>();

        charSet.add('a');
        charSet.add('b');
        charSet.add('c');

        // Displaying the TreeSet
        System.out.println("TreeSet: " + charSet);

        // Getting the first element of charSet
        char firstElement = charSet.first();
        System.out.println("First element: " + firstElement);

        // Getting the last element of charSet
        char lastElement = charSet.last();
        System.out.println("Last element: " + lastElement);

        // Using addAll method to add all elements from another set to charSet
        TreeSet<Character> anotherSet = new TreeSet<>();
        anotherSet.add('d');
        anotherSet.add('e');
        charSet.addAll(anotherSet);
        System.out.println("After adding all elements from anotherSet: " + charSet);

        TreeSet<Character> clonedSet = (TreeSet<Character>) charSet.clone();
        System.out.println("Cloned TreeSet: " + clonedSet);

        // Checking if charSet contains an element
        boolean containsA = charSet.contains('a');
        System.out.println("Contains 'a'? " + containsA);

        // Getting the subset of charSet less than 'c'
        TreeSet<Character> subset = (TreeSet<Character>) charSet.headSet('c');
        System.out.println("Subset less than 'c': " + subset);

        // Checking if charSet is empty
        boolean isEmpty = charSet.isEmpty();
        System.out.println("Is charSet empty? " + isEmpty);

        // Getting an iterator for charSet
        System.out.print("Elements of charSet: ");
        for (Character c : charSet) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Removing an element from charSet
        boolean removed = charSet.remove('e');
        System.out.println("After removing 'e': " + charSet);

        // Getting the size of charSet
        int size = charSet.size();
        System.out.println("Size of charSet: " + size);

        // Getting the subset of charSet between 'a' and 'd'
        TreeSet<Character> subsetRange = (TreeSet<Character>) charSet.subSet('a', 'd');
        System.out.println("Subset between 'a' and 'd': " + subsetRange);

        // Getting the tailSet of charSet greater than or equal to 'b'
        TreeSet<Character> tailSet = (TreeSet<Character>) charSet.tailSet('b');
        System.out.println("TailSet greater than or equal to 'b': " + tailSet);

        charSet.clear();
        System.out.println("After clearing the TreeSet: " + charSet);
    }
}
