import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        treeMap.put("Four", 4);
        System.out.println("Initial TreeMap: " + treeMap);

        // Cloning the TreeMap
        TreeMap<String, Integer> clonedTreeMap = (TreeMap<String, Integer>) treeMap.clone();
        System.out.println("Cloned TreeMap: " + clonedTreeMap);

        // Getting the comparator used by this map (null if natural ordering)
        Comparator<? super String> comparator = treeMap.comparator();
        System.out.println("Comparator used: " + (comparator == null ? "Natural ordering" : comparator));

        // Checking if a key is present using containsKey()
        boolean containsKey = treeMap.containsKey("Two");
        System.out.println("TreeMap contains key 'Two': " + containsKey);

        // Checking if a value is present using containsValue()
        boolean containsValue = treeMap.containsValue(3);
        System.out.println("TreeMap contains value 3: " + containsValue);

        // Getting the set of entries using entrySet()
        Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
        System.out.println("Entry set: " + entrySet);

        // Getting the first key using firstKey()
        String firstKey = treeMap.firstKey();
        System.out.println("First key: " + firstKey);

        // Retrieving an element using get()
        int value = treeMap.get("Three");
        System.out.println("Value for key 'Three': " + value);

        // Getting a portion of the map using headMap()
        SortedMap<String, Integer> headMap = treeMap.headMap("Three");
        System.out.println("HeadMap up to 'Three': " + headMap);

        // Getting the set of keys using keySet()
        Set<String> keySet = treeMap.keySet();
        System.out.println("Key set: " + keySet);

        // Getting the last key using lastKey()
        String lastKey = treeMap.lastKey();
        System.out.println("Last key: " + lastKey);

        // Adding multiple elements using putAll()
        Map<String, Integer> newEntries = new HashMap<>();
        newEntries.put("Five", 5);
        newEntries.put("Six", 6);
        treeMap.putAll(newEntries);
        System.out.println("TreeMap after putAll(): " + treeMap);

        // Removing an element using remove()
        treeMap.remove("One");
        System.out.println("TreeMap after removing key 'One': " + treeMap);

        // Getting the size of the TreeMap using size()
        int size = treeMap.size();
        System.out.println("Size of TreeMap: " + size);

        // Getting a tail map using tailMap()
        SortedMap<String, Integer> tailMap = treeMap.tailMap("Three");
        System.out.println("TailMap from 'Three': " + tailMap);

        // Getting the collection of values using values()
        Collection<Integer> values = treeMap.values();
        System.out.println("Values collection: " + values);

        // Clearing the TreeMap using clear()
        treeMap.clear();
        System.out.println("TreeMap after clear(): " + treeMap);
    }
}
