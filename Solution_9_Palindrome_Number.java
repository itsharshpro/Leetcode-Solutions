public class Solution_9_Palindrome_Number {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    static public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp = x;
        int revNum = 0;
        while(x>0){
            int digit = x%10;
            revNum = (revNum*10)+digit;
            x/=10;
        }
        if(revNum==temp){
            return true;
        }
        return false;
    }
}
