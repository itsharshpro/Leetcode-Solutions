public class Solution_744_Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'c';
        System.out.println(search(arr, target));
    }
    static char search(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        if(target>=arr[end] || target<arr[start]){
            return arr[0];
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]<=target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return arr[start];
    }
}
