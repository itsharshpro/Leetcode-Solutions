public class Solution_1688_Count_of_Matches_in_Tournament {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(numberOfMatches(n));
    }
    static public int numberOfMatches(int n) {
        int total = 0;
        if(n==1){
            return 0;
        }
        else if(n%2==0){
            total+=(n/2)+numberOfMatches(n/2);
        }
        else{
            total+=((n-1)/2)+numberOfMatches(((n-1)/2)+1);
        }
        return total;
    }
}
