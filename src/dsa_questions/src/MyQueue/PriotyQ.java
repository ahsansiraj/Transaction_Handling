package MyQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriotyQ {
    public static void main(String[] args) {

        Queue<Integer> queue =new PriorityQueue<>();

        queue.add(10);
        queue.add(5);
        queue.add(4);
        queue.add(1);

        System.out.println(queue);//return queues in sorted order

        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());//return queues in sorted order priority wise
        }
    }
}
