import java.util.HashSet;

public class Question2 {
    public static void main(String args[]) {
        HashSet<Integer> myHashset = new HashSet<>();
        myHashset.add(10);
        myHashset.add(50);
        myHashset.add(100);

        if (myHashset.contains(10)) {
            System.out.println("It conatins 10");
        } else {
            System.out.println("It does not conatins 10");
        }
    }
}