package Arrays;


/*
* Given an array arr[] of distinct integers and an integer target, find all unique combinations of array where the sum of chosen element is equal to target. The same element may be chosen any number of times to make target.

Examples:

Input: arr[] = [1, 2, 3], target = 5
Output: 1,
Explanation: only 1  combbination here that is only 3 sand 2.

Input: arr[] = [2, 4], target = 1
Output: []
Explanation: No combination exits whose sum is equals to target
*  */

public class Target_Sum {

    static int findTarget(int arr[] ,  int target)
    {
        int pair=0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    pair++;
                }
            }
        }

        return pair;
    }

    public static void main(String[] args) {
        int arr[]={4,6,3,5,8,2};
        int target=7;
        System.out.println(findTarget(arr,target));
    }
}
