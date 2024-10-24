package dsa_questions.src.OOPS_Practice;

public class pract2 {
    static int a=10;
    public static void add()
    {
        a++;
        int ans=demo2(a);
        System.out.println(ans);
    }
    public static int  demo2(int a)
    {
        a=a*2;
        return a;
    }

    public static void main(String[] args) {
        add();
        System.out.println(a);
    }
}
