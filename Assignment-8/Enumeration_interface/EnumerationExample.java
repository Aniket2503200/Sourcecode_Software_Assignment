import java.util.Vector;
import java.util.Enumeration;

public class EnumerationExample {
    public static void main(String[] args) {
        // Create a vector and populate it with elements
        Vector<Double> numbers = new Vector<>();
        numbers.add(1.1);
        numbers.add(2.2);
        numbers.add(3.3);
        numbers.add(4.4);
        numbers.add(5.5);

        // Get the enumeration of the vector
        Enumeration<Double> enumeration = numbers.elements();

        // Iterate through the elements using Enumeration
        System.out.println("Elements in the vector:");
        while (enumeration.hasMoreElements()) {
            Double number = enumeration.nextElement();
            System.out.println("Element: " + number);
        }

    }
}
