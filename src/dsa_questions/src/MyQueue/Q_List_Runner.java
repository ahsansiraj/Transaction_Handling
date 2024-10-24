package MyQueue;

public class Q_List_Runner {
    public static void main(String[] args) {
        Queue_LinkedList queue=new Queue_LinkedList();
        queue.isEmpty();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();  // Display the queue elements

        queue.dequeue();  // Dequeue an element
        queue.display();  // Display the queue elements after dequeue

        System.out.println("Front element is: " + queue.peek());
        System.out.println("Queue size is: " + queue.size());
        System.out.println("Is queue empty? " + queue.isEmpty());

    }

}
