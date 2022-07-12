import java.util.*;
public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(15);
        dq.offerFirst(34);
        dq.offer(12);
        dq.offerLast(50);
        System.out.println(dq);
        System.out.println(dq.peek());
        System.out.println(dq.peekLast());
        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }
}
