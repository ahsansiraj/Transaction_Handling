package MyQueue;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import  java.util.Queue;
public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue=new ArrayDeque<>();
        /*
         adding elemnt into the queue;
        */
        queue.add(1);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);

        System.out.println(queue.peek());//return the top elemmts in que order

//        System.out.println(queue.remove());//return and remove the top elemmts in que order
//        System.out.println(queue.remove());
//        System.out.println(queue.remove(4));
//        System.out.println(queue.remove());
//        System.out.println(queue.remove(5));

         /*
           * adding elemnt into the queue if the quyue is full;
           * do not throw an exception;
           * enqueue will throw the exeption but offer will not
        */
        queue.offer(7);
        queue.offer(8);
        queue.offer(10);

        System.out.println(queue);

//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.remove());

        /*
        * poll will return null if queue is empty
        * remove will throws exception if queue is empty;
        * java.util.NoSuchElementException
        */

    }
}
