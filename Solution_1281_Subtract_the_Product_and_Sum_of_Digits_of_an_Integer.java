public class Solution_1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(solution(n));
    }
    static int solution(int n){
        int product = 1;
        int sum = 0;
        while (n>0){
            int digit = n%10;
            product *= digit;
            sum += digit;
            n = n/10;
        }
        return product - sum;
    }
}
