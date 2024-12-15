import java.util.Arrays;

public class Solution_1470_Shuffle_the_Array {
    public static void main(String[] args) {
        int nums[] = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    static public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int count = 0;
        for(int i = 0; i<n; i++){
            arr[count] = nums[i];
            arr[count+1] = nums[n+i];
            count+=2;
        }
        return arr;
    }
}
