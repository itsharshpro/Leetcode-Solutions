public class Solution_852_Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,2,1};
        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
