package MyQueue;
class Queue_LinkedList {

    Node front;
    Node rear;
    private int size;

    Queue_LinkedList()
    {
        this.size=0;
        this.front=null;
        this.rear=null;
    }

    public void enqueue(int val) {
        Node newNode = new Node(val);

        // If the queue is empty, the new node is both front and rear
        if (rear == null) {
            front = rear = newNode;
        } else {
            // Add the new node at the end of the queue and change rear
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    // Dequeue method to remove an element from the queue
    public void dequeue() {
        if (front == null) { // Check if the queue is empty
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }

        // Move front to the next node
        int data = front.data;
        front = front.next;

        // If the front becomes null, then the queue is empty
        if (front == null) {
            rear = null;
        }

        size--;
        System.out.println(data + " dequeued from the queue");
    }

    public int peek()
    {
        if(front==null)
        {
            System.out.println("Queue is empty cannot return peek");
        }
        return front.data;
    }

    public boolean isEmpty()
    {
        return front==null;
    }

    public  int size()
    {
        return size;
    }

    public void display()
    {
        if(front==null)
        {
            System.out.println("queue is empty");
            return;
        }
        Node temp=front;
        while(temp!=null)
        {
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.println();
    }
}
