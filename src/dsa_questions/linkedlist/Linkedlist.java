package dsa_questions.linkedlist;

public class Linkedlist {
    Node head;
    public  void insert(int data)
    {
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;

        if(head==null)
        {
            head=newnode;
        }
        else {
            Node temp=head;
            while (temp.next!=null)
            {
                 temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    public  void display()
    {
            Node temp2=head;
//            while (temp2.next!=null)
//            {
//                System.out.println(temp2.data);
//                temp2=temp2.next;
//            }
//        System.out.println(temp2.data);

        while (temp2!=null)
            {
                System.out.println(temp2.data);
                temp2=temp2.next;
            }
    }
}
