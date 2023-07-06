   /* 
    i | j
    --|--
    0 | 1
    1 | 2
    2 | 3
    3 | 4
    4 | 5
    5 | 6

*/

/*
 * What is insertion sort
 * we take elements from unsorted array one by one and try to put into sorted array.
 * [ 1, 2, 8, 6, 4 ]
 * For this example I start from the start my sorted array from element at 
 * 0th index. so Initially i have only one element in sorted array. then 
 * I increment my (i) pointer and take (j=i+1) element as unsorted element from 
 * unsorted array. then I swap the (j) element with elements in sorted array untill
 * it gets it's exact location i.e element (j) element should be greater then (j-1) 
 * element. once it placed at correct place then (i) is incremented to pick next 
 * unsorted element.
 */

/*
 * Worst time complexity: O(n*n)
 * Best time complexity: O(n)
 * 
 * Why use Insertion sorting
 * $ It is stable 
 * $ It is used for smaller sized arrays.
 * $ Works good for partially sorted arrays.
 * $ It is hybrid sorting algorithim.
 * 
 */
public class Insertion_sort 
{
    public static void main(String[] args) 
    {
        int arr[] = {-1,-6,-6,-2,1};
        insertion_sort(arr);
        for (int i : arr) 
        {
            System.out.println(i);
        }

    }

    public static void insertion_sort(int arr[])
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i+1 ; j > 0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
    }
}
