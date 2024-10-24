package dsa_questions.src.ISCPrograms;
// A Smith number is a composite number whose sum of digits equals to the sum of digits of its prime factors, excluding 1
import java.util.Scanner;
public class Smithnumber {
    public static int  sumofdigit(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
    public static int  sumoofprime(int n)
    {
        int i=2,sum=0;
        while(n>1)
        {
            if(n%i==0)
            {
                sum=sum+sumofdigit(i);
                n=n/i;
            }
            else {
                i++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number=");
        int num=sc.nextInt();
        int b=sumofdigit(num);
        int c=sumoofprime(num);

        System.out.println("sum of digit="+b);
        System.out.println("sum of prime factors="+c);

        if(b==c)
        {
            System.out.println("number is smith number");
        }
        else {
            System.out.println("not a smith number");
        }
    }

}
