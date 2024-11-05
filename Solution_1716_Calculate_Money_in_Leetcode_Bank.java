public class Solution_1716_Calculate_Money_in_Leetcode_Bank {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(totalMoney(n));
    }
    static public int totalMoney(int n) {
        int sum =0;
        int x = n/7;
        int y = n%7;
        int z =0;
        for(int i=0; i<x; i++){
            z = z+1;
            sum += (7*(2*z+6))/2;
        }
        for(int i=0; i<y; i++){
            z++;
            sum += z;
        }
        
        return sum;
    }
}
