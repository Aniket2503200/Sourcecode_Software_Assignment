import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.add(1, "Mango");

        System.out.println(fruits);

        // Adding a collection of elements using addAll method
        ArrayList<String> moreFruits = new ArrayList<>(Arrays.asList("Grapes", "Pineapple"));
        fruits.addAll(moreFruits);

        System.out.println(fruits);

        // Adding elements again after clearing
        fruits.add("Strawberry");
        fruits.add("Watermelon");

        System.out.println(fruits);

        // Cloning the ArrayList
        ArrayList<String> clonedList = (ArrayList<String>) fruits.clone();

        System.out.println("Contains 'Strawberry': " + fruits.contains("Strawberry"));

        // Ensuring capacity of ArrayList
        ((ArrayList<String>) fruits).ensureCapacity(10);

        System.out.println("Element at index 1: " + fruits.get(1));
        System.out.println("Index of 'Watermelon': " + fruits.indexOf("Watermelon"));
        System.out.println("Last index of 'Watermelon': " + fruits.lastIndexOf("Watermelon"));
        fruits.remove("Strawberry");
        System.out.println(fruits);

        // Removing an element by index
        fruits.remove(0);
        System.out.println("After removing index 0 : " + fruits);

        // Setting an element at specific index
        fruits.set(0, "Cherry");

        // Getting the size of ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());

        // Converting ArrayList to an Array
        String[] fruitsArray = new String[fruits.size()];
        fruits.toArray(fruitsArray);

        // Trimming the size of the ArrayList to the current number of elements
        ((ArrayList<String>) fruits).trimToSize();

        // Printing the ArrayList
        System.out.println("Fruits: " + fruits);
        System.out.println("Cloned List: " + clonedList);
        System.out.println("Fruits Array: " + Arrays.toString(fruitsArray));

        // Clearing the ArrayList
        fruits.clear();

        System.out.println(fruits);
    }
}
