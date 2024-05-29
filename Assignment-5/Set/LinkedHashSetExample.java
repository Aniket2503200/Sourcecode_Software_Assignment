import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Double> numbersSet = new LinkedHashSet<>();

        numbersSet.add(10.5);
        numbersSet.add(20.7);
        numbersSet.add(30.9);

        Iterator it = numbersSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("LinkedHashSet: " + numbersSet);

        boolean contains20 = numbersSet.contains(20.7);
        System.out.println("Contains 20.7? " + contains20);

        numbersSet.remove(30.9);

        System.out.println("Updated LinkedHashSet: " + numbersSet);

        int setSize = numbersSet.size();
        System.out.println("Size of LinkedHashSet: " + setSize);

        numbersSet.clear();
        System.out.println("Cleared LinkedHashSet: " + numbersSet);

        boolean isEmpty = numbersSet.isEmpty();
        System.out.println("Is LinkedHashSet empty? " + isEmpty);
    }
}
