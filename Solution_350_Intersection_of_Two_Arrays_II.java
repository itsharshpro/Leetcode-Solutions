import java.util.Arrays;
public class Solution_350_Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(function(arr1 , arr2)));
    }
    static int[] function(int[] nums1, int[] nums2){
        int[] arr = new int[nums1.length];
        int x = 0;
        for (int k : nums1) {
            for (int j = 0; j < nums2.length; j++) {
                if (k == nums2[j]) {
                    arr[x] = k;
                    x++;
                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        int[] result = new int[x];
        System.arraycopy(arr, 0, result, 0, x);
        //System.arraycopy(source_arr, sourcePos, dest_arr, destPos, len);
        return result;
    }
    // 0 ms solution
    // static int[] function(int[] nums1, int[] nums2){
    //     int[] arr = new int[1001];
    //     int[] result = new int[1001];

    //     for (int num : nums1) {
    //         arr[num]++;
    //     }

    //     int ctr = 0;
    //     for (int num : nums2) {
    //         if (arr[num] > 0) {
    //             result[ctr++] = num;
    //             arr[num]--;
    //         }
    //     }

    //     return Arrays.copyOfRange(result, 0, ctr);
    // }
}
    
