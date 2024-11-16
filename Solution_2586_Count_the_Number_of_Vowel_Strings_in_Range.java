public class Solution_2586_Count_the_Number_of_Vowel_Strings_in_Range {
    public static void main(String[] args) {
        String[] words = {"hey","aeo","mu","ooo","artro"};
        int left = 1;
        int right = 4;
        
        int result = vowelStrings(words, left, right);
        System.out.println(result);
    }
    static public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i = left; i<=right; i++){
            if(vowel(words[i].charAt(0)) && vowel(words[i].charAt(words[i].length()-1))){
                count++;
            }
        }
        return count;
    }
    static public boolean vowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        else{
            return false;
        }
    }
}
