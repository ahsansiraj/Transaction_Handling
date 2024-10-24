package dsa_questions.linkedlist;

public class reverse_linked_list {

    private class Node
    {

        int data;
        Node next;

    }
    static Node head; static Node tail;
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
    private Node reverse(Node head)
    {
        Node prev=null;
        Node current=head;
        Node next=head.next;
        while(current!=null && current.next!=null)
        {
            current.next=prev;
            prev=prev.next;
            next=next.next;
        }
        return head;
    }
    private Node find_middle(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null& fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public static void main(String[] args) {
        reverse_linked_list list=new reverse_linked_list();
        list.insert(10);
        list.insert(90);
        list.insert(78);
        list.insert(43);
        Node second_half=list.find_middle(head);
        Node reverse_head=list.reverse(second_half);
    }
}
