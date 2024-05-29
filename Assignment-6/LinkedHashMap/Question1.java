import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Question1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // put() - Insert key-value pairs into the map
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        System.out.println("Linked HashMap : " + linkedHashMap);

        // putAll() - Insert all key-value pairs from another map
        Map<String, Integer> anotherMap = new LinkedHashMap<>();
        anotherMap.put("Four", 4);
        anotherMap.put("Five", 5);
        linkedHashMap.putAll(anotherMap);
        System.out.println("Another Linked HashMap : " + linkedHashMap);

        // get() - Retrieve value associated with a key
        System.out.println("Value for key 'One': " + linkedHashMap.get("One"));

        // containsKey() - Check if the map contains a specific key
        System.out.println("Contains key 'Two': " + linkedHashMap.containsKey("Two"));

        // containsValue() - Check if the map contains a specific value
        System.out.println("Contains value 3: " + linkedHashMap.containsValue(3));

        // entrySet() - Get a set of all key-value pairs in the map
        Set<Map.Entry<String, Integer>> entries = linkedHashMap.entrySet();
        System.out.println("Entries: " + entries);

        // keySet() - Get a set of all keys in the map
        Set<String> keys = linkedHashMap.keySet();
        System.out.println("Keys: " + keys);

        // values() - Get a collection of all values in the map
        Collection<Integer> values = linkedHashMap.values();
        System.out.println("Values: " + values);

        // size() - Get the number of key-value pairs in the map
        System.out.println("Size: " + linkedHashMap.size());

        // isEmpty() - Check if the map is empty
        System.out.println("Is map empty: " + linkedHashMap.isEmpty());

        // remove() - Remove a key-value pair by key
        linkedHashMap.remove("One");
        System.out.println("After removing key 'One': " + linkedHashMap);

        // clear() - Clear all key-value pairs from the map
        linkedHashMap.clear();
        System.out.println("After clearing the map: " + linkedHashMap);

        // clone() - Create a shallow copy of this LinkedHashMap
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        LinkedHashMap<String, Integer> clonedMap = (LinkedHashMap<String, Integer>) linkedHashMap.clone();
        System.out.println("Cloned map: " + clonedMap);
    }
}
