public class Solution_2000_Reverse_Prefix_of_Word {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(new Solution_2000_Reverse_Prefix_of_Word().reversePrefix(word, ch));
    }
    public String reversePrefix(String word, char ch) {
        String ans = "";
        boolean found = false;
        for(int i = 0; i<word.length(); i++){
            char x = word.charAt(i);
            if(x==ch){
                found = true;
                ans = x + ans;
                ans += word.substring(i+1);
                break;
            }
            else{
                ans = x + ans;
            }
        }
        if(found){
            return ans;
        }
        return word;
    }
}
