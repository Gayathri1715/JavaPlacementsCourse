import java.util.*;
public class Queues {// Queues are data structures which are implemented like first in first out
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(3);
        que.offer(40);
        que.offer(34);
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que);
        System.out.println(que.peek());
        
    }
}
