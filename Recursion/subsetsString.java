/*
 * Abbrevations used:
 * String U_P = Un-Processed String
 * String P = Processed String
 */

import java.util.ArrayList;

public class subsetsString 
{
    public static void main(String[] args) 
    {
        String s = "abc";
        subseter("", "abc");
        System.out.print(ListSubset("", s));
    }

    public static void subseter(String P , String U_P)
    {
        if(U_P.isEmpty())
        {
            if(!P.isBlank()) 
            {
                System.out.println(P);
            }
            
            return;
        }
        
        char ch = U_P.charAt(0);

        subseter( P + ch , U_P.substring(1));
        subseter(P, U_P.substring(1));
    }

    public static ArrayList<String> ListSubset(String P , String U_P)
    {
        if(U_P.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            if(!P.isBlank()) 
            {
                list.add(P);
            }
            return list;
        }
        
        char ch = U_P.charAt(0);

       ArrayList<String> left = ListSubset( P + ch , U_P.substring(1));
       ArrayList<String> right = ListSubset(P, U_P.substring(1));

       left.addAll(right);

       return left;
    }
}
