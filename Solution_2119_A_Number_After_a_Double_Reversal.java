public class Solution_2119_A_Number_After_a_Double_Reversal {
    public static void main(String[] args) {
        int num = 526;
        System.out.println(isSameAfterReversals(num));
    }
    static public boolean isSameAfterReversals(int num) {
        if(num%10==0 && num!=0){
            return false;
        }
        return true;
    }
}
