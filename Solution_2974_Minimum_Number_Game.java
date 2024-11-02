import java.util.Arrays;

public class Solution_2974_Minimum_Number_Game {
    public static void main(String[] args) {
        int[] nums = {5,4,2,3};
        System.out.println(Arrays.toString(numberGame(nums)));
    }
    static public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        int min = nums[0];


        for(int i = 1; i<nums.length; i=i+3){
            int x = 0;
            for(int j = 1; j<nums.length; j++){
                if(nums[j]<min){
                    min = nums[j];
                    x = j;
                }
                else{
                    continue;
                }
            }
            arr[i] = min;
            nums[x] = Integer.MAX_VALUE;

            min = nums[0];
            x = 0;
            for(int k = 1; k<nums.length; k++){
                if(nums[k]<min){
                    min = nums[k];
                    x = k;
                }
                else{
                    continue;
                }
            }
            arr[--i] = min;
            nums[x] = Integer.MAX_VALUE;
            min = nums[0];
        }
        return arr;
    }
}
