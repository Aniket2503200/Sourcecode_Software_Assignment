import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Character> vector = new Vector<>(10);
        vector.addElement('A');
        vector.addElement('B');
        vector.addElement('C');
        vector.addElement('Z');

        System.out.println("Vector : " + vector);

        int capacity = vector.capacity();
        System.out.println("Initial Capacity: " + capacity);

        int size = vector.size();
        System.out.println("Size: " + size);

        // Setting size of the vector
        vector.setSize(5);
        System.out.println("New Size after setSize(5): " + vector.size());

        // Checking if vector contains an element
        boolean containsElement = vector.contains('C');
        System.out.println("Contains 'C': " + containsElement);

        // Checking if vector contains all elements in a collection
        Vector<Character> checkElements = new Vector<>();
        checkElements.addElement('A');
        checkElements.addElement('B');
        boolean containsAll = vector.containsAll(checkElements);
        System.out.println("Contains all elements of checkElements: " + containsAll);

        // Getting element at specific index
        char elementAtIndex = vector.elementAt(2);
        System.out.println("Element at index 2: " + elementAtIndex);

        // Getting element at specific index using get method
        char elementAtIndexGet = vector.get(3);
        System.out.println("Element at index 3 using get method: " + elementAtIndexGet);

        // Checking if the vector is empty
        boolean isEmpty = vector.isEmpty();
        System.out.println("Is Vector empty: " + isEmpty);

        // Getting the first element
        char firstElement = vector.firstElement();
        System.out.println("First Element: " + firstElement);

        // Removing an element
        vector.removeElement('C');
        System.out.println("Vector after removing 'C': " + vector);

        // Removing all elements in a collection
        vector.removeAll(checkElements);
        System.out.println("Vector after removing all elements of checkElements: " + vector);

        // Setting an element at specific index
        vector.setElementAt('X', 1);
        System.out.println("Vector after setting 'X' at index 1: " + vector);

        // Getting the last element
        char lastElement = vector.lastElement();
        System.out.println("Last Element: " + lastElement);
    }
}
