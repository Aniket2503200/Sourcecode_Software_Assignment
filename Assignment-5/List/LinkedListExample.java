import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Double> linkedList = new LinkedList<>();

        linkedList.add(3.14);
        linkedList.add(2.718);

        System.out.println("Linked list : " + linkedList);

        // Adding elements using addAll method
        linkedList.addAll(Arrays.asList(1.618, 0.577));

        System.out.println("Linked list : " + linkedList);

        // Adding an element at the beginning
        linkedList.addFirst(4.669);
        System.out.println("Linked list after adding first element : " + linkedList);

        // Adding an element at the end
        linkedList.addLast(1.732);
        System.out.println("Linked list after adding first element : " + linkedList);

        // Cloning the LinkedList
        LinkedList<Double> clonedList = (LinkedList<Double>) linkedList.clone();
        System.out.println("Linked list after cloning : " + clonedList);

        // Checking if an element exists using contains method
        System.out.println("Contains 9.806: " + linkedList.contains(9.806));

        // Getting element at specific index using get method
        System.out.println("Element at index 1: " + linkedList.get(1));

        // Getting the first element using getFirst method
        System.out.println("First element: " + linkedList.getFirst());

        // Getting the last element using getLast method
        System.out.println("Last element: " + linkedList.getLast());

        // Getting the index of an element
        System.out.println("Index of 299792458.0: " + linkedList.indexOf(2.718));

        // Getting the last index of an element
        System.out.println("Last index of 299792458.0: " + linkedList.lastIndexOf(2.718));

        // Removing an element by value
        linkedList.remove(9.806);
        System.out.println("After removing 9.806 : " + linkedList);

        // Removing the first element
        linkedList.removeFirst();
        System.out.println("After removing first element : " + linkedList);

        // Removing the last element
        linkedList.removeLast();
        System.out.println("After removing last element : " + linkedList);

        // Setting an element at specific index
        linkedList.set(0, 6.62607015E-34);
        System.out.println("Element set at index 0 : " + linkedList);

        // Getting the size of LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Converting LinkedList to an Array
        double[] numbersArray = new double[linkedList.size()];
        for (int i = 0; i < linkedList.size(); i++) {
            numbersArray[i] = linkedList.get(i);
        }

        // Printing the LinkedList
        System.out.println("Numbers: " + linkedList);
        System.out.println("Cloned List: " + clonedList);
        System.out.println("Numbers Array: " + Arrays.toString(numbersArray));

        // Clearing the LinkedList
        linkedList.clear();
        System.out.println("after clearing : " + linkedList);
    }
}
