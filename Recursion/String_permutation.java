import java.util.ArrayList;

public class String_permutation 
{
    public static void main(String[] args) {
        String s = "ABC";
        System.err.println(permutation("", s));
        
    }

    public static void print(String s)
    {
        System.out.println(s);
        return;
    }

    public static ArrayList<String> permutation(String P , String U_P)
    {
        if(U_P.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(P);
            return list;
        }

        char ch = U_P.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        int n = P.length();
        for(int i = 0 ; i <= n ; i++)
        {
            String NewCombo = P.substring(0, i) + ch + P.substring(i);
            ans.addAll(permutation(NewCombo, U_P.substring(1)));
        }
        return ans;

    }

}
