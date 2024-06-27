public class Solution_1672_Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        if (accounts.length == 0) {
            return 0;
        }
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
                if (sum > max) {
                    max = sum;
                }
                else{
                    continue;
                }
            }
        }
        return max;
    }
}