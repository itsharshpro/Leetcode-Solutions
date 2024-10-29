public class Solution_1512_Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
    static public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
