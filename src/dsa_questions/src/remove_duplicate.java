import java.util.*;
public class remove_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size=");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] temp = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("enter elemnts=");
            arr[i] = sc.nextInt();
        }
        // for(int i=0;i<size;i++)
        // {
        // for(int j=i+1;j<size;j++)
        // {
        // if(arr[i]==arr[j])
        // {
        // temp[i]=arr[i];
        // arr[j]=0;
        // // c++;
        // }
        // }
        // }
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] != 0) {
        // temp2[countNonZero++] = arr[i];
        // }
        // }

        // Print non-zero elements in temp2
        // for (int i = 0; i < countNonZero; i++) {
        // System.out.println(temp2[i]);
        // }
        // for (int i = 0; i < countNonZero; i++) {
        // arr[i] = temp2[i];
        // }
        // for (int i = 0; i < size; i++) {
        // System.out.println(arr[i]);
        // }
        int j = 0, count = 0;
        for (int i = 1; i < size; i++) {
            if (arr[j] != arr[i]) {
                temp[count] = arr[j];
                count++;
                j = i;
                i = i + 1;
            }
        }
        temp[count] = arr[j];//this line is must for this code to copy last elmemnt
        System.arraycopy(temp, 0, arr, 0, count + 1);
        for (int i = 0; i <= count; i++) {
            System.out.println(arr[i]);
        }
    }
}
