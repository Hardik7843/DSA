

public class All_sorting
{
    public static void main(String[] args) 
    {
        int as[] = {2,-23,-23,53,56,70,-8};
        // SelectionSort(as);
        // InsertionSort(as);
        // BubbleSort(as);
        printArr(as);
        
    }
    
    public static void BubbleSort(int[] input)
    {
        for(int i=0;i<input.length-1;i++)
        {
            for(int j=0;j<input.length-i-1;j++)
            {
                if(input[j+1]<input[j])
                {
                    Swap(input, j+1, j);
                }
            }
        }
        
    }
    
    public static void InsertionSort(int[] input)
    {
        for(int i=1;i<input.length;i++)
        {
            int temp = input[i];
            int j = i-1;
            while(j>=0 && input[j]>temp)
            {
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = temp;
        }
    }

    public static void SelectionSort(int[] input)
    {
        for(int i=0;i<input.length-1;i++)
        {
            int min = input[i];
            int minIndex = i;
            for(int j=i+1;j<input.length;j++)
            {
                if(min>=input[j])
                {
                    min = input[j];
                    minIndex = j;
                }
            }
            Swap(input, i, minIndex);
        }
    }

    public static void MergeSort(int[] input)
    {

    }

    public static void Swap(int[] input , int index1 , int index2)
    {
        int temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
    }

    public static void printArr(int[] input)
    {
        for(int i=0;i<input.length;i++)
        {
            System.out.println(input[i]);
        }
    }

    
}
