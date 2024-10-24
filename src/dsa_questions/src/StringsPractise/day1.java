import java.util.*;
public class day1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string=");
        String str="i am ahsan";
        /*
        next will take only first charecter input but
        nextLine take whole senetnce as  input;
         */

        //ways to decalre string
        String a=new String("ahsan");
        System.out.println(str);
        System.out.println(a);//print  ahsan
//        System.out.println(str.charAt(0));
        /*Returns the char value at the specified index
            An index ranges from 0 to length() - 1.
            The first char value of the sequence is at index 0,
            the next at index 1, and so on, as for array indexing.
        */

        char ch=str.charAt(5);
        System.out.println(ch);
        System.out.println(str.indexOf("ah"));
        String name="ahsanSiraj";
        String fullname="ahsansiraj";
        if(name.equals(fullname))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
        /* equals return true if both string are same(as it is)
            else false
         */
        if(name.equalsIgnoreCase(fullname))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

        /* equalIgnoreCase return true if both string are same
           wihtout considering upper case or lowe case
             false only when the are not same
         */

        String name1=new String("ahsan");
        String name2=new String("ahsan");

        String name3="ahsan";
        String name4="ahsan";
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));

        System.out.println(name3==name4);
    }
}
