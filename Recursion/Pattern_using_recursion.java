public class Pattern_using_recursion 
{
    public static void main(String[] args) 
    {
        printStar(8, 0);
    }

    public static void printStar(int row , int col)
    {
        if(col < row)
        {
            System.out.print("*");
            col++;
            printStar(row, col);
            return;
        }
        if( col == row )
        {
            row = row - 1;
            System.out.println();
            printStar(row, 0);
            return;
        }
    }
}
