public class Solution_58_Length_of_Last_Word {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
    static public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}