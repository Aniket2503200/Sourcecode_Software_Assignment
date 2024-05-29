import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Question1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // put() - Insert key-value pairs into the map
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap : " + hashMap);

        // putAll() - Insert all key-value pairs from another map
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Four", 4);
        anotherMap.put("Five", 5);
        hashMap.putAll(anotherMap);
        System.out.println("Linked HashMap : " + hashMap);

        // get() - Retrieve value associated with a key
        System.out.println("Value for key 'One': " + hashMap.get("One"));

        // containsKey() - Check if the map contains a specific key
        System.out.println("Contains key 'Two': " + hashMap.containsKey("Two"));

        // containsValue() - Check if the map contains a specific value
        System.out.println("Contains value 3: " + hashMap.containsValue(3));

        // entrySet() - Get a set of all key-value pairs in the map
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        System.out.println("Entries: " + entries);

        // keySet() - Get a set of all keys in the map
        Set<String> keys = hashMap.keySet();
        System.out.println("Keys: " + keys);

        // values() - Get a collection of all values in the map
        Collection<Integer> values = hashMap.values();
        System.out.println("Values: " + values);

        // size() - Get the number of key-value pairs in the map
        System.out.println("Size: " + hashMap.size());

        // isEmpty() - Check if the map is empty
        System.out.println("Is map empty: " + hashMap.isEmpty());

        // remove() - Remove a key-value pair by key
        hashMap.remove("One");
        System.out.println("After removing key 'One': " + hashMap);

        // clear() - Clear all key-value pairs from the map
        hashMap.clear();
        System.out.println("After clearing the map: " + hashMap);

        // clone() - Create a shallow copy of this HashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        HashMap<String, Integer> clonedMap = (HashMap<String, Integer>) hashMap.clone();
        System.out.println("Cloned map: " + clonedMap);
    }
}
