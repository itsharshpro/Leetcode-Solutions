import java.util.Arrays;

public class Solution_1509_Minimum_Difference_Between_Largest_and_Smallest_Value_in_Three_Moves {
    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 14, 15};
        System.out.println(function(nums));
    }
    static int function(int[] arr){
        int n = arr.length;
        int x = Integer.MAX_VALUE;
        if (n <= 4) return 0;
        Arrays.sort(arr);
        for (int i = 0; i < 4; ++i) {
            x = Math.min(x, arr[n - 4 + i] - arr[i]);
        }
        return x;
    }
}
