package dsa_questions.linkedlist;

public class FindMiddle {
    private class Node {

        int data;
        Node next;
    }

    Node head;
    Node tail;

    private void insert(int data)//method to insert new node
    {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;

        }
    }

    private void middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
    }

    public static void main(String[] args) {
        FindMiddle list = new FindMiddle();
        list.insert(10);
        list.insert(90);
        list.insert(78);
        list.insert(43);
    }
}
