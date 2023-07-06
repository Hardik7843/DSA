public class linear_search
{
    public static void main(String[] args) 
    {
        int arr[] = {4 , 5 ,6,8,1,7};
        int tar= 1;
        boolean a = IsAvl_range(arr , tar , 1 ,5);
        System.out.println(a);
        
    }

    public static boolean IsAvl(int arr[], int tar)
    {
        for(int i=0; i< arr.length ;)
        {
            if(arr[i]==tar)
            {
                return true;
            }
            else
            {
                i++;
            }
        }
        return false;
    }

    public static boolean IsAvl_range(int arr[], int tar , int s , int e)
    {
        for(int i=s; i<= e ;)
        {
            if(arr[i]==tar)
            {
                return true;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
}