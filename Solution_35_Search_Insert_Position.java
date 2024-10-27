public class Solution_35_Search_Insert_Position {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(arr, target));
    }
    static public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        if(nums[end]<target){
            return nums.length;
        }
        while(start<end){
            int mid = start+((end-start)/2);
            if (nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
