package dsa_questions.linkedlist;

public class Findtail {
    private class Node
    {

        int data;
        Node next;

    }
    Node head; Node tail;
    private void insert(int data)//merhod to insert new node
    {
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;

        }
    }
    private void tailfind()
    {
        Node temp=head;
            while(temp.next!=null) {
                temp = temp.next;
                tail=temp;
            }
        System.out.println(tail.data);
    }
    public static void main(String[] args) {
        Findtail list=new Findtail();
        list.insert(10);
        list.insert(90);
        list.insert(78);
        list.insert(43);
        list.tailfind();
    }
}
