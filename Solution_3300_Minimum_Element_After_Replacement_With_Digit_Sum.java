public class Solution_3300_Minimum_Element_After_Replacement_With_Digit_Sum {
    public static void main(String[] args) {
        int[] nums = {10,12,13,14};
        System.out.println(minElement(nums));
    }
    static public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            int x = nums[i];
            int sum = 0;
            while(x>0){
                int digit = x%10;
                sum+=digit;
                x = x/10;
            }
            if (sum<min){
                min = sum;
            }
        }
        return min;
    }
}
