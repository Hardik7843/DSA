import java.util.ArrayList;



public class PhonePad 
{
    public static void main(String[] args) 
    {
        String s = "12";
        // int c =  (s.charAt(0) - '0');
        // System.err.println(c);
        
        
        System.out.println(padList("", s));
        
    }

    public static void print(String str)
    {
        System.out.print(str);
        return;
    }

    public static ArrayList<String> padList(String P , String U_P)
    {
        if(U_P.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(P);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        int digit = (int)U_P.charAt(0) - '0';
        for(int i = (digit-1)*3 ; i < digit*3 ; i++)
        {
            char ch = (char)('a' + i);
            ans.addAll(padList(P+ch, U_P.substring(1)));
        }

        return ans;
    }

    
}
