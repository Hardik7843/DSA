public class Digitsum
{
    
    
    public static void main(String[] args) 
    {
        // int j=456;
        // j = digitsum(j);
        // System.out.println(j);

        // concept(5);
        // int sld = 4561;
        // Rev2(893568393);
        // System.out.println(rev);
        int sdf = 456;
        System.out.println(Rev3(sdf));     
    }

    static int digitsum(int j)
    {
        if(j%10 == j) return j;
        int i = j % 10;
        int n = j / 10;
        return i * digitsum(n);
    }

    static void concept(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        concept(--n);
    }

    // public void Rev(int n)
    // {
    //     int LSD = 0;
    //     if(n % 10 == n)
    //     {
    //         rev = n*10 + rev;
    //     }
    //     LSD = n % 10;
    //     int rest = n / 10;
    //     rev = LSD*10 + rev ;
    // }

    // static void Rev2(int n)
    // {
    //     if(n == 0)
    //     {
    //         return;
    //     }
    //     int rem = n % 10;
    //     rev = rev*10 + rem;
    //     Rev2(n / 10);
    // }

    public static int Rev3(int j)
    {
        int digits = (int) Math.log10(j);
        return helper(j, digits);
    }

    public static int helper(int n, int digits)
    {
        if(n % 10 == n)
        {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits)) + helper( n / 10, digits - 1);
    }
}