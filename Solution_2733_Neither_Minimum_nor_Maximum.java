public class Solution_2733_Neither_Minimum_nor_Maximum {
    public static void main(String[] args) {
        int[] arr = {3,30,24};
        System.out.println(findNonMinOrMax(arr));
    }
    static public int findNonMinOrMax(int[] nums) {
        if(nums.length>2){
            int min = nums[0];
            int max = nums[0];
            for(int i = 1; i<nums.length; i++){
                if(nums[i]<min){
                    min = nums[i];
                }
                else if(nums[i]>max){
                    max = nums[i];
                }
            }
            for(int num: nums){
                if(num!=min && num!=max){
                    return num;
                }
            }
        }
        return -1;
    }
}
