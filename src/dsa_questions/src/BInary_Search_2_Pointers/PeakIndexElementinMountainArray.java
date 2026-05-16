package BInary_Search_2_Pointers;

//arr=[0,3,8,9,5,2]
//output = 3
//peak element is 9 and its index is 3
public class PeakIndexElementinMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = findPeakElement(arr);
        System.out.println(ans);
    }

    // return the index of smallest no >= target
    static int findPeakElement(int[] arr) {
        //to hadnle edge case we need to start from 1 and end from n-2
        int start = 1;
        int end = arr.length - 2;

        int index=-1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                return mid;
            } else if (arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) {
                end=mid-1;
            } else {
                // ans found
                start = mid + 1;
            }
        }
        return index;
    }
}