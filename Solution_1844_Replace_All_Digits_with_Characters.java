public class Solution_1844_Replace_All_Digits_with_Characters {
    public static void main(String[] args) {
        String s = "a1c1e1";
        System.out.println(replaceDigits(s));
    }
    static public char shift(char ch, int i){
        return (char)((int)ch+i);
    }
    static public String replaceDigits(String s) {
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            if(i%2==0){
                ans+=s.charAt(i);
            }
            else{
                ans+=shift(s.charAt(i-1), s.charAt(i)-'0');
            }
        }
        return ans;
    }
}
