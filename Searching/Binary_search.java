import java.util.Scanner;

public class Binary_search 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        //int[] arr = {1,3,4,5,6,7,8,99,101};
        int s = search(arr, 6, 0, arr.length-1);
        if(s != -1)
        {
            System.out.println("Element found: "+s);
        }
        else
        {
            System.out.println("Not fount: "+ s);
        }
        sc.close();
    }

    public static int search(int[] nums , int target , int s , int e)
    {
        if(s>e)
        {
            return -1;
        }

        int m = s + (e-s) / 2;

        if(nums[m] == target)
        {
            return m;
        }

        if(target < nums[m])
        {
            return search(nums, target, s, m-1);
        }
        
        return search(nums, target, m+1 , e); 
        
    }
}
