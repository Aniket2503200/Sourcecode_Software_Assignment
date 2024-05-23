import java.util.Scanner;

public class Class_Object_2 {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Class_Object_2 calculator = new Class_Object_2();
        int a, b;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a and b : ");
        a = sobj.nextInt();
        b = sobj.nextInt();

        int sum = calculator.add(a, b);
        int difference = calculator.subtract(a, b);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
