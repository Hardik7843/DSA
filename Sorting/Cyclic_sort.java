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
 */

/*
 * Idea: if array contains elements in range of 0 to n-1 or 1 to n.
 * where n is length of the array. then we will know each element's 
 * position in the array. 
 * 
 * Steps takes place in cyclic sort
 * 
 * Intution : if elements are in range [1-n] inclusive. then position 
 * (i) element is i-1. i.e it's correct position(corrpos).
 * Step 1: Start for loop from start to end element of array.
 * Step 2: Pick one element from the current pointer of for loop and calculate 
 *         correct position i.e [ CorrPos = arr[i]-1 ] incase the array contains 
 *         elements from (1 to n-1).
 * Step 3: if elements at correct position(corrpos) is already there then increment the 
 *         loop pointer (i). else swap the element at correct postion (corrpos) with 
 *         element at loop pointer (i)
 * by repeating this steps will give us the sorted array.
 * Note : this algorithim can only handle array with distinct element.
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
