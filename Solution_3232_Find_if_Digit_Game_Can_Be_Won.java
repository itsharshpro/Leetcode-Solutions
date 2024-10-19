public class Solution_3232_Find_if_Digit_Game_Can_Be_Won{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(canAliceWin(nums));
    }
    static public boolean canAliceWin(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i<nums.length; i++){
            if(nums[i]<10){
                sum1+=nums[i];
            }
            else{
                sum2+=nums[i];
            }
        }
        return ((sum1==sum2)?false:true);
    }
}