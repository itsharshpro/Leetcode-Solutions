import java.util.List;

public class Solution_1773_Count_Items_Matching_a_Rule {
    public static void main(String[] args) {
        List<List<String>> items = List.of(
            List.of("phone", "blue", "pixel"),
            List.of("computer", "silver", "phone"),
            List.of("phone", "gold", "iphone")
        );
        String ruleKey = "type";
        String ruleValue = "phone";
        
        int result = countMatches(items, ruleKey, ruleValue);
        System.out.println(result);
    }
    static public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int x = 0;
        if(ruleKey.equals("color")){
            x = 1;
        }
        if(ruleKey.equals("name")){
            x = 2;
        }
        for(int i = 0; i<items.size(); i++){
            if(items.get(i).get(x).equals(ruleValue)){
                count++;
            }
            else{
                continue;
            }
        }
        return count;
    }
}
