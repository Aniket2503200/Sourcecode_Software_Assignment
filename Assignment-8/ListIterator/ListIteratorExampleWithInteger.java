import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExampleWithInteger {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ListIterator<Integer> iterator = numbers.listIterator();

        // Using hasNext() and next()
        System.out.println("Iterating forward using hasNext() and next():");
        while (iterator.hasNext()) {
            System.out.println("Index: " + iterator.nextIndex() + ", Element: " + iterator.next());
        }

        // Using hasPrevious() and previous()
        System.out.println("\nIterating backward using hasPrevious() and previous():");
        while (iterator.hasPrevious()) {
            System.out.println("Index: " + iterator.previousIndex() + ", Element: " + iterator.previous());
        }

        // Adding an element
        iterator = numbers.listIterator();
        iterator.next(); // Move to the first element
        System.out.println("\nAdding 25 after the first element:");
        iterator.add(25);
        System.out.println("List after adding 25: " + numbers);

        // Setting (replacing) an element
        iterator.next(); // Move to 20
        System.out.println("\nSetting 35 in place of 20:");
        iterator.set(35);
        System.out.println("List after setting 35: " + numbers);

        // Removing an element
        iterator.previous(); // Move back to 35
        System.out.println("\nRemoving 25:");
        iterator.previous(); // Move back to 25
        iterator.remove();
        System.out.println("List after removing 25: " + numbers);
    }
}
