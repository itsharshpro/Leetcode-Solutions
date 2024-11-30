public class Solution_2108_Find_First_Palindromic_String_in_the_Array {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
    static public String firstPalindrome(String[] words) {
        for(String word: words){
            String temp = "";
            for(int i = word.length()-1; i>=0; i--){
                temp += word.charAt(i);
            }
            if(word.equals(temp)){
                return word;
            }
        }
        return "";
    }
}
