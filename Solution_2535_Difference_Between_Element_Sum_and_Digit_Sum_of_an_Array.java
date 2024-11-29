public class Solution_2535_Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {
    public static void main(String[] args) {
        int[] nums = {1,15,6,3};
        System.out.println(differenceOfSum(nums));
    }
    static public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int num: nums){
            elementSum += num;
            while(num>0){
                int digit = num%10;
                digitSum+=digit;
                num/=10;
            }
        }
        return Math.abs(elementSum-digitSum);
    }
}
