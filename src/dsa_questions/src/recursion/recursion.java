package recursion;

import java.util.Scanner;
class Palindrome{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();
        boolean p=pal(num,1);
        System.out.println(p == true ? "number is palindrome" : "number is not palindrome");
    }

    private static boolean pal(int num,int rev) {
        if(num==0) return true;
        int dig=num%10;
        rev=rev*10+dig;

        return pal(num/10,rev);
    }
}
