package BInary_Search_2_Pointers;

public class SerachinRotatedSortedArray {


    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        int answer=search(nums,target);
        System.out.println(answer);
    }

    static public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If no pivot is found, the array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        // If pivot is found, we have two sorted ascending sub-arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, 0, pivot - 1, target);
        }

        return binarySearch(nums, pivot + 1, nums.length - 1, target);
    }

    static int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1; // Corrected: Move start forward
            }
        }
        return -1;
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: Mid is the pivot (e.g., [4, 5, 6, 1, 2])
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            // Case 2: Mid-1 is the pivot
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // If the left side is sorted, pivot must be on the right
            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
