package dsa_questions.linkedlist;

public class Insertion {

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
            tail=newnode;

        }
    }


    private void insertatfirst(int data)//merhod to insert new node
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
            newnode.next=head;
            head=newnode;

        }
    }

    private void insertatPos(int index,int data)//method to insert new node at position
    {
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;
        if(index==0)
        {
            insertatfirst(data);
//            return;
        }
        else
        {
            Node temp=head;
            int count=0;
//            while(count<index-1)
//            {
//                temp=temp.next;
//                count++;
//            }
            /*we can also do this using for loop*/
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }

            newnode.next=temp.next;
            temp.next=newnode;

        }
    }
    private void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }


    public static void main(String[] args) {
        Insertion list=new Insertion();
        list.insert(10);
        list.insert(90);
        list.insert(78);
        list.insert(43);
//        node.display();
//        node.display();
//        System.out.println(node.tail.data);
        list.insertatfirst(23);//inserting at first index;
//        list.display();
        list.insertatPos(2,13);
        list.insertatPos(0,56);
        list.display();

    }
}
