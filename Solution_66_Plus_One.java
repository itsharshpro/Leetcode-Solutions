import java.util.Arrays;

public class Solution_66_Plus_One {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    static public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--){
            digits[i] = ++digits[i];
            if(digits[i]==10){
                if(i!=0){
                    digits[i] = 0;
                    continue;
                }
                else{
                    int[] arr = new int[digits.length+1];
                    arr[0] = 1;
                    return arr;
                }
            }
            else{
                break;
            }
        }
        return digits;
    }
}
