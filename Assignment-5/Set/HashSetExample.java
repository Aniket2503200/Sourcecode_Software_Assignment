import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbersSet = new HashSet<>();

        numbersSet.add(10);
        numbersSet.add(20);
        numbersSet.add(30);

        Iterator it = numbersSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("HashSet: " + numbersSet);

        boolean contains20 = numbersSet.contains(20);
        System.out.println("Contains 20? " + contains20);

        numbersSet.remove(30);

        System.out.println("Updated HashSet: " + numbersSet);

        int setSize = numbersSet.size();
        System.out.println("Size of HashSet: " + setSize);

        numbersSet.clear();
        System.out.println("Cleared HashSet: " + numbersSet);

        boolean isEmpty = numbersSet.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);

    }
}
