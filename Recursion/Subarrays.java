/*
 * Time complexity: O(number of levels in recursion tree * time taken for each level)
 * number of levels in recursion tree : number of elements in the array
 * number of subsets getting added in each iteration of outer forloop : 2^n
 * Time : O(n * 2^n)
 * Space : O(space if one subset(n) * total subsets(2^n))
 */

import java.util.ArrayList;
import java.util.Arrays;


public class Subarrays 
{
    public static void main(String[] args) 
    {
        int arr[] = {4,2,0};
        for(ArrayList<Integer> n: SubarrayList(arr))
        {
            System.out.println(n);
        }
        
        System.out.println(SubarrayList(arr));
    }

    public static ArrayList<ArrayList<Integer>> SubarrayList( int arr[])
    {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) 
        {
            int n = outer.size();
            for(int i = 0; i < n ; i++)
            {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }
}
