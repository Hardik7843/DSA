public class Fibonacci
{
    public static void main(String[] args) 
    {
        System.out.println(fibo(50));
        // System.out.print(fibo2(50));
    }

    public static int fibo(int n)
    {
        return (int) ((Math.pow((1+Math.sqrt(5))/2,n) - Math.pow((1-Math.sqrt(5))/2,n))/Math.sqrt(5)) ;
    }

    public static int fibo2(int n)
    {
        if(n < 2)
        {
            return n;
        }
        return fibo2(n-1)+fibo2(n-2);
    }
}
