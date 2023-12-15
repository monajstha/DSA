import java.util.Queue;
import java.util.LinkedList;

public class DSA_Queue {
    public static void main(String[] args){
        // Queue = FIFO data structure. 
        // enqueue = offer, dequeue = poll

        Queue<String> queue = new LinkedList<String>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Harold");
        queue.offer("Steve");
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.contains("Harold"));
    }
}
