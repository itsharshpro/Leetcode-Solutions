public class Solution_1518_Water_Bottles {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(15, 4));
    }
    static public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles+((numBottles-1)/(numExchange-1));
    }
}
