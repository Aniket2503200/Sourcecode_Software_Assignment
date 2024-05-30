import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);
        hashtable.put("Four", 4);
        System.out.println("Initial Hashtable: " + hashtable.toString());

        // Cloning the hashtable
        Hashtable<String, Integer> clonedHashtable = (Hashtable<String, Integer>) hashtable.clone();
        System.out.println("Cloned Hashtable: " + clonedHashtable.toString());

        // Checking if a key is present using contains()
        boolean containsKey = hashtable.contains("Four");
        System.out.println("Hashtable contains key 'Four': " + containsKey);

        // Checking if a value is present using containsValue()
        boolean containsValue = hashtable.containsValue(3);
        System.out.println("Hashtable contains value 3: " + containsValue);

        // Retrieving an element using get()
        int value = hashtable.get("Three");
        System.out.println("Value for key 'Three': " + value);

        // Checking if the hashtable is empty using isEmpty()
        boolean isEmpty = hashtable.isEmpty();
        System.out.println("Is hashtable empty: " + isEmpty);

        // Getting the keys using keys()
        Enumeration<String> keys = hashtable.keys();
        System.out.print("Keys in hashtable: ");
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
        System.out.println();

        // Removing an element using remove()
        hashtable.remove("One");
        System.out.println("Hashtable after removing key 'One': " + hashtable.toString());

        // Getting the size of the hashtable using size()
        int size = hashtable.size();
        System.out.println("Size of hashtable: " + size);

        // Clearing the hashtable using clear()
        hashtable.clear();
        System.out.println("Hashtable after clear(): " + hashtable.toString());

        // Demonstrating rehash() (rehash() is protected, so it is called implicitly
        // when needed)
        hashtable.put("Five", 5);
        hashtable.put("Six", 6);
        hashtable.put("Seven", 7);
        hashtable.put("Eight", 8);
        System.out.println("Hashtable after adding more elements (rehash may occur): " + hashtable.toString());

        // Using toString() method to get the string representation of the hashtable
        System.out.println("String representation of hashtable: " + hashtable.toString());
    }
}
