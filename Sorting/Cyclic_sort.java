/*
 * Cyclic sort is special type of algorithims.
 * in cyclic sort we sort element in one go or in one for loop.
 * 
 * To identify the need of cyclic sort in the question we need to find this line
 * " Sort the given array of elements ranging from (1 - N)."
 * 
 * Time complexity of cyclic sort: O(n)
 * number of comparisons: first the (n-1) swaps and checks for sorting array post
 * that it makes n checks for checking the elements.
 * 
 */


import java.util.Arrays;

public class Cyclic_sort 
{
    public static void main(String[] args) 
    {
        int arr[] = {8,7,3,5,3,6,1,4};
        System.out.println("Hii");
        cyclic_sort(arr);

        System.out.println(Arrays.toString(arr));
        
    }

    //Function for sorting given intger array
    public static void cyclic_sort(int[] arr)
    {
        int i =0;  // This code is commented for a reason dont run it is overloading cpu.
        while ( i < arr.length )
        {
            int CorrPos = arr[i]-1;
            //Finding whether elements are at their correct indices

            if(arr[i] != arr[CorrPos] && arr[i] > 0)
            {
                //if the aren't then swapping them
                swap(arr, CorrPos , i);
                System.out.println("value of i: "+ i);
            }
            else 
            {
                i++;
            }
        } 
    }

    public static void swap(int arr[] , int to , int with)
    {
        int temp = arr[to];
        arr[to] = arr[with];
        arr[with] = temp;
    }
}

/*
 * Original: [1,2,5,3,4]
 * Sorted: [1,2,3,4,5]
 */


//  4,3,2,7,8,2,3,1
