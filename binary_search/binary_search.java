package binary_search;

public class binary_search 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,8,69,95,96};
        int arr2[] = {98,91,75,65,6,5,4,3,2,1};
        // System.out.println("Index of element 97 is: "+bin_search_asc(arr, 97) );
        // System.out.println("Index of element 2 is: "+ bin_search(arr2, 2));
        // System.out.println("Index of element 96 is: "+ bin_search(arr, 96));
        // System.out.println("Ceiling of an element is: " + asc_cieling(arr, 7));
        // System.out.println("Flooring of an element is: " + asc_flooring(arr, 7));
        
    }


    // This is a binary search for ascending order only it won't work on sorted 
    // array in descending order
    static int bin_search_asc(int arr[] , int target)
    {
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end)
        {
            int mid = start + (end - start) / 2 ;
            
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else 
            {
                if(target == arr[mid]) return mid;
            }
        }

        return -1;
    }

    
    // This is a binary search for descending order only it won't work on sorted 
    // array in ascending order
    // 98,91,75,65,6,5,4,3,2,1
    static int bin_search_desc(int arr[] , int target)
    {
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end)
        {
            int mid = start + (end - start) / 2 ;
            
            if(target < arr[mid])
            {
                start = mid + 1;
            }
            else if(target > arr[mid])
            {
                end = mid - 1;
            }
            else 
            {
                if(target == arr[mid]) return mid;
            }
        }

        return -1;
    }

    // This function works for both ascending order and descending order.
    static int bin_search(int arr[] , int target)
    {
        int start = 0;
        int end = arr.length - 1;
        
        boolean isAscn  = arr[start] < arr[end];
        
        while(start <= end)
        {
            int mid = start + (end - start) / 2 ;
            
            if(arr[mid] == target) return mid;

            if(isAscn)
            {
                if(target < arr[mid])
                {
                    end = mid - 1;
                }
                else 
                {
                    start = mid + 1;
                }
            }
            else
            {
                if(target < arr[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
            
        }
        return -1;
    }

    // cieling of an element through binary element
    // Ceiling refers to an smallet element in the array which is greater than or equal to the target element
    // Basically the most closest element to target element if the target is not found. this closest element should 
    // Greater than target element
    static int asc_cieling(int arr[] , int target)
    {
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end )
        {
            int mid = start + (end - start) / 2 ;
            
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else 
            {
                if(target == arr[mid]) return arr[mid];
            }
        }
        return arr[start];
    }

    static int asc_flooring(int arr[] , int target)
    {
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end )
        {
            int mid = start + (end - start) / 2 ;
            
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else 
            {
                if(target == arr[mid]) return arr[mid];
            }
        }
        return arr[end];
    }

    

}


