import java.util.Arrays;

public class FirstMissing
{
    public static void main(String[] args) 
    {
        // int arr[] = {3,4,-1,1};
        // int ans = firstMissing(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(ans);
        
        String a = new String("Hardik");
        String b = new String("Hardik");
        System.out.println(a==b);
        System.out.println(a.equals(b));

        String c = "Hardik is Great";
        String d = "Hardik is Great";
        System.out.print(c==d);
    }

    public static int firstMissing(int arr[])
    {
        int i = 0;
        while(i < arr.length)
        {
            if(arr[i] > 0 && arr[i] <= arr.length)
            {
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct])
                {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }
                else i++;
            }
            else i++;
        }

        for (int j = 0; j < arr.length; )
        {
            if(arr[j] != j+1)
            return j+1;
            else j++;
        }

        return -1;
    }
}
