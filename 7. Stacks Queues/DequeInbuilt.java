import java.util.ArrayDeque;
import java.util.Deque;
public class DequeInbuilt {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(); // null elements are not allowed, Important for Tree

        deque.add(1);
        deque.addFirst(2);
        deque.addLast(3);

        System.out.println(deque);

        deque.add(44);
        deque.add(45);
        deque.add(46);

        System.out.println(deque);

        System.out.println();

        deque.remove();
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);
    }
}
