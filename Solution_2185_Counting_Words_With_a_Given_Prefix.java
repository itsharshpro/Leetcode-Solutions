public class Solution_2185_Counting_Words_With_a_Given_Prefix {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        System.out.println(prefixCount(words, "at"));
    }
    static public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String word: words){
            if(word.length()<pref.length()){
                continue;
            }
            if(word.substring(0,pref.length()).equals(pref)){
                count++;
            }
        }
        return count;
    }
}
