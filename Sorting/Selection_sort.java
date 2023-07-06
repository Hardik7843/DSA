// import java.lang.Math;

/*
 * Selection sort selects either the maximum or minimimum elements from unsorted part of the array
 * and swap this element from the either of boundry element. if we select maximum element form 
 * unsorted array then will replace it with last element of array and vice versa.
 * 
 * Steps takes place in selection sort
 * Step 1: Set last pointer to (n-1) where n is length of array.
 * Step 2: Now pick largest element from the array the place it on end of array.
 * Step 3: Decrement last pointer as last element of array is sorted, so our unsorted 
 *         array reduces by 1 element.
 * Step 4: Now pick the largest element from unsorted array and replace it with last 
 *         element of unsorted array. 
 * Step 5: Now decrement the Last pointer and repeat from step 2.
 */
public class Selection_sort
{
    public static void main(String[] args) 
    {
        int [] arr = {-5,-8,-5,5,-89};
        Selec_sort(arr);
        for (int i = 0 ; i < arr.length ; i++) 
        {
            System.out.println("Element at " + i + "th index is: "+ arr[i]);
        }
    }


    //Main function for selection sort algo.
    static void Selec_sort(int arr[])
    {
        if(arr.length == 0)
        {
            System.err.println("Empty array");
            return;
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            int last = arr.length-1-i; // last pointer points towards the last element of 
                                       // it moves from index n-1 to 0 where n is length of input array.
            // calling of maxIndex function
            int maxIndex = maxIndex(arr , 0 , last);


            swap(arr, last, maxIndex);
        }
    }


    // Helper function for swapping any two elements
    static void swap(int arr[] , int l1 , int l2)
    {
        // I hope I dont have to explain this stuff. you are smart enough. don't dissapoint me :)
        int temp = arr[l1];
        arr[l1] = arr[l2];
        arr[l2] = temp;
    }

    // Helper function to select index of largest element from unsorted part of the array.
    static int maxIndex(int arr[] , int start , int last)
    {
        // I leave this to you for understanding, as brain excercise. Ahh no need to thank me mewwww.
        int maxI = start;
        for(int i = start+1 ; i<=last ; i++)
        {
            if(arr[maxI] < arr[i])
            {
                maxI = i;
            }
        }
        return maxI;
    }
}