package Previous_problems;

import java.util.HashSet;

public class name_proximity_score 
{
    public static void main(String[] args) 
    {
        String a = "Amitabh";
        String b = "Ajitbah";
        System.out.println(proximity_score(a, b));
    }

    public static int proximity_score(String a , String b)
    {
        a.toLowerCase();
        b.toLowerCase();
        int score = 0;
        HashSet<Character> mis_a = new HashSet<>();
        StringBuilder mis_b = new StringBuilder();
        for (int i = 0; i < a.length(); i++) 
        {
            if(a.charAt(i) == b.charAt(i)) score = score+ 2;
            else
            {
                mis_a.add(a.charAt(i));
                mis_b.append(b.charAt(i));
            }
        }
        for(int i = 0; i < mis_b.length() ; i++)
        {
            if(mis_a.contains(mis_b.charAt(i)))
            {
                score++;
            }
        }
        return score;

    }
}
