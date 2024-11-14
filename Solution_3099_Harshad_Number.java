public class Solution_3099_Harshad_Number {
    public static void main(String[] args) {
        System.out.println(sumOfTheDigitsOfHarshadNumber(18));
        System.out.println(sumOfTheDigitsOfHarshadNumber(19));
    }
    static public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp = x;
        int sum = 0;
        while(x>0){
            int digit = x%10;
            sum+=digit;
            x/=10;
        }
        if(temp%sum==0){
            return sum;
        }
        else{
            return -1;
        }
    }
}
