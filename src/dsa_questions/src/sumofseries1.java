package dsa_questions.src;
import java.util.*;
public class sumofseries1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter any number=");
        int num=sc.nextInt();
        double sum=0.0;
        for (int i = 1; i <=num ; i++) {
            int fact=1;
            for(int j=1;j<=i;j++)
            {
                fact=fact*j;
            }
            sum=sum+ ((float) 1 /fact);
            System.out.println((float) 1/fact);
        }
        System.out.println(sum);
    }
}

