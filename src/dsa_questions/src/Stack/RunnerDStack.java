package Stack;

public class RunnerDStack {
    public static void main(String[] args) {
        DStack nums=new DStack();
        System.out.println("Empty="+nums.isempty());
        nums.push(43);
        nums.push(54);
        nums.push(23);
        nums.push(878);
        nums.push(56);
        nums.push(34);
        nums.push(4);
        nums.push(5);
        nums.push(7);

        nums.display();
        nums.size();
        nums.peek();
        nums.pop();
        nums.display();
        nums.size();
        System.out.println("Empty="+nums.isempty());
    }

}
