package BInary_Search_2_Pointers;


public class SearchinRotatedSortedArray2 {


    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(search(arr,2));
    }

    static public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: Target found
            if (nums[mid] == target) {
                return true;
            }

            // Case 2: The Duplicate Trap
            // If the boundaries and mid are identical, we can't tell which side is sorted.
            // Shrink the window from both ends safely.
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue; // Jump to the next iteration with the smaller window
            }

            // Case 3: Left side is normally sorted
            if (nums[start] <= nums[mid]) {
                // Check if target lies within the sorted left half
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Case 4: Right side is normally sorted
            else {
                // Check if target lies within the sorted right half
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }
}