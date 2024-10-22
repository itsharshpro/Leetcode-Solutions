public class Solution_2894_Divisible_and_Non_divisible_Sums_Difference {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        System.out.println(differenceOfSums(n, m));
    }
    static public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i<n+1; i++){
            if(i%m==0){
                num2+=i;
            }
            else{
                num1+=i;
            }
        }
        return num1-num2;
    }
}
