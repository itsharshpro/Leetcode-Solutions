public class Solution_3190_Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(minimumOperations(nums));
    }
    static public int minimumOperations(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(num%3!=0){
                count++;
            }
        }
        return count;
    }
}
