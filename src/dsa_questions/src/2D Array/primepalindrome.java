import java.util.*;
public class primepalindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter m");
        int m=sc.nextInt();
        if(m>3000 || n > 3000 || n > m)
        {

            System.out.println("out of range");
        }
        else {
            displayPrimePalindrome(n, m);
        }


    }
    public static void displayPrimePalindrome(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count!=2)
        {
            return false;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int rev = 0;
        int temp = num;
        while (temp != 0) {
            int dig = temp % 10;
            rev = rev * 10 + dig;
            temp = temp / 10;
        }
        return rev == num;
    }

}
