public class Solution_2303_Calculate_Amount_Paid_in_Taxes {
    public static void main(String[] args) {
        int[][] brackets = {{3,50},{7,10},{12,25}};
        System.out.println(calculateTax(brackets, 10));
    }
    static public double calculateTax(int[][] brackets, int income){
        double ans = 0;
        if(brackets[0][0]>income) {
            return (double) income * brackets[0][1] / 100;
        }
        ans += (double) brackets[0][0] * brackets[0][1] / 100;
        for(int i=1; i<brackets.length; i++){
            if(brackets[i][0]<=income) {
                ans += (double) (brackets[i][0]-brackets[i-1][0]) * brackets[i][1] / 100;
            }
            else{
                ans += (double) (income-brackets[i-1][0]) * brackets[i][1] / 100;
                break;
            }
        }
        return ans;
    }
}
