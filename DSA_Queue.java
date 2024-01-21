import java.util.Queue;
import java.util.LinkedList;

public class DSA_Queue {
    public static void main(String[] args){
        // Queue = FIFO data structure. 
        // enqueue = offer, dequeue = poll

        Queue<String> queue = new LinkedList<String>();
        queue.offer("Karen"); //adds the elements in queue
        queue.offer("Chad");
        queue.offer("Harold");
        queue.offer("Steve");
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll(); //removes the first element i.e. Karen
        System.out.println(queue.isEmpty());
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));
    }
}
