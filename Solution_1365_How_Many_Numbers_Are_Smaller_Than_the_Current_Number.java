import java.util.Arrays;

public class Solution_1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            for(int num: nums){
                if(num<nums[i]){
                    count++;
                    continue;
                }
            }
            arr[i] = count;
            count = 0;
        }
        return arr;
    }
}
