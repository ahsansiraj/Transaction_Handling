package MyQueue;

public class PriorityQRunner {
    public static void main(String[] args) {
        priorityQ_Self queues =new priorityQ_Self(4);

        queues.enqueue(12);
        queues.enqueue(10);
        queues.enqueue(1);
        queues.enqueue(2);

        queues.display();

        queues.dequeue();

    }

}
