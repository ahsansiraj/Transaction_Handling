package dsa_questions.src.ISCPrograms;
import java.util.Scanner;
public class LUCKYNUMBER {
        public static void main(String args[])//throws IOException
        {

            Scanner sc = new Scanner(System.in);
            System.out.print("EnterNumber of Elements : ");

            int n= sc.nextInt();

            int a[]=new int[n];
            int c=n;

            for(int i=0;i<n;i++)
            {
                a[i]=i+1;
            }

            int del=1;
            System.out.println("ny Number Operation :n");

            while (del < n) {
                for (int i = del; i <n ; i+=del) {
                    for (int j = i; j < n-1; j++) {
                        a[j]=a[j+1];
                    }
                    n--;
                }
                del++;

                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }


            System.out.print("nHence Lucky Numbers Less than "+c+" are : ");
            for(int i=0; i<n; i++)
            {
                System.out.print(a[i]+" ");
            }
        }
    }