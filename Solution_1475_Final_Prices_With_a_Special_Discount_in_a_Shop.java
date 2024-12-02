import java.util.Arrays;

public class Solution_1475_Final_Prices_With_a_Special_Discount_in_a_Shop {
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        System.out.println(Arrays.toString(finalPrices(prices)));
    }
    static public int[] finalPrices(int[] prices) {
        for(int i = 0; i<prices.length; i++){
            int temp = i+1;
            while(temp<prices.length){
                if(prices[temp]<=prices[i]){
                    prices[i] = prices[i]-prices[temp];
                    break;
                }
                temp++;
            }
        }
        return prices;
    }
}
