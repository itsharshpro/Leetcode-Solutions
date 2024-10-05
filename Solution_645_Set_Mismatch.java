import java.util.Arrays;

public class Solution_645_Set_Mismatch {
    public static void main(String[] args) {
        int []arr = {1,2,2,4};
        ans(arr);
        System.out.println(Arrays.toString(ans(arr)));
    }
    static int[] ans(int []arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=i+1&&arr[i]!=arr[arr[i]-1]){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
                i--;
            }
        }
        int i = 0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                return new int[]{arr[i],i+1};
            }
            i++;
        }
        return new int[]{-1,-1};
    }
}
