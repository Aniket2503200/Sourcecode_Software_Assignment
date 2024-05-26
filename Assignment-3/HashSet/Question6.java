import java.util.HashSet;
import java.util.Iterator;

public class Question6 {
    public static void main(String args[]) {
        HashSet<Integer> myHashset = new HashSet<>();
        myHashset.add(10);
        myHashset.add(50);
        myHashset.add(100);
        System.out.println(myHashset);

        Iterator it = myHashset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}