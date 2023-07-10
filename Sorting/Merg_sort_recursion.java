/*
 * mersort is used sort the array using recursion.
 * It recursively breakes the array into two parts until
 * only one element is remaining. then it merge two seperated array
 * using two pointers. the two pointer points to start of both arrays.
 * it compares both pointer's elements and smaller element get place in 
 * new array i.e merged array.
 * 
 * Steps for mergesort 
 * Step 1: Take the input array for seperating it into two parts.
 *         if it contains only one element then direct return it. else calculate
 *         mid position from where we need to divide the array.
 * Step 2: Now give array (from start to mid) [mid exclusive] to 1st call of "mergesort" function (Left Array)
 *         and pass the array (from mid to end) [end exclusive] to 2nd call of "mergesort" function (Right Array)
 * Step 3: Now call the "merge" function to merge left and right array. 
 * Step 4: In "merge" function put two pointers (i) for (left) and (j) for (right) at start of array.
 * Step 5: and compare if (left[i] < right[j]) then left's element will be placed into merged column.
 *         else right's elements will be placed.
 * Step 6: while performing step 5 if any one from right or left array gets complited then remaining elements
 *         from the other array must be put into merged array.
 */   

 
/*
 * Arrays.copyOfRange() is a method from array class it used to copy the array elements 
 * in a range. the range can be specified by using two variables "from" and "to"
 * "from" specifies the start index (inclusive)
 * "to" specifies the last index (exclusive)
 */
import java.util.Arrays;

public class Merg_sort_recursion 
{
    public static void main(String[] args) 
    {
        int[] arr = {3,4,56,9,7};
        mergsortinplace(arr, 0, arr.length);
        int[] ans = mergsort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergsort(int[] input)
    {
        if(input.length == 1)
        {
            return input;
        }

        int mid = input.length/2;

        int[] left = mergsort(Arrays.copyOfRange(input, 0, mid));
        int[] right = mergsort(Arrays.copyOfRange(input, mid, input.length));

        return merge(left , right);
    }

    private static int[] merge(int[] left, int[] right) 
    {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < left.length && j < right.length)
        {
            if(left[i] < right[j])
            {
                mix[k] = left[i];
                i++;
            }
            else
            {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<left.length)
        {
            mix[k] = left[i];
            i++;
            k++;
        }

        while(j<right.length)
        {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }


/*
 * Mergesort inplace:
 * Idea : Instead of passing copyofarray jusst pass the index to mergeinplce and mergsortinplace operation.
 * 
 */
    private static void mergsortinplace(int[] arr , int s ,int e)
    {
        if(e - s == 1)
        {
            return;
        }

        int mid = (s+e)/2;

        mergsortinplace(arr ,s , mid);
        mergsortinplace(arr, mid, e);

        mergeinplace(arr , s , mid , e);
    }

    private static void mergeinplace(int[] arr, int s , int mid , int e) 
    {
        // this merger array is created from the original array.
        // by using mergsort techniques but as we doing inplace operation that's why 
        // we need to modify the original array instead of returning mix(merged) array
        // thus will copy elements of mix array one by one into original array.
        int[] mix = new int[e-s];
        
        int i = s;
        int j = mid;
        int k = 0;
        
        while(i < mid && j < e)
        {
            if(arr[i] < arr[j])
            {
                mix[k] = arr[i];
                i++;
            }
            else
            {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i< mid)
        {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j< e)
        {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // here is a for loop to copy the elements of mix array into 
        // original array 
        for(int l =0 ; l < mix.length ; l++)
        {
            arr[s+l] = mix[l];
        }
    }
}
