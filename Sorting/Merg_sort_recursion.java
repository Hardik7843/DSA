import java.util.Arrays;

public class Merg_sort_recursion 
{
    public static void main(String[] args) 
    {
        int[] arr = {3,4,56,9,7};
        mergsortinplace(arr, 0, arr.length);
        // int[] ans = mergsort(arr);
        System.out.println(Arrays.toString(arr));
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

    private static int[] merge(int[] first, int[] second) 
    {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < first.length && j < second.length)
        {
            if(first[i] < second[j])
            {
                mix[k] = first[i];
                i++;
            }
            else
            {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i<first.length)
        {
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }



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

        for(int l =0 ; l < mix.length ; l++)
        {
            arr[s+l] = mix[l];
        }
    }
}
