import java.util.ArrayList;

public class arr {
    public static void main(String[] args) 
    {
        int n = 4;
        int q = 2;   
        int a[] =  { 1, 2, 3, 4};
        int queries[][] = {{0 ,3 ,101}, {0, 2 ,65}}; 
        i
        int ans[] = binaryQueries(n, a, q, queries);
        System.out.println(ans[0] + " " + ans[1]);

    }

    static int[] binaryQueries(int n, int[] a, int q, int[][] queries) 
    {
        // Write your code here.
        int ans[] = {0,0};
        int j = 0;
        while(j < q)
        {
            int sum = 0;
            int l = queries[j][0];
            int r = queries[j][1];
            int x = queries[j][2];
            int temp[] = new int[r-l+1];
            int k = 0;
            for(int i = l ; i < r ; i++)
            {
                temp[k] = a[i]^x;
                k++;
            }
            for(int i = 0; i < temp.length ; i++)
            {
                sum = (temp[i]|sum);
            }
            ans[j] = sum;
            j++;
        }
        return ans;
    }
}
