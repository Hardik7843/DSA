import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class Solution
{
    public static void main(String[] args) 
    {
        int num1[] = {1,2,2,15,2};
        int num2[] = {2,2,2,9,8,7,9,2};
        int intersect[] = intersect(num1, num2);
        for(int j: intersect)
        {
            System.out.println(j);
        }
    }

    public static int[] intersect(int[] num1 , int[] num2)
    {
        HashMap<Integer , Integer> m1 = new HashMap<>();
        HashMap<Integer , Integer> m2 = new HashMap<>();

        counter(m1, num1);
        counter(m2, num2);
        HashMap<Integer , Integer> Final = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        if(m1.size() > m2.size())
        {
            //m1 -> big 
            //m2 -> smol
            Final = leveler(m1, m2);
        }
        else
        {
            //m2 -> big
            //m1 -> smol
            Final = leveler(m2, m1);
        }

        for(Map.Entry<Integer,Integer> e:Final.entrySet())
        {
            int k = e.getKey();
            int v = e.getValue();
            for(int i = 0 ; i < v ; i++)
            {
                ans.add(k);
            }
        }
        int[] answer = ans.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static HashMap<Integer , Integer> leveler(HashMap<Integer,Integer> big , HashMap<Integer , Integer> smol)
    {
        HashMap<Integer , Integer> Final = new HashMap<>();
        for(Map.Entry<Integer,Integer> e:smol.entrySet())
        {
            int val = e.getValue();
            int key = e.getKey();
            if(big.containsKey(key))
            {
                Final.put(key, Math.min(val , big.get(key)));
                // System.out.println("adding in FinalMap "+ key + "......." + " element: "+ added);
            }
        }
        return Final;
    }

    public static void counter(HashMap<Integer , Integer> map, int num[])
    {
        for(int i = 0 ; i < num.length ; i++)
        {
            if(map.containsKey(num[i]))
            {
                map.replace(num[i], map.get(num[i]), map.get(num[i])+ 1);
            }
            else
            {
                map.put(num[i], 1);
            }
        }
    }
}
