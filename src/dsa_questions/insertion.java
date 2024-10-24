package dsa_questions;
import java.util.*;
public class insertion {
    public static void main(String[] args) {
        int arr[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("entere arrya size=");
        int size=sc.nextInt();
        System.out.println("entere position=");
        int pos=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=size;i>pos;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos]=10;
        size++;
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]+",");
        }
    }
}
