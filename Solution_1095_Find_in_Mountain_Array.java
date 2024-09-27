public class Solution_1095_Find_in_Mountain_Array {
    public static void main(String[] args) {
        int ans = -1;
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        int x = findPeakElement(arr);
        ans = orderAgnosticBinarySearch(arr, target, 0, x);
        if (ans==-1){
            ans =  orderAgnosticBinarySearch(arr, target, x+1, arr.length-1);
        }
        System.out.println(ans);
    }
    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if (nums[mid]>nums[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

    static int orderAgnosticBinarySearch(int []arr, int target, int start, int end){
        boolean inAsc = arr[start] < arr[end];

        while (start<=end){
            int mid = start + ((end-start)/2);

            if (target==arr[mid]){
                return mid;
            }
            if (inAsc){
                if (target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else {
                if (target>arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
