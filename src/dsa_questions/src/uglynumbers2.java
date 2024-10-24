package dsa_questions.src;

public class uglynumbers2 {
    public static int nthUglyNumber(int n) {
        int count;
        int ugly=0;
        for(int i=1;i<=n;i++)
        {
            count=0;
            if(n%i==0)
            {
                for(int j=1;j<=i;j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if(count==2)
                {
                    if(count==2||count==3||count==5)
                    {
                        ugly=i;
                        return ugly;
                    }
                }
            }
        }
        return ugly;
    }
    public static boolean checkugly(int n)
    {
        int count;
        for(int i=1;i<=n;i++)
        {
            count=0;
            if(n%i==0)
            {
                for(int j=1;j<=i;j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if(count==2)
                {
                    if(count==2||count==3||count==5)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=6;
        int ugly=nthUglyNumber(n);
//        System.out.println(checkugly(n));
        System.out.println(ugly);

    }

}
