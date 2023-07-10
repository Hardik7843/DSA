import java.util.Arrays;

public class Quicksort
{
    public static void main(String[] args)
    {
        int arr[] = {78,96,32,4,58,31,-7};
        Arrays.sort(arr);
        QuickSort(arr , 0 , arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    public static void QuickSort( int arr[] , int low , int high)
    {
        if( low >= high)
        {
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        
        while (s <= e)
        {
            while (arr[s] < pivot)
            {
                s++;
            }

            while (arr[e] > pivot)
            {
                e--;
            }

            if (s <= e)
            {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                e--;
                s++;
            }

            QuickSort(arr , low , e);
            QuickSort(arr , s ,high);
        }
    }
}
