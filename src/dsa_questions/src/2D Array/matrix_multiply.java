import java.util.*;

public class matrix_multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for the first matrix
        System.out.print("Enter number of rows for matrix A: ");
        int rowA = sc.nextInt();
        System.out.print("Enter number of columns for matrix A: ");
        int colA = sc.nextInt();

        // Input dimensions for the second matrix
        System.out.print("Enter number of rows for matrix B: ");
        int rowB = sc.nextInt();
        System.out.print("Enter number of columns for matrix B: ");
        int colB = sc.nextInt();

        // Ensure the matrices can be multiplied
        if (colA != rowB) {
            System.out.println("Matrix multiplication is not possible with the given dimensions.");
            return;
        }

        int[][] a = new int[rowA][colA];
        int[][] b = new int[rowB][colB];
        int[][] product = new int[rowA][colB];

        // Taking input for matrix A
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Taking input for matrix B
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < colB; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Multiplying matrices A and B
        multiply(a, b, product, rowA, colA, colB);

        // Printing the resulting matrix
        System.out.println("Resulting matrix after multiplication:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiply(int[][] a, int[][] b, int[][] product, int rowA, int colA, int colB) {
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colA; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
}
