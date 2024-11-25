public class Solution_2114_Maximum_Number_of_Words_Found_in_Sentences {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
    static public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(String str : sentences){
            int count = str.split(" ").length;
            maxCount = count>maxCount?count:maxCount;
        }
        return maxCount;
    }
}
