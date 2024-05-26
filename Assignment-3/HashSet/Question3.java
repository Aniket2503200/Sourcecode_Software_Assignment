import java.util.HashSet;

public class Question3 {
    public static void main(String args[]) {
        HashSet<Integer> myHashset = new HashSet<>();
        myHashset.add(10);
        myHashset.add(50);
        myHashset.add(100);
        System.out.println(myHashset);

        myHashset.remove(50);
        System.out.println(myHashset);
    }
}