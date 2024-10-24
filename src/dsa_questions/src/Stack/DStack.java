package Stack;

import java.util.ArrayList;

public class DStack {
    ArrayList<Integer> arr=new ArrayList<>();
    int top=0;
    public void push(int data)
    {
        arr.add(data);
        top++;
    }
    public void display()
    {
        for(int n:arr)
        {
            System.out.print(n+",");
        }
        System.out.println();
    }
    public void peek()
    {
        int data= arr.get(top-1);//we are decreasing top becz after push the value of top is 4 or something which is beyond the size of an array, so we'll access the top element by doing top-1
        System.out.println("peek element="+data);
    }

    public void  pop() {
        top--;//we are decreasing top becz after push the value of top is 4 or something which is beyond the size of an array, so we'll access the top element by doing top-1
        int data=arr.get(top);
        arr.set(top,0);
        System.out.println("Deleted element="+data);
    }

    public void size() {
        System.out.println("size of stack="+top);
    }

    public boolean isempty() {
        return top==0;
    }
}

