public class Solution_2778_Sum_of_Squares_of_Special_Elements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(sumOfSquares(nums));
    }
    static public int sumOfSquares(int[] nums) {
        int result = 0;
        for(int i = 1; i<nums.length+1; i++){
            if(nums.length%i==0){
                result+=nums[i-1]*nums[i-1];
            }
        }
        return result;
    }
}
