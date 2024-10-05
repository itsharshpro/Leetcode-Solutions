import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1380_Lucky_Numbers_in_a_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(arr));
    }
    public static List<Integer> luckyNumbers(int[][] arr) {
        List<Integer> l = new ArrayList<Integer>();
        int[][] colMax = new int[arr[0].length][arr.length];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                colMax[j][i] = arr[i][j];
            }
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j]==Arrays.stream(arr[i]).min().getAsInt() &&
                        arr[i][j]==Arrays.stream(colMax[j]).max().getAsInt()){
                    l.add(arr[i][j]);
                }
            }
        }
        return l;
    }
}
