package Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        stack nums=new stack();
        nums.push(43);
        nums.display();
        nums.push(54);
        nums.display();
        nums.push(23);
        nums.display();
        nums.push(878);
        nums.display();
        nums.push(56);
        nums.display();
        nums.peek();
        nums.pop();
        nums.display();
        nums.size();
        System.out.println("Empty="+nums.isempty());
    }

}
