import java.util.ArrayList;
import java.util.List;

public class Solution_728_Self_Dividing_Numbers {
    public static void main(String[] args) {
        int left = 1;
        int right = 20;
        System.out.println(selfDividingNumbers(left, right));
    }
    static public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = left; i<=right; i++){
            boolean bool = false;
            int temp = i;
            while(temp>0){
                int digit = temp%10;
                if(digit==0){
                    bool = false;
                    break;
                }
                if(i%digit==0){
                    temp /= 10;
                    bool = true;
                    continue;
                }
                else{
                    bool = false;
                    break;
                }
            }
            if(bool){
                arr.add(i);
            }
        }
        return arr;
    }
}
