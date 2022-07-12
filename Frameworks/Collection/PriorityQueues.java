import java.util.*;
public class PriorityQueues {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(2);
        pq.offer(23);
        pq.offer(45);
        pq.offer(12);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());



    }
}
