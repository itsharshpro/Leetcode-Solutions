import java.util.List;

public class Solution_2828_Check_if_a_String_Is_an_Acronym_of_Words {
    public static void main(String[] args) {
        List<String> words = List.of("Hello", "World", "Wide", "Web");
        String s = "HWWW";
        System.out.println(isAcronym(words, s));
    }
    static public boolean isAcronym(List<String> words, String s) {
        String x = "";
        for(String str : words){
            x+=str.charAt(0);
        }
        if(s.equals(x)){
            return true;
        }
        return false;
    }
}
