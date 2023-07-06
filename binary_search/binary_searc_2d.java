public class binary_searc_2d 
{
    public static void main(String[] args) 
    {
        int[][] matrix = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        System.err.println(matrix[2][2]);
        System.out.println(searchMatrix(matrix, 13));
    }

    public static boolean searchMatrix(int[][] arr, int target) 
    {
        // int rs = 0; // row start
        // int cs = 0; // columns start
        // int re = arr.length - 1; // row end
        // int ce = arr[0].length - 1; // column end
        // System.out.println("re: "+ re);
        // System.out.println("ce: "+ ce);

        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0; i < row ;)
        {
            for(int j = col-1; j >= 0 ;)
            {
                if(target < arr[i][j])
                {
                    j--;
                }
                else if(target > arr[i][j])
                {
                    i++;
                }
                else
                {
                    return true;
                }
                
            }
        }

        System.out.println("Hii");
        return false;
    }
}
