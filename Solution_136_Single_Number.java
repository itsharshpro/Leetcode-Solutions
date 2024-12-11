public class Solution_136_Single_Number {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    static public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums){
            xor ^= i;
        }
        return xor;
    }
}
