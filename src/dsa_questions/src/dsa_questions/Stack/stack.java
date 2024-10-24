package dsa_questions.Stack;
public class stack {
    int arr[]=new int[5];
    int top =0;
    public void push(int data)
    {
        if(top==5)
        {
            System.out.println("stack is full");
        }
        else
        {
            arr[top]=data;
            top++;
        }

    }
    public void display()
    {
        for(int n:arr)
        {
            System.out.print(n+",");
        }
    }
    public void peek()
    {
        int data=arr[top-1];//we are decreasing top becz after push the value of top is 4 or something which is beyond the size of an array, so we'll access the top element by doing top-1
        System.out.println("peek element="+data);
    }

    public void  pop() {
        top--;//we are decreasing top becz after push the value of top is 4 or something which is beyond the size of an array, so we'll access the top element by doing top-1
        int data=arr[top];
        arr[top]=0;
        System.out.println("Deleted element="+data);
    }

    public void size() {
        System.out.println("size of stack="+top);
    }

    public boolean isempty() {
        return top==0;
    }
}
