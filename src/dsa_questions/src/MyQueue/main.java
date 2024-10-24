package MyQueue;

public class main {
    private  int size;
    private int arr[];
    private int front;
    private int rear;
    main(int capacity)
    {
        this.size=0;
        this.arr=new int[capacity];
        this.front=0;
        this.rear=0;
    }
    public void enqueue(int val)
    {
        if(size==arr.length)
        {
            System.out.println("queue is full");
            return;
        }
        arr[rear]=val;
        size++;
        rear=(rear+1)% arr.length;
    }

    public void display()
    {
        for(int ele:arr)
        {
            System.out.println(ele);
        }
    }

    public void dequeue() {
        if (size == 0) {  // Check for queue underflow
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }

        int data = arr[front];
        arr[front] = 0; // Optional: clear the spot where the element was dequeued
        front = (front + 1) % arr.length;
        size--;

        System.out.println("Dequeued: " + data);
    }

    public int  size() {
        return size;
    }

    public boolean isEmpty() {
        return size>0;
    }
}
