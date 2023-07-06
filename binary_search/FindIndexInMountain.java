public class FindIndexInMountain 
{
    public static void main(String[] args) 
    {
        int a = 2;
    }

    static int peakIndexMountain(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;
        while(start < end)
        {
            //Calculating mid in each loop
            int mid = start + (end - start) / 2 ;
            
            //Checking whether i am in decreasing part
            if(arr[mid+1] < arr[mid])
            {
                end = mid ;
            }
            //Else I would be in increasing part of array
            else
            {
                start = mid + 1;
            }
            //Below If condition is not needed because my while loop will terminate
            //When (start = end) 
            // if(start == end) break;
        }
        return start;
    }

    static int searchMountain(int arr[] , int target)
    {
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
                return mid;
            }
        }

        return -1;
    }
}
