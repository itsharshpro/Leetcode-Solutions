public class Solution_1979_Find_Greatest_Common_Divisor_of_Array {
    public static void main(String[] args) {
        int[] nums = {2,5,6,9,10};
        System.out.println(findGCD(nums));
    }
    static public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }
        for(int i = min; i>0; i--){
            if(min%i==0 && max%i==0){
                return i;
            }
        }
        return 1;
    }
}