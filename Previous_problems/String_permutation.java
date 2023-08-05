package Previous_problems;

import java.util.HashMap;
import java.util.Scanner;

public class String_permutation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(isPermutable(a, b));
        HashMap<Integer, Integer> j = new HashMap<>();
        j.put(1, 2);
        j.put(2, 21);
        j.put(3, 2);
        for (Integer i : j.keySet() )
        {
            System.out.println(i);
        }
    }

    public static boolean isPermutable(String a , String b)
    {
        HashMap<Character,Integer> A = new HashMap<>();
        HashMap<Character,Integer> B = new HashMap<>();

        for (int i = 0 ; i < a.length() ; i++)
        {
            char ac =  a.charAt(i);
            if(A.containsKey(ac))
            {
                A.replace(ac, A.get(ac)+1);
            }
            else
            {
                A.put(ac, 1);
            }

            char bc =  b.charAt(i);
            if(B.containsKey(bc))
            {
                B.replace(bc, B.get(bc)+1);
            }
            else
            {
                B.put(bc, 1);
            }
        }

        return A.equals(B);
    }
}
