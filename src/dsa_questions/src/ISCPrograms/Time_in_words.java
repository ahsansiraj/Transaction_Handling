import java.util.Scanner;

public class Time_in_words
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enters hour: ");

        int h = sc.nextInt();
        System.out.print("Enter minutes : ");


        int m = sc.nextInt();

        if((h>=1 && h<=12) && (m>=0 && m<=59))
        {


            String words[]={"", "One", "Two", "Three", "Four", "Five", "Six","Seven", "Eight", "Nine","Ten",
                    "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen",
                    "Twenty","Twenty one", "Twenty two", "Twenty three", "Twenty four", "Twenty five",
                    "Twenty six","Twenty seven","Twenty eight", "Twenty nine"};

            /* The below code is for finding whether to print the word 'minute' or 'minutes' */
            String p, a;
            if(m == 1 || m == 59)
                p = "Minute";
            else
                p = "Minutes";



            if(h==12)
                a = words[1]; //storing 'one' when hour is 12
            else
                a = words[h+1]; //if hour is not 12, then storing in words, an hour ahead of given hour



            if(m==0)
                System.out.println(words[h]+" O' clock");
            else if(m==15)
                System.out.println("Quarter past "+" "+words[h]);
            else if(m==30)
                System.out.println("Half past"+" "+words[h]);
            else if(m==45)
                System.out.println("Quarter to"+" "+a);
            else if(m<30) // condition for minutes between 1-29
                System.out.println(words[m]+" "+p+" "+" past "+" "+words[h]);
            else // condition for minutes between 31-59
                System.out.println(words[60-m]+" "+p+" to "+a);
        } //end of outer if

        else
            System.out.println("Invalid!");}
}