import java.util.Arrays;

public class Performance 
{
    public static void main(String[] args) 
    {
        // Code 1
        // This code has O(n*n) complexity
        // String s = "";
        // for (int i = 0; i < 26; i++) 
        // {
        //     char ch = (char)('a' + i);
        //     s = s + ch;
        // }
        // System.out.println(s);

        // Code 2
        // This O(n) complexity
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 26; i++) 
        // {
        //     char ch = (char)('a' + i);
        //       sb.append(ch);
        // }
        // System.out.println(sb);

        //Let's explore string little bit
        String s = "Hardik is great person";
        System.out.println("Index of letter k from start " + s.indexOf('k'));
        System.out.println("Indec of letter k from last "+s.lastIndexOf("s"));
        System.out.println("Character at specified index"+s.charAt(2));
        System.out.println("Hardik   ".strip());
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(Arrays.toString(s.split(" ")));
        System.out.println("Hardik");
    }
}
