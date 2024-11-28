public class Solution_2520_Count_the_Digits_That_Divide_a_Number {
    public static void main(String[] args) {
        int num = 1248;
        System.out.println(countDigits(num));
    }
    static public int countDigits(int num) {
        int count = 0;
        int x = 0;
        int temp = num;
        while (temp>0){
            x = temp%10;
            temp/=10;
            if(num%x==0){
                count++;
            }
            
        }
        return count;
    }
}
