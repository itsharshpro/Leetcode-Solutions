import java.util.ArrayList;
import java.util.List;

public class Solution_2942_Find_Words_Containing_Character {
    public static void main(String[] args) {
        String words[] = {"leet","code"};
        char x = 'e';
        System.out.println(findWordsContaining(words, x));
    }
    static public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<words.length; i++){
            for(int j = 0; j<words[i].length(); j++){
                if(words[i].charAt(j)==x){
                    arr.add(i);
                    break;
                }
            }
        }
        return arr;
    }
}
