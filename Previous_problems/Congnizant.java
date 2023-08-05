package Previous_problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Congnizant 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,1,2,3,3};
        isFrequencyUnique(5, arr);   
    }
    
    public static void isFrequencyUnique(int n, int[] arr) 
    {
        // code here
        HashMap<Integer , Integer> freq = new HashMap<>();
        HashSet<Integer> unq = new HashSet<>();
        
        for(int i = 0; i < n ; i++)
        {
            if(freq.containsKey(arr[i]))
            {
                int c = freq.get(arr[i]) + 1;
                freq.replace(arr[i] , c );
                
            }
            else
            {
                freq.put(arr[i] , 1);
            }
            System.out.println("i: " + i + ", element: " + arr[i] + ", frequency: " + freq.get(arr[i]));
        }
        
        ArrayList<Integer> all = new ArrayList<>(freq.values());
        for(int i = 0 ; i < all.size() ; i++)
        {
            if(unq.contains(all.get(i)))
            {
                System.out.println("Failed");
                return;
            }
            else
            {
                unq.add(freq.get(i));
            } 
        }
        
        System.out.println("Passed");
    }
}
        

