import java.util.Arrays;

public class Quick_sort_recursion 
{
    public static void main(String[] args) 
    {
        int[] arr = {2,3,6,6,21,2,8};
        System.out.println(Arrays.toString(arr));
        // Quicks_sort(arr, 0, arr.length-1);
        Quick_sort2(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

    }

    public static void Quicks_sort(int[] nums , int low , int high)
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

        Quicks_sort(nums, low, e);
        Quicks_sort(nums, s, high);
    }

    public static void Quick_sort2(int arr[] , int high , int low)
    {
        if(low < high)
        {
            int pidx = partition(arr , low , high);

            Quick_sort2(arr , pidx-1 , low);
            Quick_sort2(arr , high , pidx+1);
        }
    }

    public static int partition(int arr[] , int low , int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low ; j < high ; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;
    }
}
