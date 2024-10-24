package dsa_questions.linkedlist;

import java.awt.geom.Line2D;
import java.util.LinkedList;

public class Insert {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(43);
        list.add(32);
//        for(int data:list)
//        {
//            System.out.println(data);
//        }

        list.addFirst(324);
        for(int data:list)
        {
            System.out.println(data);
        }
        System.out.println("peak element="+list.peek());

    }
}
