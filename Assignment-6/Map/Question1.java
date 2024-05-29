import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Question1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // put() - Insert key-value pairs into the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Map : " + map);

        // putAll() - Insert all key-value pairs from another map
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Four", 4);
        anotherMap.put("Five", 5);
        map.putAll(anotherMap);
        System.out.println("Another Map : " + map);

        // get() - Retrieve value associated with a key
        System.out.println("Value for key 'One': " + map.get("One"));

        // containsKey() - Check if the map contains a specific key
        System.out.println("Contains key 'Two': " + map.containsKey("Two"));

        // containsValue() - Check if the map contains a specific value
        System.out.println("Contains value 3: " + map.containsValue(3));

        // entrySet() - Get a set of all key-value pairs in the map
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Entries: " + entries);

        // keySet() - Get a set of all keys in the map
        Set<String> keys = map.keySet();
        System.out.println("Keys: " + keys);

        // values() - Get a collection of all values in the map
        Collection<Integer> values = map.values();
        System.out.println("Values: " + values);

        // size() - Get the number of key-value pairs in the map
        System.out.println("Size: " + map.size());

        // isEmpty() - Check if the map is empty
        System.out.println("Is map empty: " + map.isEmpty());

        // remove() - Remove a key-value pair by key
        map.remove("One");
        System.out.println("After removing key 'One': " + map);

        // clear() - Clear all key-value pairs from the map
        map.clear();
        System.out.println("After clearing the map: " + map);

        // equals() - Check if two maps are equal
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("A", 1);
        System.out.println("map1 equals map2: " + map1.equals(map2));

        // hashCode() - Get the hash code of the map
        System.out.println("Hash code of map1: " + map1.hashCode());
    }
}
