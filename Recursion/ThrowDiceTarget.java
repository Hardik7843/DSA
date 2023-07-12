/*
 * Throwing dice: and listing the instances where the sum of numbers is equal to target or number itself is a target
 * 
 */
import java.util.ArrayList;
public class ThrowDiceTarget 
{
    public static void main(String[] args) 
    {
        int target = 7;
        // System.out.println(dice("", target));
        // DiceListPrint("", target);
        ArrayList<String> ans = DiceList_Faces(8, target, "");
        System.out.println(ans);
    }

    // It collects all permutiations in ArrayList and at last call of 
    // fucntion returns the final list. 
    public static ArrayList<String> dice(String p , int target )
    {
        if(target == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1 ; i <= 6 && i <= target; i++)
        {
            ans.addAll(dice(p+i, target-i));
        }
        return ans;
    }

    // This function doesn't return anything it is just for printing the stuff
    // it works same as the above function
    public static void DiceListPrint(String p , int target )
    {
        if(target == 0)
        {
            System.out.println(p);
            return;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1 ; i <= 6 && i <= target; i++)
        {
            DiceListPrint(p+i, target-i);
        }
    }

    // Let's make it more dynamic by giving the provision to change faces of dice
    // For example if there are more than 6 faces in the dice. I have attached the url of photo for the proof
    // https://www.google.com/search?q=8+faced+dice&oq=8+faced+dice&aqs=chrome..69i57.8031j0j1&sourceid=chrome&ie=UTF-8#imgrc=MzV6gs32NTWwdM
    public static ArrayList<String> DiceList_Faces( int faces , int target , String p)
    {
        if(target == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1 ; i <= faces && i <= target; i++)
        {
            ans.addAll(DiceList_Faces(faces,target-i , p+i ));
        }
        return ans;
    }
}
