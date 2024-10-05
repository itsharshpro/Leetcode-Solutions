import java.util.ArrayList;
import java.util.List;

public class Solution_442_Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        int []arr = {4,3,2,7,8,2,3,1};
        System.out.println(ans(arr));
    }
    static List<Integer> ans(int []arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=i+1&&arr[i]!=arr[arr[i]-1]){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
                i--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
