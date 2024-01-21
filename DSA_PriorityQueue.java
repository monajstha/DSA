import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DSA_PriorityQueue {
    public static void main(String args[]) {
        // A FIFO data structure that serves elements with the 
        // highest priorities first before elements with 
        // lower priority

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); 
        // Priority queue sorts, while using the reverse parameter 
        // reverses the order
        queue.offer(3.0);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.3);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }


    }
}
