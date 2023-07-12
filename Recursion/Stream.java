public class Stream 
{
    public static void main(String[] args) 
    {
        String s1 = "Apple is";
        String s2 = "Mango is fruit";
        System.out.println(skipApple(s1));
        System.out.println(s2.startsWith("Apple"));
    }

    public static String rm_A(String str)
    {
        StringBuilder ans = new StringBuilder();
        ans = helper(ans, 0, str);
        return ans.toString();
    }

    public static StringBuilder helper(StringBuilder ans , int ptr , String str)
    {
        
        if(ptr == str.length())
        {
            // System.out.println(ptr);
            return ans;
        }

        if(str.charAt(ptr) == 'a' || str.charAt(ptr) == 'A')
        { 
            ptr++; 
            return helper(ans, ptr, str);
        }

        ans.append(str.charAt(ptr));
        ptr++;
        return helper(ans, ptr, str);
    }

    public static String skipApple(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }

        if(str.startsWith("apple") || str.startsWith("Apple"))
        {
            return skipApple(str.substring(5)); 
        }
        else
        {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }
}
