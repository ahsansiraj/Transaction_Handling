package MyQueue;
import java.util.*;

public class Reversqueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack =new Stack<>();
        queue.add(1);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("Before:"+queue);

        while(!queue.isEmpty())
        {
            stack.push(queue.poll());
        }

        while(!stack.isEmpty())
        {
            queue.offer(stack.pop());
        }

        System.out.println("After:"+queue);
    }
}