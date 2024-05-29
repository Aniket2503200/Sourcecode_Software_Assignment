
import java.util.LinkedList;
import java.util.Queue;

public class Question1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // Add elements to the queue
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Orange");
        queue.offer("Mango");

        System.out.println("Queue: " + queue);

        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        String remElement = queue.poll();
        System.out.println("Removed element: " + remElement);

        System.out.println("Queue after removal: " + queue);

        String peekElement = queue.peek();
        System.out.println("Peek element: " + peekElement);

        System.out.println("Queue after peeking: " + queue);
    }
}
