package BInary_Search_2_Pointers;

import java.util.Scanner;
public class FirstandLastOccurence {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]={5,7,7,8,8,10};
        int target=8;
        int answer[]=searchRange(nums,target);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
    static int[] searchRange(int[] nums, int target) {
        int index[]={-1,-1};

        index[0]=findIndex(nums,target,true);
        index[1]=findIndex(nums,target,false);
        return index;
    }

    static public int findIndex(int nums[],int target,boolean indexLeft)
    {
        int start=0;
        int end=nums.length-1;
        int answer=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(nums[mid]==target)
            {
                answer= mid;
                if(indexLeft)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return answer;
    }
}