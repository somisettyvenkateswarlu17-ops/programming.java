
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        if (dq.isEmpty()) {
            System.out.println("Deque is Empty");
        } else {
            System.out.println("Deque is Not Empty");
        }

        dq.add(10);

        System.out.println("After insertion: " + dq.isEmpty());
    }
}
