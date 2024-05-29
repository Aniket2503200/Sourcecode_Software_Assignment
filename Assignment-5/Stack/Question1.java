import java.util.Stack;

public class Question1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack : " + stack);
        System.out.println("Top element: " + stack.peek());

        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement); // Output: 30

        System.out.println("Stack after pop: " + stack);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        int searchElement = stack.search(20);
        System.out.println("Position : " + searchElement);

    }
}
