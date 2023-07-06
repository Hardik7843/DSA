import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Operators 
{
    public static void main(String[] args) 
    {
        // System.out.println('a' + 'b');
        // System.out.println("a" + "b");
        // System.out.println("a" + 1);
        // System.out.println('a' + 1);
        // System.out.println((int)'a');


        // System.out.println("Hardik" + new ArrayList<Integer>());
        // System.out.println("Hardik" + new Float(23.89f));

        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(3);
        HashSet<Integer> H = new HashSet<>();
        H.add(1);
        H.add(3);

        System.out.println(A + H.toString());
    }

    
}
