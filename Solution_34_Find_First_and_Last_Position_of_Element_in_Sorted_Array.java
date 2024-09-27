import java.util.Arrays;

public class Solution_34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int []ans = {-1,-1};
        int []nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        ans[0] = elementPosition(nums, target, true);
        if(ans[0]!=-1){
            ans[1] = elementPosition(nums, target, false);
        };
        System.out.println(Arrays.toString(ans));
    }
    static int elementPosition(int [] arr, int target, boolean findFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;

        while (start<=end){
            int mid = start + ((end-start)/2);
            if (target<arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
                if (findFirst){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
