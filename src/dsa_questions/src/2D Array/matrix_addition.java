import java.util.*;
class matrix_addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int sum[][]=new int [row][col];
        int b[][] =new int[row][col];
        int a[][] =new int[row][col];

        //taking input in array
        for (int i = 0; i < a.length; i++) {
            {
                for (int j=0;j<a[i].length;j++)
                {
                    a[i][j]=sc.nextInt();
                }
                System.out.println();
            }
        }


        //taking input in array
        for (int i = 0; i < row; i++) {
            {
                for (int j=0;j<b[i].length;j++)
                {
                    b[i][j]=sc.nextInt();
                }
                System.out.println();
            }
        }

        if(a[row][col]==b[row][col])
        {
            for (int i = 0; i < row; i++) {
                {
                    for (int j=0;j<col;j++)
                    {
                        sum[i][j]=a[i][j]+b[i][j];
                    }
                    System.out.println();
                }
            }

            for (int i = 0; i < row; i++) {
                {
                    for (int j=0;j<col;j++)
                    {
                        System.out.print(sum[i][j]+",");
                    }
                    System.out.println();
                }
            }
        }



    }
}
