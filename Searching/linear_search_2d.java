
import java.util.Arrays;

public class linear_search_2d 
{
    public static void main(String[] args) 
    {
        int arr[][] = { {1,2,11,3} , {4,5,6,7} , {78,8,9,10}};
        int x = 14;
        int ar[] = find_position(arr, x);
        System.out.println(Arrays.toString(ar));
    }

    public static boolean search_2d(int arr[][] , int tar )
    {
        for(int row=0;row < arr.length ; row++)
        {
            for(int col = 0 ; col < arr[row].length ; col++)
            {
                if(arr[row][col] == tar)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] find_position(int[][] arr, int tar )
    {
        for(int row=0;row < arr.length ; row++)
        {
            for(int col = 0 ; col < arr[row].length ; col++)
            {
                if(arr[row][col] == tar)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
