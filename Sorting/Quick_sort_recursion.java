import java.util.Arrays;

public class Quick_sort_recursion 
{
    public static void main(String[] args) 
    {
        int[] arr = {2,3,6,6,21,2,8};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] nums , int low , int high)
    {
        if(low >= high)
        {
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e-s)/2 ;
        int pivot = nums[mid];

        while( s <= e)
        {
            while( nums[s] < pivot)
            {
                s++;
            }

            while( nums[e] > pivot)
            {
                e--;
            }

            if( s <= e)
            {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        sort(nums, low, e);
        sort(nums, s, high);
    }
}
