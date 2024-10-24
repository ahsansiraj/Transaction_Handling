package dsa_questions.src.ISCPrograms;

import java.util.Scanner;
public class Dayselapsed {
    public  int calulatedays(int d,int m,int y,int d1,int m1,int y1,int arr[])
    {
        int days=calulatefirst(d,m, y,arr);
        int days1=calulatefirst(d1,m1, y1,arr);
        int totaldays=days1-days;
        return totaldays;
    }
    public int calulatefirst(int d,int m,int y,int arr[])
    {
        for(int i=0;i<m-1;i++)
        {
            d+=arr[i];
        }
        if((y%4==0 && y%100!=0)||(y%400==0))//if input year is leap year
        {
            return d+1;                     // then we'll enqueue one extra day
        }
        return d; //otherwise return simple d
    }
    public int calulatesecond(int d1,int m1,int y1,int arr[])
    {
        for(int i=0;i<m1-1;i++)
        {
            d1+=arr[i];
        }
        if((y1%4==0 && y1%100!=0)||(y1%400==0))//if input year is leap year
        {
            return d1+1;            // then we'll enqueue one extra day
        }
        return d1;  //otherwise return simple d
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first dates=");
        int d=sc.nextInt();
        int m=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("enter second dates=");
        int d1=sc.nextInt();
        int m1=sc.nextInt();
        int y1=sc.nextInt();
        int arr[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Dayselapsed obj=new Dayselapsed();
        int td=obj.calulatedays(d,m,y,d1,m1,y1,arr);
        System.out.println("differnce="+td);
}
}