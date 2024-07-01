public class Solution_1550_Three_Consecutive_Odds {
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(function(arr));
    }
    static boolean function(int[] arr){
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                x++;
                if (x==3) {
                    return true;
                }
            }
            else{
                x=0;
            }
        }
        return false;
    }
}
