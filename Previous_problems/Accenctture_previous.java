package Previous_problems;

public class Accenctture_previous 
{
    public static void main(String[] args) 
    {
        int balaced_amount = BalanceFruite(4 , 8 , 6);
        System.out.println("Balanced amount: " + balaced_amount + " Rs");
    }


    public static int BalanceFruite(int a , int m , int rs)
    {
        if(a!=m)
        {
            if(a > m)
                return rs - (a-m); 
            if(a < m)
                return rs + (m-a);

        }
        return rs;
    }
}
