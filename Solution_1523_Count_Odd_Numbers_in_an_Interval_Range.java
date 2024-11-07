public class Solution_1523_Count_Odd_Numbers_in_an_Interval_Range {
    public static void main(String[] args) {
        System.out.println(countOdds(3,7));
    }
    static public int countOdds(int low, int high) {
        if(low%2==0 && high%2==0){
            return (high-low)/2;
        }
        return (high-low)/2+1;
    }
}
