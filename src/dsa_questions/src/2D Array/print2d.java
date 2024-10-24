import java.util.*;
public class print2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();
        System.out.println("eneter no of columns=");
        int m=sc.nextInt();
        print2d obj =new print2d();
        int matrix[][]=obj.input(n,m);
        obj.print(matrix,n,m);
    }
    public int[][] input(int n,int m)
    {
        int matrix[][]=new int[n][m];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elemnt in array=");
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        return  matrix;
    }

    public void print(int matrix[][],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
