import java.util.HashSet;

public class Question4 {
    public static void main(String args[]) {
        HashSet<Integer> myHashset = new HashSet<>();
        myHashset.add(10);
        myHashset.add(50);
        myHashset.add(100);
        System.out.println(myHashset);

        myHashset.clear();
        System.out.println(myHashset);
    }
}