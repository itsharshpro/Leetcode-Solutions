public class Solution_33_Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {7,8,9,0,1,2,3,4,5,6};
        int target = 0;
        System.out.println(rotatedArraySearch(arr, target));
    }
    static int rotatedArraySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=nums[start]){
                if (target>=nums[start]&&target<nums[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if (target>nums[mid]&&target<=nums[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
