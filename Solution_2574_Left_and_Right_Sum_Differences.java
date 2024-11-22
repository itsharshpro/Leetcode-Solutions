import java.util.Arrays;

public class Solution_2574_Left_and_Right_Sum_Differences {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
    static public int[] leftRightDifference(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int leftsum = 0;
            for(int j = i-1; j>=0; j--){
                leftsum+=nums[j];
            }
            int rightsum = 0;
            for(int k = i+1; k<nums.length; k++){
                rightsum+=nums[k];
            }
            int result = Math.abs(leftsum-rightsum);
            arr[i] = result;
        }
        return arr;
    }
}
