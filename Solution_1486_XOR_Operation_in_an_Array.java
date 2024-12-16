public class Solution_1486_XOR_Operation_in_an_Array {
    public static void main(String[] args) {
        int n = 4;
        int start = 3;
        System.out.println(xorOperation(n, start));
    }
    static public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int ans = 0;
        for(int i = 0; i<n; i++){
            nums[i] = start + 2 * i;
        }
        for(int i = 0; i<n; i++){
            ans^=nums[i];
        }
        return ans;
    }
}
