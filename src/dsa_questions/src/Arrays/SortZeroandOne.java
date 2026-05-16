package Arrays;


//using two pointer techniques

public class SortZeroandOne {
    static int[] findUnique(int arr[])
    {
        int left=0;
        int right=arr.length-1;

        while (left<=right)
        {
                if(arr[left]!=arr[right])
                    {
                        int temp=arr[left];
                        arr[left]=arr[right];
                        arr[right]=temp;
                    }
                left++;
                right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,0,1,1,1,0,0,0,1};
        System.out.println(findUnique(arr));
    }
}
