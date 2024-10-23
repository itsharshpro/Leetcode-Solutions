import java.util.ArrayList;
import java.util.List;

public class Solution_1431_Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        int max = candies[0];
        for(int num: candies){
            max = num>max?num:max;
        }
        for(int num: candies){
            if(num+extraCandies>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
