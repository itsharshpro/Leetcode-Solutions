public class Solution_1704_Determine_if_String_Halves_Are_Alike {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
    static public boolean halvesAreAlike(String s) {
        int num1 = countVowel(s.substring(0, s.length()/2));
        int num2 = countVowel(s.substring(s.length()/2));
        if(num1==num2){
            return true;
        }
        return false;
    }
    static public int countVowel(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            char x = str.charAt(i);
            if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
                count++;
            }
        }
        return count;
    }
}
