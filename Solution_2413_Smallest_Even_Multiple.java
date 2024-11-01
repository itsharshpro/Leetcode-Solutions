public class Solution_2413_Smallest_Even_Multiple {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(smallestEvenMultiple(n));
    }
    static public int smallestEvenMultiple(int n) {
        if (n%2==0){
            return n;
        }
        else{
            return n*2;
        }
    }
}
