package dsa_questions.src.recursion;

public class basic_1 {
    public static void main(String[] args) {
        int x=3;
        func1(x);
    }

    private static void func1(int x) {
        if(x<1)
        {
            return;
        }
        System.out.println(x);
        func1(x-1);
    }

}