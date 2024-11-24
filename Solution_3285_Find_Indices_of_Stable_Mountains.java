import java.util.ArrayList;
import java.util.List;

public class Solution_3285_Find_Indices_of_Stable_Mountains {
    public static void main(String[] args) {
        int[] height = {1,2,3,4,5};
        int threshold = 2;
        System.out.println(stableMountains(height, threshold));
    }
    static public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i<height.length; i++){
            if(height[i-1]>threshold){
                list.add(i);
            }
        }
        return list;
    }
}
