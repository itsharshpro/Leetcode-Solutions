public class Solution_268_Missing_Number {
    public static void main(String[] args) {
        int []arr = {4,0,1,2};
        System.out.println(ans(arr));
        
    }
    static int ans(int []arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=arr.length){
                continue;
            }
            if(arr[i]!=i){
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
                i--;
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=i){
                ans = i;
                return ans;
            }
        }
        return arr.length;
    }
}
