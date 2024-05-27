import java.util.Vector;

public class Question13 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.removeElementAt(0);
        System.out.println(vector);
    }
}
