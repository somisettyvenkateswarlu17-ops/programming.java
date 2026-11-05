
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // Insert elements
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(30);
        dq.addLast(40);

        System.out.println("Deque: " + dq);

        // Delete from front
        dq.removeFirst();
        System.out.println("After Delete Front: " + dq);

        // Delete from rear
        dq.removeLast();
        System.out.println("After Delete Rear: " + dq);

        // Display first and last
        System.out.println("Front: " + dq.peekFirst());
        System.out.println("Rear: " + dq.peekLast());
    }
}
