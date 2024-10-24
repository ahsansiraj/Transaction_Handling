import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String str="ahsan";
        String str1="nasha";
        System.out.println(str==str1);

        String a="abc";
        String b="cba";
        System.out.println(a.contentEquals(b));

        String test="ahsan";
        for(int i=0;i<=str.length()-1;i++) {
            System.out.print(test.charAt(i));
        }
        System.out.println();
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}