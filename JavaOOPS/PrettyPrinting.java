/*
** Placeholders in Java.
    %c - Character
    %d - Decimal number (base 10)
    %e - Exponential floating-point number
    %f - Floating-point number
    %i - Integer (base 10)
    %o - Octal number (base 8)
    %s - String
    %u - Unsigned decimal (integer) number
    %x - Hexadecimal number (base 16)
    %t - Date/time
    %n - Newline
    
    Reference : https://linuxhint.com/java-string-formatting/
                https://stackabuse.com/how-to-format-a-string-in-java-with-examples/
                
 */



public class PrettyPrinting
{
    public static void main(String[] args) 
    {
        float a = 3.454353f;
        // System.out.printf("Formatted number %.2f" , a);

        System.out.printf("%s is %s person" , "Hardik" , "Great");

    }
}