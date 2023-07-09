/*
 * Question link : https://practice.geeksforgeeks.org/problems/number-of-open-doors1552/1?page=1&difficulty[]=0&company[]=TCS&sortBy=submissions 
 * Asked in TCS
 */

package Previous_problems;

public class NumOfOpenDoor 
{
    public static void main(String[] args) 
    {
        Long N = 9L;
        int ans = noOfOpenDoors(N);
        System.out.println(ans);
    }
    static int noOfOpenDoors(Long N) 
    {
        // code here
        int n = N.intValue();
        boolean num[] = new boolean[n];
        // int arr[] = new int[n];
        int i = 1;
        int c = 0;
        while(i <= n)
        {
            for(int j = 0 ; j < num.length ; j++)
            {
                if((j+1)*i <= (n))
                {
                    c = toggle(num , j , c);
                    // System.out.println("Checking if");
                }
                // System.out.print("in for loop");
            }
            // System.out.print("in while loop");
            i++;
        }
        return c;
        
        
    }
    
    static int toggle(boolean array[] , int idx , int c)
    {
        if(array[idx])
        {
            array[idx] = false;
            c--;
        
        }
        else
        {
            array[idx] = true;
            c++;
        }
        return c;
    }
}
