package Arrays;

public class TripletSum {
    static int findTriplet(int arr[] ,  int target)
    {
        int pair=0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                for(int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        pair++;
                    }
                }
            }
        }

        return pair;
    }

    public static void main(String[] args) {
        int arr[]={1,4,5,6,3};
        int target=12;
        System.out.println(findTriplet(arr,target));
    }
}
